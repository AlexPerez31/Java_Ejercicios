import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CopyPaste {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            int x[] = new int[t];
            int n[] = new int[t];
            for(int v = 0; v < t; v++) {
            	linea = br.readLine();
            	String datos[] = linea.split(" ");
            	n[v] = Integer.parseInt(datos[0]);
            	int k = Integer.parseInt(datos[1]);
            	linea = br.readLine();
            	String datos2[] = linea.split(" ");
            	int a[] = new int[n[v]];
            	for(int i = 0; i < n[v]; i++) {
            		a[i] = Integer.parseInt(datos2[i]);
            	}
            	x[v] = 0;
            	Arrays.sort(a);
            	for(int i = 1; i < n[v]; i++) {
            		while(a[i]<=k) {
            			x[v]++;
            			a[i]=a[i]+a[0];
            		}
            	}	
            }
            for(int v = 0; v < t; v++) {
            	x[v] = x[v] - (n[v]-1);
            	if(x[v] < 0) x[v] = 0;
            	System.out.println(x[v]);
        	} 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}