package parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class G {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            int h = 0;
            int k = 0;
            for(int i = 0; i < t; i++) {
            	linea = br.readLine();
                int x = Integer.parseInt(linea);
                if(x <= 7 && x >= 2) {
                    System.out.println(1);
                }else {
                    while(h != x) {
                        h = (int) (h + (((5) * Math.random()) + 2));
                        k++;
                        if(h > x) {
                            h = 0;
                            k = 0;
                        }
                    }
                    System.out.println(k);
                }
            }
            
	} catch (IOException e) {
	    e.printStackTrace();
	}

	}

}