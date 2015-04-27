/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.env;
import depgraphs.eventful.EventAdapter;
import depgraphs.visitor.JavaDirectiveVisitor;
import java.io.File;
import java.io.IOException;
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
public class JavaDirectiveScraper
//extends Scraper
{
//	@Override
//	public void scrape( File f, EventAdapter adapter ) {
//		try {
//			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
//			JavaDirectiveLexer lex = new JavaDirectiveLexer(input);
//			CommonTokenStream tokens = new  CommonTokenStream(lex);
//			JavaDirectiveParser parser = new JavaDirectiveParser(tokens);
//			ParseTree pt = parser.lang_source();
//			
//			JavaDirectiveVisitor visitor = new JavaDirectiveVisitor();
//			visitor.useAdapter(adapter);
//			visitor.visit(pt);
//		} catch (IOException | RecognitionException ex) {
//			env.log( f.getName() + " FAIL" );
//		}
//	}
	
	
}
