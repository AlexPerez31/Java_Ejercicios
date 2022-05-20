import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetics {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			int t = Integer.parseInt(linea);
			String suma = "+"; 
			String resta = "-";
			String multiplicacion = "*";
			for(int i=0; i<t; t++) {
				linea = br.readLine();
				char ca[] = linea.toCharArray();
				for(int j= 0; j<linea.length(); j++) {
					ca[i] = linea.charAt(i);
					//if (ca[i] == linea) {
						
					}
				}
				
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
