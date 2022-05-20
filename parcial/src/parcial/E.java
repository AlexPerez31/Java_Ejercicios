package parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class E {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int q = Integer.parseInt(linea);
            long n;
            long h;
            int res[]= new int[q];
            int cc=0;
            for(int i = 0; i < q; i++) {
            	linea = br.readLine();
            	n = Long.parseLong(linea);
            	while(n!=1) {
                    if(n%2==0) {
                        n=n/2;
                        cc++;
                    }else if(n%3==0) {
                    	h = 2 *n;
                        n=h/3;
                        cc++;
                    }else if(n%5==0) {
                    	h = 4*n;
                        n= h/5;
                         cc++;
                    }else {
                         cc=-1;
                         n=1;
                    }
               }
            	res[i] = cc;
            	cc=0;
            }
            for(int i =0;i<q; i++) {
            	System.out.println(res[i]);
            }

            
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}
}


