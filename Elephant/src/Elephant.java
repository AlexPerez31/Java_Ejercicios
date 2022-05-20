import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elephant {

	public static void main(String[] args) {
		
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            String color[][] = new String[8][8];
        	boolean b = false;
        	
            for(int i = 0; i < 8; i++ ) {
            	linea = br.readLine();
            	String datos[] = linea.split("");
            	for(int j = 0; j < 8; j++ ) {
            		color[i][j] = datos[j];
                }
            }
            
            for(int i = 0; i < 8; i++ ) {
            	for(int j = 1; j < 8; j++ ) {
            		if(color[i][j].equals(color[i][j-1])) {
            			
            			b = true;
            		}
                }
            }
            
            if(b == false) {
            	System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
            
            
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
