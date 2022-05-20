package parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class C {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int a = 0; int b = 0;
            boolean bb = false;
            int i = 0;
            int c = 0, cb = 0;
            while(bb==false) {
            	bb=false;
            	c=0;
            	cb= 0;
            	i++;
            	a=i;
            	b=a+n;
            	for(int j = 1; j <= a; j++)
            	{
            	    if((a % j) == 0){
            	        c++;
            	    }
            	}
            	for(int j = 1; j <= b; j++)
            	{
            	    if((b % j) == 0){
            	        cb++;
            	    }
            	}

            	if(c > 2 && cb > 2)
            	{
            		bb=true;
            	}
            	
            }

            System.out.println(b + " " + a);

            
	} catch (IOException e) {
	    e.printStackTrace();
	}


	}
}