package parcial20202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int a[] = new int[n];
            int h = 0;
            int c = 0;
            linea = br.readLine();
            String[] datos = linea.split(" ");
            for(int i = 0; i <n; i++) {
            	a[i] = Integer.parseInt(datos[i]);
            	if(a[i] < 0 && c == 0) {
            		h = h+a[i];
            		
            	}else if(a[i] < 0 && c > 0){
            		c = c + a[i];
            		if(c<0) {
                		h = h + c;
                		c = 0;
                	}
            	}else if(a[i] > 0) {
            		c = c + a[i];
            	}
            }
            
            System.out.println(h*-1);
            
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
