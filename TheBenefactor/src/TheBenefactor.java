import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBenefactor {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            for(int p = 0; p < t; p++) {
                linea = br.readLine();
                int n = Integer.parseInt(linea);
                for(int g = 0; g < n ; g++) {
                	int a[] = new int[n+1];
                	int b[] = new int[n+1];
                	int l[] = new int[n+1];
                	int res = 0;
                	int ca[] = new int[n+1];
                	int cb[] = new int[n+1];
                	ca[0] =  a[0];
                	cb[0] =  b[0];
                	for(int i =1; i<n; i++) {
                		
                		if(ca[i-1]  == a[i]) {
                			
                		}
                		if(cb[i-1]  == a[i]) {
                			
                		}
                		if(ca[i-1]  == b[i]) {
                			
                		}
                		if(cb[i-1]  == b[i]) {
                			
                		}
                		
                		
                	}
                	
                	
                	
                }
            	
            }
		
		
		
		
		
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
