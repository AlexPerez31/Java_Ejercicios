import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            linea = br.readLine();
            String datos[] = linea.split(" ");
            int a[] = new int[datos.length];
            int con = 0;
            for(int i= 0; i <datos.length; i++) {
            	a[i] = Integer.parseInt(datos[i]);
            }
            for(int i=1; i<=n; i++) {
                boolean b = false;
            	for(int j=0; j<n; j++) {
                	if(a[j] == i) {
                		b = true;
                	}
                }
            	if(b == false) {
            		con ++;
            	}
            }
            System.out.println(con);  
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
