import java.io.BufferedReader;
import java.io.FileReader;

public class MakingBook {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("book.in"));
			String linea;
			int caso = 1;
			while(!(linea = br.readLine()).equals("0")){
				String dato[] = linea.split(" ");
            	int p1 = Integer.parseInt(dato[0]);
            	int p2 = Integer.parseInt(dato[1]);
				int mayor;
				int menor;
				if(p1<p2) {
					menor = p1;
					mayor = p2;
				}else if(p1>p2) {
					menor = p2;
					mayor = p1;
				}else {
					menor = p1;
					mayor = p2;
				}
				int cont[] = new int[10];
				for(int i = menor; i<=mayor; i++) {
					char []numero = String.valueOf(i).toCharArray();
					for(int j=0; j<numero.length; j++) {
						cont[Character.getNumericValue(numero[j])]++;
					}
				}
				String texto = "Case " + caso;
				for(int i=0; i<cont.length; i++) {
					texto += " " + i + ":" + cont[i];
				}
				System.out.println(texto);
				caso++;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
