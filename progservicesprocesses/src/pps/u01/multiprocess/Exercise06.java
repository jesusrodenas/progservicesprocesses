package pps.u01.multiprocess;
/**
 * 
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Perform a class whose main obtains all the environment parameters using ProcessBuilder utilities. 
 * @author JESÚS
 *
 */
public class Exercise06 {
	public static void main(String[] args) {
		// First of all, we're going to list the environment variables.
		ProcessBuilder pbEnvironment = new ProcessBuilder();		
		Map<String, String> env = pbEnvironment.environment();
		
//		env.forEach((key, value) -> System.out.println(key + ": " + value));
		
		// After that, we're going to use other ProcessBuilder to do the second part of the exercise.
		// 1) Create a folder.
		File myFolder = new File("myfolder");
		myFolder.mkdir();
		
		// 2) Create the output file into myfolder folder.
		File myouput = new File(myFolder, "java_output_file.txt");
		try {
			myouput.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3) Directory to list (upper)
		File upperFolder = new File("/");
		
		List<String> command = new ArrayList<String>();
		command.add("ls");
		command.add("-la");
		
		ProcessBuilder pbLsLa = new ProcessBuilder(command);
		pbLsLa.directory(upperFolder);
		pbLsLa.redirectOutput(myouput);
		
		try {
			long startTime = System.currentTimeMillis();
			Process p = pbLsLa.start();
			int exitStatus = p.waitFor();
			long finishTime = System.currentTimeMillis();
			
			System.out.println("The process' long is: " + (finishTime-startTime) + " milliseconds with a status of: " + exitStatus);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}