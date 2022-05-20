import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loterry {
	public static void main(String[] args) {
			 try {
		            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		            String linea;
		            linea = br.readLine();
		            int n = Integer.parseInt(linea);
		            int cont = 0;
		            while(n != 0) {
		                if(n >= 100) {
		                    n -= 100;
		                }
		                else {
		                if(n >= 20) {
		                        n = n- 20;
		               }
		               else {
		               if(n >= 10) {
		                        n = n - 10;
		               }
		               else {
		               if(n >= 5) {
		                         n = n - 5;
		                }
		                else {
		                    n = n - 1;
		                } } } }
		                cont++;
		            }
		            System.out.println(cont);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
