/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scrapers;

import depgraphs.network.NetworkBuilder;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import lang.JavaDirectiveLexer;
import lang.JavaDirectiveParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Mat
 */
public class JavaScraper {
	public static void scrape(File f, Integer index, NetworkBuilder nb) {
		try {
			CharStream input = new ANTLRFileStream(f.getCanonicalPath());
			JavaDirectiveLexer lex = new JavaDirectiveLexer(input);
			CommonTokenStream tokens = new  CommonTokenStream(lex);
			JavaDirectiveParser parser = new JavaDirectiveParser(tokens);
			ParseTree pt = parser.lang_source();
			nb.visit(pt, index, f.getName());
		} catch (Exception ex) {
			Logger.getLogger(JavaScraper.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
