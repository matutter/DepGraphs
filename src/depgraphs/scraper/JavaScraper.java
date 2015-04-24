/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.eventful.EventAdapter;
import depgraphs.visitor.JavaVisitor;
import java.io.File;
import java.io.IOException;
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
public class JavaScraper extends Scraper {
		@Override
		public void scrape(File f, EventAdapter adapter) {
		try {
			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
			JavaLexer lex = new JavaLexer(input);
			CommonTokenStream tokens = new  CommonTokenStream(lex);
			JavaParser parser = new JavaParser(tokens);
			ParseTree pt = parser.compilationUnit();
			
			JavaVisitor visitor = new JavaVisitor( f.getName().replace(".java", "") );
			visitor.visit(pt);
			
			Collector<String> col = visitor.collect();
//			System.out.println( col.toString() );
			
		} catch (IOException | RecognitionException ex) {
			Logger.getLogger(JavaDirectiveScraper.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
