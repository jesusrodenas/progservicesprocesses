package pps.u01.multiprocess;
/**
 * 
 */


import java.io.IOException;

/**
 * Perform a class whose main executes a native list of directories. It has to print the exit code. 
 * @author JESÚS
 *
 */
public class Exercise04 {
	public static void main(String[] args) {
		String[] command = {"ls", "--help"};
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		int exitStatus = 0;
		
		try {
			p = rt.exec(command);
			exitStatus = p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (exitStatus!=0) {
			System.out.println("This process has caused an error. Exit code: " + exitStatus);
		}
	}
}
