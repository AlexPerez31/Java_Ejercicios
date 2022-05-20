package parcial20202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int r[] = new int[n];
            int t=0;
            int a = 0;
            int b= 0;
            for(int i = 0; i < n; i++) {
            	linea = br.readLine();
            	String[] datos = linea.split(" ");
                a = Integer.parseInt(datos[0]);
                b = Integer.parseInt(datos[1]);
                t = t - a + b;
                r[i] = t;
            }
            Arrays.sort(r);
            System.out.println(r[n-1]);
            
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

}
