import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RockPaperScissors {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            linea = br.readLine();
            String[] datosa = linea.split(" ");
            int a[] = new int[3];
	        for(int i = 0; i < 3; i++) {
	           a[i] = Integer.parseInt(datosa[i]);
	        }
	        linea = br.readLine();
            String[] datosb = linea.split(" ");
            int b[] = new int[3];
	        for(int i = 0; i < 3; i++) {
	           b[i] = Integer.parseInt(datosb[i]);
	        }
	        int nummax = 0;
	        int nummin = 0;
	        int x,y,z;
	        if(a[0]<=b[1]) {
	        	x=a[0];
	        }else {
	        	x=b[1];
	        }
	        if(a[1]<=b[2]) {
	        	y=a[1];
	        }else {
	        	y=b[2];
	        }
	        if(a[2]<=b[0]) {
	        	z=a[2];
	        }else {
	        	z=b[0];
	        }
	        nummax = x+y+z;
	        int h,j,k;
	        h= a[0] - b[0] - b[2];
	        j= a[1] - b[1] - b[0];
	        k= a[2] - b[2] - b[1];
	        if(h>j && h>k) {
	        	nummin=h;
	        }
	        if(j>h && j>k) {
	        	nummin=j;
	        }
	        if(k>j && k>h) {
	        	nummin=k;
	        }
	        if(nummin<0) {
	        	nummin=0;
	        }
	        System.out.println(nummin + " " + nummax);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}