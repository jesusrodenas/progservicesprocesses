package pps.u01.multiprocess;
/**
 * 
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform a class that executes firefox application.
 * @author JESÚS
 *
 */
public class Exercise01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Process p = null;
		List<String> command = new ArrayList<String>();
		command.add("open");
		command.add("-a");
		command.add("Firefox.app");
		
		String[] cmd = new String[3];
		cmd[0] = "open";
		cmd[1] = "-a";
		cmd[2] = "Firefox.app";
		
		try {
			p = Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}