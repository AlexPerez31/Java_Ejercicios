import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class OptimalParking {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("parking.in"));
			String linea = br.readLine();
			int casos = Integer.parseInt(linea);
			for(int i=1; i<=casos; i++) {
				linea = br.readLine();
				int tiendas = Integer.parseInt(linea);
				int []distancias;
				linea = br.readLine();
				String dato[] = linea.split(" ");
				distancias = new int[tiendas];
				for(int k=0; k<tiendas; k++) {
					distancias[k] = Integer.parseInt(dato[k]);
				}
				Arrays.sort(distancias);
				System.out.println((distancias[distancias.length-1]-distancias[0])*2);	
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
