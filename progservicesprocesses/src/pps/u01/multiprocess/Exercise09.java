/**
 * 
 */
package pps.u01.multiprocess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JESÚS
 *
 */
public class Exercise09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("/Users/jesusrodenasjaque/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.macosx.x86_64_18.0.2.v20221005-1040/jre/bin/java");
		lCommand.add("pps.u01.multiprocess.Exercise02");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		
		String classpath = "/Users/jesusrodenasjaque/git/progservicesprocesses/progservicesprocesses/bin";
				
		pb.environment().put("CLASSPATH", classpath);
		pb.inheritIO();
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
