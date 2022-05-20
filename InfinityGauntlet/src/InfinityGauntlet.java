import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfinityGauntlet {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int m = 6 - n;
            boolean[] t = new boolean[6];
            for(int i =0; i < n; i++) {
            	linea = br.readLine();
            	if(linea.equals("purple")) {
            		t[0] = true;
            	}
            	if(linea.equals("green")) {
            		t[1] = true;
            	}
            	if(linea.equals("blue")) {
            		t[2] = true;
            	}
            	if(linea.equals("orange")) {
            		t[3] = true;
            	}
            	if(linea.equals("red")) {
            		t[4] = true;
            	}
            	if(linea.equals("yellow")) {
            		t[5] = true;
            	}
            }
            System.out.println(m);
            if(t[0] == false) {
        		System.out.println("Power");
        	}
            if(t[1] == false) {
        		System.out.println("Time");
        	}
            if(t[2] == false) {
        		System.out.println("Space");
        	}
            if(t[3] == false) {
        		System.out.println("Soul");
        	}
            if(t[4] == false) {
        		System.out.println("Reality");
        	}
            if(t[5] == false) {
        		System.out.println("Mind");
        	}
            
          
		 } catch (IOException e) {
			 e.printStackTrace();
		 
	
		}
	}
}
