/**
 * 
 */
package pps.u01.multiprocess;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JESÚS
 *
 */
public class Exercise07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// macOS implementation.
		File userDir = new File("/Users/jesusrodenasjaque");		
		
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("ls");
		lCommand.add("ls");
		
		System.out.println("Command is going to be executed: " + lCommand);
		
		ProcessBuilder pb = new ProcessBuilder(lCommand); 
		pb.directory(userDir);
		
		File fOut = new File("exercise09_output.txt");
		File fErr = new File("exercise09.log");		
		
		pb.redirectOutput(Redirect.appendTo(fOut));
		pb.redirectError(Redirect.appendTo(fErr));
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
