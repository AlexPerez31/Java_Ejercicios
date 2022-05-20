import java.io.BufferedReader;
import java.io.FileReader;

public class OddOrEven {

	public static void main(String[] args) {
		
		
		  try {
	            BufferedReader br = new BufferedReader(new FileReader("odd.in"));
	            String linea;
	            while(!(linea = br.readLine()).equals("0")) {
	                linea = br.readLine();
	                String[] mary = linea.split(" ");
	                linea = br.readLine();
	                String[] john = linea.split(" ");
	                int par = 0;
	                for(int i = 0; i < mary.length; i++) {
	                    if(Integer.parseInt(mary[i]) % 2 == 0) {
	                        par++;;
	                    }
	                }
	                int impar = 0;
	                for(int i = 0; i < john.length; i++) {
	                    if(Integer.parseInt(john[i]) % 2 != 0) {
	                        impar++;
	                    }
	                }
	                System.out.println(Math.abs(par-impar));

	            }
	            br.close();
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }

	}

}
