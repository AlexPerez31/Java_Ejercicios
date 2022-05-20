import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MarketingScheme {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            String res[] = new String[t];
            for(int i = 0; i < t; i++) {
            	linea = br.readLine();
            	String datos[] = linea.split(" ");
            	int l = Integer.parseInt(datos[0]);
            	int r = Integer.parseInt(datos[1]);
            	if(l * 2 > r) {
            		res[i] = "YES";
            	}else {
            		res[i] = "NO";
            	}
            }	
            for(int i = 0; i < t; i++) {
            	System.out.println(res[i]);
            }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}