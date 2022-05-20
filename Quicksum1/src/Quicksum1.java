import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Quicksum1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("quicksum.in"));
			String linea;
			while (!(linea = br.readLine()).equals("#")) {
				String dato[];
				dato = linea.split("");
				int pos, res = 0;
				for (int i=0; i<linea.length(); i++) {
					pos = dato[i].hashCode();
					if (pos==32) {
						pos = 0;
					}else {
						pos += -64;
					}
					res += (i+1) * pos; 
				}
				System.out.println(res);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
