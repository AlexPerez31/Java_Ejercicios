import java.io.BufferedReader;
import java.io.FileReader;

public class Factorials {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("factorials.in"));
			String linea;
			while((linea=br.readLine())!=null){
				String dato[]=linea.split(" ");
				int n = Integer.parseInt(dato[0]);
				int k = dato[1].length();
				long resultado =1;
				for (int i=n;i>0;i-=k) {
					resultado *= i;
				}
				System.out.println(resultado);
			}
			
		} catch (Exception e){
            e.printStackTrace();
        }
	}

}
