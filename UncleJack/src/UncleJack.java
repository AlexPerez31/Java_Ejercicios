import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class UncleJack {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("uj.in"));
			String linea;
			while(!(linea=br.readLine()).equals("0 0")){
				String dato[]=linea.split(" ");
				BigInteger b = new BigInteger(dato[0]);
				int d = Integer.parseInt(dato[1]);
				BigInteger resultado = b.pow(d);
				System.out.println(resultado);
			}
			
		} catch (Exception e){
            e.printStackTrace();
        }
	}
}
