import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bananas {
	public static void main(String[] args) {
		 try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String linea;
	            linea = br.readLine();
	            String datos[] = linea.split(" ");
	            int k = Integer.parseInt(datos[0]);
	            int n = Integer.parseInt(datos[1]);
	            int w = Integer.parseInt(datos[2]);
	            int res;
	            res = -(n - (((w*(w+1))/2) * k));
	            
	            if(res < 0){
	    			System.out.println(0);
	    		}else{
	            	System.out.println(res);
	            } 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}