import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Translation {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			String sin = "";
			for(int i = s.length()-1; i >= 0; i--) {
						sin = sin + s.charAt(i);
			}
			if((s=br.readLine()).equals(sin)) {
					System.out.println("YES");
			}else {
					System.out.println("NO");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}