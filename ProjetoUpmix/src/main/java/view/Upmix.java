
package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hamco
 */
public class Upmix {
    static final Runtime run = Runtime.getRuntime();
    static Process pro;
    static BufferedReader read;
  
	public static void Up(String path_in, String path_out) {
		String file_in = path_in;
		String file_out = path_out;
		String[] cmds = {
	            "cmd /c start cmd.exe",
	            "cmd /c start ffmpeg -y -i "+file_in+" -map 0:0 -filter_complex \"[0:1][0:2]join=inputs=2:channel_layout=stereo[FR]\" -filter_complex \"[0:1][0:2]join=inputs=2:channel_layout=stereo[FL]\" -filter_complex \"[0:1][0:2]amerge=inputs=2[C]\" -filter_complex  \"[0:1]lowpass=100:width_type=q:w=0.4,equalizer=f=100:width_type=q:width=2:g=3[LFE]\" -filter_complex \"[0:1]aecho=0.6:0.3:30:0.3[BL]\" -filter_complex \"[0:1]aecho=0.6:0.3:30:0.3[BR]\" -filter_complex [0:1]volume=0[M1] -filter_complex [0:1]volume=0[M2] -filter_complex [0:1]volume=0[M3] -filter_complex [0:1]volume=0[M4] -map 0:1 -map 0:2 -map 0:1 -map 0:2 -map [M1] -map [M2] -map [M3] -map [M4] -map 0:1 -map 0:2 -map [FL] -map [FR] -map [C] -map [LFE] -map [BL] -map [BR] -map s:s:? -map d:d:? -c:v copy "+file_out
	            };

	        try {
	            pro = run.exec(String.join(cmds[0], cmds[1]));

	            read = new BufferedReader(new InputStreamReader(pro.getInputStream()));
	            read.readLine();
	        } catch(IOException e) {
	            System.err.println(e);
	        }

	}  
}
