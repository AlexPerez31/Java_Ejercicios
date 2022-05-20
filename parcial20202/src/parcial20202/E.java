package parcial20202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            int r = 0;
            for(int i = 0; i <t; i++) {
            	linea = br.readLine();
                String[] datos = linea.split(" ");
                int a = Integer.parseInt(datos[0]);
                int b = Integer.parseInt(datos[1]);
                if(a < b) {
                	r = b -a ;
                }else if(a == b) {
                	r = 0;
                }else if(a > b){
                	while(a>b) {
                		r ++;
                		a = a-2;
                	}
                	System.out.println(r);
                	if(a < b) {
                		r = r + (b-a);
                	}
                }
                System.out.println(r);
            }
            
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
