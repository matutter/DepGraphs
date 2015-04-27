/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.data.VisualFQN;
import depgraphs.ui.graph.gImportContext;
import depgraphs.visitor.JavaVisitor;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import lang.JavaLexer;
import lang.JavaParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Mat
 */
public class JavaScraper extends Scraper<Optional<VisualFQN>> {
		public gImportContext ctx, head;
		
		public JavaScraper(gImportContext ctx) {
			this.ctx = ctx;
		}
		
		@Override
		public Optional<VisualFQN> scrape(File f) {
		try {
			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
			JavaLexer lex = new JavaLexer(input);
			CommonTokenStream tokens = new  CommonTokenStream(lex);
			JavaParser parser = new JavaParser(tokens);
			ParseTree pt = parser.compilationUnit();
			
			JavaVisitor visitor = new JavaVisitor();
			
			visitor.name = f.getName().replace(".java","");
			visitor.consumerCtx = ctx;
			visitor.visit(pt);
			try {
				visitor.jpackage.setLocal( visitor.imports );
				return Optional.ofNullable( visitor.jpackage );
			} catch( NullPointerException ex ) { System.err.println( f.getName() + " failed to parse " ); }
			
		} catch (IOException | RecognitionException ex) {
			Logger.getLogger(JavaDirectiveScraper.class.getName()).log(Level.SEVERE, null, ex);
		}
		return Optional.empty();
	}
}
