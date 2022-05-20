import java.io.BufferedReader;
import java.io.FileReader;

public class BaseComparator {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("bcomp.in"));
			String linea;
			while((linea=br.readLine())!=null) {
				String dato[] = linea.split(" ");
				char s[] = dato[0].toCharArray();
				int b = Integer.parseInt(dato[1]);
				char t[] = dato[2].toCharArray();
				int c = Integer.parseInt(dato[3]);
				int valor1 = BaseComparator.conversion(s, b);
				int valor2 = BaseComparator.conversion(t, c);
				if(valor1==valor2) {
					System.out.println("=");
				}else if(valor1>valor2) {
					System.out.println(">");
				}else if(valor1<valor2) {
					System.out.println("<");
				}
				
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int conversion(char []valor, int base) {
		int res = 0;
		for (int i=0; i<valor.length; i++) {
			res += (valor[valor.length-i-1]-48)*(int)Math.pow(base, i);
		}
		return res;
	}

}
