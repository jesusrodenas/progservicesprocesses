package pps.u01.multiprocess;
/**
 * 
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Perform a class whose main executes a native list of directories. It has to save the output in a File. 
 * @author JESÚS
 *
 */
public class Exercise05 {
	public static void main(String[] args) {
		String[] command = {"ls", "--help"};
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		int exitStatus = 0;
		
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter("error_output.txt"))) {
			p = rt.exec(command);
			exitStatus = p.waitFor();
			
			if (exitStatus!=0) {
				System.out.println("This process has caused an error.");
				
				InputStream is = p.getErrorStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String errorLine = "";
				
				while ((errorLine=br.readLine())!=null) {
					bfw.write(errorLine);
					bfw.newLine();
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
