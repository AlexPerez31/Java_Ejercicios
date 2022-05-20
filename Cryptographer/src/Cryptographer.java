import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cryptographer {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			int n = Integer.parseInt(linea);
			n = n+1;
			
			System.out.println(n);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
