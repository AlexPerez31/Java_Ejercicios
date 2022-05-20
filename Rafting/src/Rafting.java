import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Rafting {
	public static void main(String[] args) {
		try{
        //    BufferedReader br = new BufferedReader(new FileReader("rafting.in"));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            while((linea=br.readLine())!=null){
            	int s = Integer.parseInt(linea);
            	int n;
            	int w;
            	for (int i = 0;  i<s; i++) {
            		int res = 0;
            		linea = br.readLine();
            		String datos[] = linea.split(" ");
            		n = Integer.parseInt(datos[0]);
            		w = Integer.parseInt(datos[1]);
            		int p[] = new int [n];
            		linea = br.readLine();
            		String pesos[] = linea.split(" ");
            		for (int j = 0;  j < n ; j++) {
            			p[j] = Integer.parseInt(pesos[j]);
            			
            		}
            		if (p[n-1] > w) {
            			System.out.println("IMPOSSIBLE");
        			}else {
        				Arrays.sort(p);
                		int g = 0; 
                		boolean num = false;
                		for (int k = 0; k < n; k++) {
                			if ((p[k]+g) <= w && num == true) {
                				num = false;
                			}else if (p[k] <= w ) {
                				g = p[k];
                				res = res + 1;
                				num = true;
                			}
                		}
                		System.out.println(res);
        			}
            	}
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}