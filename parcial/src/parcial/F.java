package parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class F {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            String[] datos = linea.split(" ");
            int w = Integer.parseInt(datos[0]);
            int h = Integer.parseInt(datos[1]);
            linea = br.readLine();
            String[] datos2 = linea.split(" ");
            int d[] = new int[2];
            int u[] = new int[2];
            for(int i= 0; i < 2; i++) {
            	u[i] = Integer.parseInt(datos2[0]);
            }
            String[] datos3 = linea.split(" ");
            for(int i= 0; i < 2; i++) {
            	d[i] = Integer.parseInt(datos3[0]);
            }
            for(int i = h; i >= 1; i--) {
                w = w + i;
                if(i == u[1]) {
                    w -= u[0];
                }else if(i == d[1]) {
                    w -=  u[1];
                }
                if(w < 0) {
                    w = 0;
                }
            }
            System.out.println(w);
            
	} catch (IOException e) {
	    e.printStackTrace();
	}

	}

}