/**
 * 
 */
package pps.u01.multiprocess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author JESÚS
 *
 */
public class Exercise08 {

	/**
	 * @param args
	 */
	// macOS implementation
	public static void main(String[] args) {
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("/bin/bash");
		lCommand.add("-c");
		lCommand.add("echo $MY_NAME");

		ProcessBuilder pb = new ProcessBuilder(lCommand);

		Map<String, String> vEnt = pb.environment();
		vEnt.put("MY_NAME", "JESUS");

		pb.inheritIO();

		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
