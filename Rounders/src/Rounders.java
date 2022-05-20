import java.io.BufferedReader;
import java.io.FileReader;
public class Rounders {
	private static int n[];
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("rounders.in"));
			String linea;
			while((linea=br.readLine())!=null){
				int k = Integer.parseInt(linea);
				for(int f = 0; f < k ; f++) {
					linea = br.readLine();
					String num[] = linea.split("");
					int j = Integer.parseInt(linea);
					int s = num.length;
					int n[] = new int [s];
					int aux = 0;
					for (int i = 0; i<s; i++) {
						n[i] = Integer.parseInt(num[i]);
					}
					for (int i = 0; i<s; i++) {
						System.out.print(n[i]);
					}
					System.out.print(" = ");
					boolean a = false;
					if (j>10 ) {
							for(int i = s-1; i >= 0; i--) {
								if (i==0 && n[0] == 9 && aux==1) {
									a = true;
								}
								n[i] = n[i] + aux;
								aux = 0;;
								if (n[i] > 4 && i>0) {
									n[i] = 0;
									aux = 1;	
								}
								if (a == true) {
									n[0] = 10;
								}
							}
							if (n[1]<5) {
								for(int i = s-1; i > 0; i--) {
									n[i] = 0;
								}
							}
							for (int i = 0; i<s; i++) {
								System.out.print(n[i]);
							}
					}else {
						for (int i = 0; i<s; i++) {
							System.out.print(n[i]);
						}
					}
					System.out.println("");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
