/**
 * 
 */
package pps.u02.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * @author JESÚS
 *
 */
public class Exercise01Thread extends Thread {
	@Override
	public void run() {
		try (FileWriter fw = new FileWriter("exercise01thread.log");){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			fw.write("Creating a File: " + new Date());
			fw.write("\n");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			fw.write("File successfully created." + new Date());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}