import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DominoPiling {

	public static void main(String[] args) {

		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
    		int aux;
    		int aux2;
            int t = Integer.parseInt(linea);
        	boolean bo[] = new boolean[t+1];
            for(int h = 0; h < t; h++) {
            	bo[h] = true;
            	linea = br.readLine();
                int n = Integer.parseInt(linea);
                	linea = br.readLine();
                	String datos[] = linea.split(" ");
                	int a[] = new int[n+1];
                	for(int w = 0; w < n; w++) {
                		a[w] =  Integer.parseInt(datos[w]) ;
                	}
                	linea = br.readLine();
                	String datos1[] = linea.split(" ");
                	int b[] = new int[n+1];
                	for(int w = 0; w < n; w++) {
                		b[w] =  Integer.parseInt(datos1[w]) ;
                	}
                if(n>1) {
                	for(int i = 1; i < n; i++) {
                		for(int j = 0; j < n-1; j++) {
                		if(a[i] < a[j] && b[i] != b[j]) {
                			aux = a[j];
                			a[j] = a[i];
                			a[i] =  aux;
                			aux2 = b[j];
                			b[j] = b[i];
                			b[i] =  aux2;
                		}
                		}
                	}
                	for(int i = 1; i < n; i++) {
                		if(a[i] < a[i-1]) {
                			bo[h] = false;
                		}
                	}
                }
            }
            for(int h = 0; h < t; h++) {
            	if(bo[h] == false) {
            		System.out.println("No");
            	}else {
            		System.out.println("Yes");
            	} 
            } 
            
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		

	}

}
