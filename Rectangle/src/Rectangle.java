import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

	public static void main(String[] args) {
		
		
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String linea = br.readLine();
				int t = Integer.parseInt(linea);
				int n;
				for(int i=0; i<t; t++) {
					int c = 1;
					
					
					String cuenta[] = new String [100];
					String res[] = new String [100];
					linea = br.readLine();
					n = Integer.parseInt(linea);
					for(int j=0; j<n; j++) {
						linea = br.readLine();
						cuenta[j] = linea;
					/*
						
						if(j>0) {
							if( j== 1 && cuenta[j] != cuenta[j-1]){
								res[0] = cuenta[0] + "" + c;
							}
							if(cuenta[j] == cuenta[j-1]) {
								c ++;
								res[j] = cuenta[j] + "" + c;
							}else if(cuenta[j] != cuenta[j-1]) {
								c =1;
								res[j] = cuenta[j] + "" + c;
							}	
					}
					
					Collections.sort(cuenta);
					 
					*/
					
					linea = br.readLine();
					
					for(int k =0; k<n; k++) {
						System.out.println(res[k]);
					}
					}
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		

	}

}
