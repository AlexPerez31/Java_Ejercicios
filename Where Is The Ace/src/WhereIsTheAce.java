import java.io.BufferedReader;
import java.io.FileReader;
public class WhereIsTheAce {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("ace.in"));
			String linea;
				while ((linea = br.readLine())!=null){
					int n = Integer.parseInt(linea);
						if (n>=0 && n<=50) {
							for (int i=0 ; i < n; i++) {
								linea = br.readLine();
								String dato[] = linea.split("");
								int a=1, b=2, c=3, aux=0;;
								for (int j = 0 ; j < linea.length(); j++) {
									if (dato[j].equals("L")) {
										aux=a;
										a=b;
										b=aux;
									}
									if (dato[j].equals("R")) {
										aux=c;
										c=b;
										b=aux;
									}
									if (dato[j].equals("E")) {
										aux=c;
										c=a;
										a=aux;
									}
								}
								if (a==2) {
									System.out.println("L");
								}
								if (b==2) {
									System.out.println("M");
								}
								if (c==2) {
									System.out.println("R");
								}
							}
						}
				}
			
		}catch (Exception e){
            e.printStackTrace();
        }

	}

}