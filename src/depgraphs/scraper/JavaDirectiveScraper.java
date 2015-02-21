/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.visitors.tools.VisitorNode;
import depgraphs.visitor.JavaDirectiveVisitor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lang.JavaDirectiveLexer;
import lang.JavaDirectiveParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Mat
 */
public class JavaDirectiveScraper extends ScraperBase {
	@Override
	public VisitorNode scrape(File f) {
		try {
			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
			JavaDirectiveLexer lex = new JavaDirectiveLexer(input);
			CommonTokenStream tokens = new  CommonTokenStream(lex);
			JavaDirectiveParser parser = new JavaDirectiveParser(tokens);
			ParseTree pt = parser.lang_source();
			
			VisitorNode res = new VisitorNode();
			JavaDirectiveVisitor visitor = new JavaDirectiveVisitor(res);
			visitor.visit(pt);
			return res;
		} catch (IOException | RecognitionException ex) {
			Logger.getLogger(JavaDirectiveScraper.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	
	
}
