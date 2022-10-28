package pps.u01.multiprocess;
/**
 * 
 */


import java.io.BufferedReader;import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Perform a class whose main executes a native list of directories. It has to save the output in a File. 
 * @author JESÚS
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		String[] command = {"ls", "-la"};
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		BufferedReader br = null;
		
		try (FileWriter fw = new FileWriter("list_directories_output.txt")) {
			p = rt.exec(command);
			InputStream is = p.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(is));

			String line;
			while ((line = br.readLine())!=null) {
				fw.write(line);
				fw.write("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
