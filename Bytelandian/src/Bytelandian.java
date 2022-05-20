/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Bytelandian {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linea; 
			while((linea = br.readLine()) != null) {
			    long n = Integer.parseInt(linea);
			    long cont[] = new long[(int) (n+1)];
			    for(int i = 0; i <= n; i++) {
			    	cont[i] = i;
			    	cont[i] = Math.max(cont[i],(cont[i/2])+(cont[i/3])+(cont[i/4]));
			    }
			    System.out.println(cont[(int) n]);
			}
			 }catch (IOException e) {
				 e.printStackTrace();
			 }
	}
	
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
class Bytelandian {
	HashMap<Integer,Long> tt=new HashMap<Integer,Long>();
	long cont(int n) {
	      if(n==0)
	      return n;
	         if(tt.containsKey(n)) {
	        	 return tt.get(n).longValue();
	         }else {
	             long res = Math.max(n, cont(n/2) + cont(n/3) + cont(n/4));
	             tt.put(n,res);
	             return res;  
	         }
	    }
	public static void main(String[] args)throws IOException {
		try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String linea; 
				Bytelandian proceso = new Bytelandian();
				while((linea = br.readLine()) != null) {
					int n = Integer.parseInt(linea);
		            System.out.println(proceso.cont(n));
				}
			}catch (IOException e) {
			     e.printStackTrace();
			}
	}	
}