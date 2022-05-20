import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SoftDrinking {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linea;
			while(!(linea=br.readLine()).equals(null)) {
				int n, k, l, c, d, p, nl, np;
				String dato[] = linea.split(" ");
				n = Integer.parseInt(dato[0]);
				k = Integer.parseInt(dato[1]);
				l = Integer.parseInt(dato[2]);
				c = Integer.parseInt(dato[3]);
				d = Integer.parseInt(dato[4]);
				p = Integer.parseInt(dato[5]);
				nl = Integer.parseInt(dato[6]);
				np = Integer.parseInt(dato[7]);
				int tnl = n*nl;
				int tnp = n*np;
				int tkl = k*l;
				int tcd = c*d;
				int rn = tkl / tnl;
				int rc = tcd / n;
				int rp = p / tnp;
				if(rn < rc && rn < rp) {
					System.out.println(rn);
				}else if(rc < rn && rc < rp) {
					System.out.println(rc);
					}else if(rp < rn && rp < rc) {
						System.out.println(rp);
						}else {
							System.out.println(rp);
						}
			}
			br.close();
		}catch (Exception e){
            e.printStackTrace();
        }
	}
}