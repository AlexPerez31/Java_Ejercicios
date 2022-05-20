import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class SymmetricOrder {
	public static void main(String[] args) {
		 try{
	            BufferedReader br = new BufferedReader(new FileReader("order.in"));
	            String linea;
	            int b = 1;
	            while((linea=br.readLine())!=null){
	            	if (linea.equals("0")) {
	            		linea = null;
	            	}else {
	            		System.out.println("SET "+ b);
	            		int n = Integer.parseInt(linea);
	            		String nom[] = new String[n];
	            		String aux;
	            		for (int i = 0; i < n; i++){
	                        linea = br.readLine();
	                        nom[i] = linea;
	                    }
	            		for(int i = 0; i< n ; i++) {
	            			for(int j = i+ 1; j < n; j++) {
		            			if(nom[i].length() > nom[j].length()) {
		            				aux = nom[i];
		            				nom[i] = nom[j];
		            				nom[j] = aux;
		            			}
		            		}
	            		}
	            		if (n%2==0) {
	            			for (int i = 0; i<= n-1;){
		            			System.out.println(nom[i]);
		            			i = i + 2;
		                    }
		            		for (int i = n-1; i> 0;){
		            			System.out.println(nom[i]);
		            			i = i - 2;
		                    }
	            		}else {
	            			for (int i = 0; i< n;){
		            			System.out.println(nom[i]);
		            			i = i + 2;
		                    }
		            		for (int i = n-2; i> 0;){
		            			System.out.println(nom[i]);
		            			i = i - 2;
		            		}
	            		}
	            	}
	            		b = b + 1;
	            }
	            br.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	}

}
