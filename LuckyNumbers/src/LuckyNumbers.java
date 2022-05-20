
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumbers {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            String num;
            int res = 0;
            if(n>101) {
            	res = 100;
	            for(int i = 101; i <= n; i++) {
	                int cont = 0;
	            	num = String.valueOf(i);
	            	int aux = 0;
	            	for(int j = 1; j < num.length(); j++) {
	            		if(num.charAt(0) != num.charAt(j) && cont<1) {
	            			cont ++ ;
	            			aux = j;
	            		}
	            		if(num.charAt(0) != num.charAt(j) && num.charAt(aux) != num.charAt(j) && cont>0) {
	            			cont ++ ;
	            			j = num.length();
	            		}
	            	}
	            	if(cont < 2) {
	            		res ++;
	            	}
	            }
	        	System.out.println(res);
            }else  System.out.println(n);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}



/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumbers {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            int cont = 0;
	            for(int i = 0; i <= 9; i++) {
	            	for(int j = 1; j <= 9; j++) {
	//            		if (res > n || (res == 0 && cnt > 0)) {
	            			
	            		}
		            }
	            }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}



*/



/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LuckyNumbers {
	public static boolean suerteefi(long n) {
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
			while(n>0) {
				if(arreglo.size()<2 && !arreglo.contains((int)n%10)) {
					arreglo.add((int)n%10);
				}else if(arreglo.size()==2 && !arreglo.contains((int)n%10)) {
					return false;
				}
				n=n/10;
			}
			return true;
		
		
	}
	
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[]temp ;
        String bfRead;
    	try {
			bfRead = bf.readLine();
			temp = bfRead.split(" ");
			long n= Long.parseLong(temp[0]);
			long inicio=(long)System.currentTimeMillis();
			long contador=0;
			for (long i = 1; i <= n; i++) {
				if(i<=101) {
					contador++;
				}else if(suerteefi(i)) {
					//System.out.print(i +" ");
					contador++;
				}
			}
			System.out.println(contador);	
			long fin=(long)System.currentTimeMillis();
			System.out.println(fin-inicio);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



*/




