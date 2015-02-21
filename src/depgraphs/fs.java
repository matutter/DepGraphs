/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs;

import java.io.File;
import java.util.Collection;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

/**
 *
 * @author Mat
 */
public class fs {
	public static Collection<File> getSources( String path, String ext ) {
		Collection<File> files = FileUtils.listFiles(
			new File(path), 
			new RegexFileFilter("^(.*?)"+ext), 
			DirectoryFileFilter.DIRECTORY
		);
		return files;
	}
}
