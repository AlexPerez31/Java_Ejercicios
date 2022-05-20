import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmasB {

	public static void main(String[] args) {
		 try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String linea;
	            linea = br.readLine();
	            int t = Integer.parseInt(linea);
	            int a;
	            int b;
	            while(t-- > 0) {
	            	linea = br.readLine();
	            	String datos[] = linea.split(" ");
	            	a = Integer.parseInt(datos[0]);
	            	b = Integer.parseInt(datos[1]);
	            	System.out.println(a+b);
	            }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
