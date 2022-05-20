import java.io.BufferedReader;
import java.io.FileReader;

public class Segments {

	public static void main(String[] args) {
		try{
            BufferedReader br = new BufferedReader(new FileReader("segments.in"));
            String linea;
            while((linea=br.readLine())!=null){
            	String dato[] = linea.split(" ");
            	int n = Integer.parseInt(dato[0]);
            	int s = Integer.parseInt(dato[1]);
            	if (s>0 && s<6) {
	            	if (n==0 || n==2 || n==3 || n==5 || n==6 || n==7 || n==8 ||n==9){
	            		System.out.print(" ");
	            		for (int i = 0; i < s; i++) {
	            			System.out.print("-");
	            		}
	            		System.out.println("");
	            	}
	            	if (n==0 || n==8 || n==9 || n==4){
	            		for (int i = 0; i < s; i++) {
	            			System.out.print("|");
	            			for(int j = 0; j < s; j++) {
	            				System.out.print(" ");
	            			}
	            			System.out.print("|");
	            			System.out.println("");
	            		}
	            	}
	            	if (n==5 || n==6){
	            		for (int i = 0; i < s; i++) {
	            			System.out.println("|");
	            		}
	            	}
	            	if (n==1 || n==2 || n==3 || n==7){
	            		for (int i = 0; i < s; i++) {
	            			for(int j = 0; j <= s; j++) {
	            				System.out.print(" ");
	            			}
	            			System.out.println("|");
	            		}
	            	}
	            	if (n==2 || n==3 || n==4 || n==5 || n==6 || n==7 || n==8 ||n==9){
	            		System.out.print(" ");
	            		for (int i = 0; i < s; i++) {
	            			System.out.print("-");
	            		}
	            		System.out.println("");
	            	}
	            	if (n==0 || n==6 || n==8){
	            		for (int i = 0; i < s; i++) {
	            			System.out.print("|");
	            			for(int j = 0; j < s; j++) {
	            				System.out.print(" ");
	            			}
	            			System.out.print("|");
	            			System.out.println("");
	            		}
	            	}
	            	if (n==2){
	            		for (int i = 0; i < s; i++) {
	            			System.out.println("|");
	            		}
	            	}
	            	if (n==1 || n==3 || n==4 || n==5 || n==7 || n==9){
	            		for (int i = 0; i < s; i++) {
	            			for(int j = 0; j <= s; j++) {
	            				System.out.print(" ");
	            			}
	            			System.out.println("|");
	            		}
	            	}
	            	if (n==0 || n==2 || n==3 || n==5 || n==6 || n==8){
	            		System.out.print(" ");
	            		for (int i = 0; i < s; i++) {
	            			System.out.print("-");
	            		}
	            		System.out.println("");
	            	}
            	}	
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}
