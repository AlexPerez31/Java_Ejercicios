import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cakeminator {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            String datos[] = linea.split(" ");
            int r = Integer.parseInt(datos[0]);
            int c = Integer.parseInt(datos[1]);
            String pas [][] = new String [r][c];
            int cont = 0;
    		boolean b;
            
           for(int i= 0; i<r; i++) {
            	linea = br.readLine();
        		String cel[] = linea.split("");
            	for(int j= 0; j<c; j++) {
                	pas[i][j] = cel[j];
                }
            }
           
           for(int i= 0; i<r; i++) {
        	    b = false;
           		for(int j= 0; j<c; j++) {
	           		if(pas[i][j].equals("S")) {
	           			b = true;
	           		}
           		}
           		if(b == false) {
           			for(int j= 0; j<c; j++) {
           				pas[i][j] = "l";
           				cont ++;
               		}	
           		}
           }
           
           for(int j= 0; j<c; j++) {
       	    b = false;
          		for(int i= 0; i<r; i++) {
	           		if(pas[i][j].equals("S")) {
	           			b = true;
	           		}
          		}
          		if(b == false) {
          			for(int i= 0; i<r; i++) {
          				if(!(pas[i][j]).equals("l")) {
          					cont ++;
          				}
              		}	
          		}
          } 
           System.out.println(cont);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
