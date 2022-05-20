import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpeedLimit {

	public static void main(String args[]) {
		
		try{
            BufferedReader br = new BufferedReader(new FileReader("speed.in"));
            String linea;
            while((linea=br.readLine())!=null){
            	if (linea.equals("-1")) {
            		linea = null;
            	}else {
            		int n = Integer.parseInt(linea);
            		int s[] = new int [n];
            		int t[] = new int [n];
            		int res=0;
            		int aux;
            		for (int i = 0; i < n ; i++) {
            			linea = br.readLine();
            			String datos[] = linea.split(" ");
            			s[i] = Integer.parseInt(datos[0]);
            			t[i] = Integer.parseInt(datos[1]);	
            		}
            		for (int i= 0; i < n ; i++) {
            			if(i==0) {
            				aux = t[i];
            			}else {
            				aux = t[i] - t[i-1];
            			}
            			res += s[i] * aux;
            		}
            		System.out.println(res + " miles");
            	}
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
	}

}