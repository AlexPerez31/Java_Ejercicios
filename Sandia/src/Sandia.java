import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sandia {

	public static void main(String[] args) {
		
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int w = Integer.parseInt(linea);
            if(w>2) {
	            if(w%2==0) {
	                System.out.println("YES");
	            }else
	                System.out.println("NO");
	            }else
            	 System.out.println("NO");
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		

	}

}
