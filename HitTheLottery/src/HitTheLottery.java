import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitTheLottery {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int x = 0;
            while(n != 0) {
            	if(n >= 100) {
            		x++;
            		n = n - 100;
            	}
            	if(n >= 20 && n < 100) {
            		x++;
            		n = n - 20;
            	}
            	if(n >= 10 && n < 20) {
            		x++;
            		n = n - 10;
            	}
            	if(n >= 5 && n < 10) {
            		x++;
            		n = n - 5;
            	}
            	if(n >= 1 && n < 5) {
            		x++;
            		n = n - 1;
            	}
            }
            System.out.println(x);
            
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
