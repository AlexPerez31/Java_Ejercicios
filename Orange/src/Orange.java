import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Orange {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            String datos[] = linea.split(" ");
            int n = Integer.parseInt(datos[0]);
            int k = Integer.parseInt(datos[1]);
            linea = br.readLine();
            String dat[] = linea.split(" ");
            int[] d = new int[k*n];
            for(int i = 1; i <= k*n; i++) {
            	d[i-1] = i;
            }
            int aux = 0;
            for(int i = 0; i < k; i++ ) {
            	System.out.print(dat[i]);
                int cont = 0;
            	for(int j = aux; j < n*k; j++) {
                	boolean b = false;
            		for(int w=0; w<k; w++ ) {
            			if((Integer.parseInt(dat[w])) == d[j]){
                			b = true;
                		}
            		}
            		if(b == false) {
            			System.out.print(" " + d[j]);
            			cont ++;
            		}
            		if(cont > n-2) {
            			j = n*k;
            		}
            		aux ++;
            	}
            	System.out.println();	
                }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}
