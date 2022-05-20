import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CutRibbon {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linea;
			linea = br.readLine();
			String datos[] = linea.split(" ");
			int n = Integer.parseInt(datos[0]);
			int a = Integer.parseInt(datos[1]);
			int b = Integer.parseInt(datos[2]);
			int c = Integer.parseInt(datos[3]);
			int t = 0, u = 0, v = 0;
			int res[] = new int[n+1];
			res[0] = 0;
			
			for(int i = 0; i <= n; i++) {
				
				if(i>=a) {
					t = res[i-a];
				}
				if(i>=b) {
					u = res[i-b];
				}
				if(i>=c) {
					v = res[i-c];
				}
				res[i] = 1+Math.max(v,Math.max(t,u))+1;
			}
			System.out.println(res[n]);
		}catch (Exception e){
            e.printStackTrace();
        }
	}
}
