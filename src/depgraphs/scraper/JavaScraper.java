/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.visitors.tools.VisitorNode;
import depgraphs.visitor.JavaVisitor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lang.JavaDirectiveLexer;
import lang.JavaDirectiveParser;
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
public class JavaScraper extends ScraperBase {
		@Override
		public VisitorNode scrape(File f) {
		try {
			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
			JavaLexer lex = new JavaLexer(input);
			CommonTokenStream tokens = new  CommonTokenStream(lex);
			JavaParser parser = new JavaParser(tokens);
			ParseTree pt = parser.compilationUnit();
			
			VisitorNode res = new VisitorNode();
			JavaVisitor visitor = new JavaVisitor(res);
			visitor.visit(pt);
			return res;
		} catch (IOException | RecognitionException ex) {
			Logger.getLogger(JavaDirectiveScraper.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}