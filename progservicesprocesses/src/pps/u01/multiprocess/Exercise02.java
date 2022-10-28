package pps.u01.multiprocess;
/**
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Perform a class whose main executes a native list of directories
 * @author JESÚS
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		String[] command = {"ls", "-la"};
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		BufferedReader br = null;
		
		try {
			p = rt.exec(command);
			InputStream is = p.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(is));

			String line;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
