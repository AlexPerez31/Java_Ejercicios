import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonSubsequence {

	public static void main(String[] args) {
		 try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String linea;
	            linea = br.readLine();
	            int t = Integer.parseInt(linea);
	            int[] c = new int[t];
	            int[] x = new int[t];
	            for(int i = 0; i < t ; i++) {
	            	x[i] =0;
	            	linea = br.readLine();
		            String datos[] = linea.split(" ");
		            int na = Integer.parseInt(datos[0]);
		            int nb = Integer.parseInt(datos[1]);
		            linea = br.readLine();
		            String datosa[] = linea.split(" ");
		            int a[] = new int[na];
		            int b[] = new int[nb];
		            for(int j =0 ; j < na; j ++) {
		            	a[j] = Integer.parseInt(datosa[j]);
		            }
		            linea = br.readLine();
		            String datosb[] = linea.split(" ");
		            for(int j =0 ; j < nb; j ++) {
		            	b[j] = Integer.parseInt(datosb[j]);
		            }
		            for(int j = 0; j < na; j++) {
		            	for(int h = 0; h < nb; h++) {
			            	if(b[h]==a[j]) {
			            		c[i] = b[h];
			            		x[i] = 1;
			            	}
			            }
		            }
	            }
	            for(int j = 0 ; j < t; j ++) {
	            	if(x[j] == 1) {
	            		System.out.println("YES");
	            		System.out.println(x[j] + " " + c[j]);
	            	}else {
	            		System.out.println("NO");
	            	}
	            }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
