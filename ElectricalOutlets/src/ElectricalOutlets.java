import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ElectricalOutlets {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("outlets.in"));
			String linea;
			int t=0;
			int cont=0;
			int strips[] = null;
			linea = br.readLine();
			while ((linea = br.readLine())!=null ) {
				String dato[] = linea.split(" ");
				for(int i =1; i<dato.length; i++) {
					t = t + Integer.parseInt(dato[i]);
				}
				t = t - (dato.length-2);
				System.out.println(t);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
