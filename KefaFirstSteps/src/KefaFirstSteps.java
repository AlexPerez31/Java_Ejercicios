import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KefaFirstSteps {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            linea = br.readLine();
            String[] datos = linea.split(" ");
            int num[] = new int[n];
	        for(int i = 0; i < n; i++) {
	           num[i] = Integer.parseInt(datos[i]);
	        }
	            int x = 1, t = 1;
	            for(int i = 0; i < n-1; i++) {
	            	if(num[i] <= num[i+1]) {
	            		t++;
	            	}else {
	            		t=1;
	            	}
	            	if(t > x) {
	            		x = t;
	            	}
	            }
	            	System.out.println(x);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}
