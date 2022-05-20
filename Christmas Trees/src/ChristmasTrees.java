import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
public class ChristmasTrees {
	public static void main(String[] args) {
		try{
    //      BufferedReader br = new BufferedReader(new FileReader("tree.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            while((linea=br.readLine())!=null){
            	if (linea.equals("0 0")) {
            		linea = null;
            	}else {
	            	String datos[] = linea.split(" ");
	            	int bizq = Integer.parseInt(datos[0]);
	            	int bder = Integer.parseInt(datos[1]);
	            	if (bizq <= 100 && bizq > 0 && bder <= 100 && bder > 0) {
	            			int talloiz = bizq*2;
	            			int tallode = bder*2;
	            			int ramaiz = 1;
	            			int ramade = 1;
	            			int espacio1 = (bizq*2)-1;
	            			int espacio2 = (bizq*2);
	            			int espacio3 = (bder*2)-1;
	            			boolean b = false;
	            			int espacio12 = espacio1;
	            			int espacio22 = espacio2;
	            			int espacio32 = espacio3;
	            			int espaciot = espacio1+espacio2+1;
	            			int mayor;
	            			if(bizq>bder || bizq==bder) {
	            				mayor = bizq+talloiz;
	            			}else {
	            				mayor = bder+tallode;
	            			}
	            			for(int i=0; i < mayor; i++ ) {
	            				if (talloiz > 0) {
	            					for(int j=0; j<espacio1; j++) {
	            						System.out.print(" ");
	            					}
	            					for(int j=0; j<ramaiz; j++) {
	            						System.out.print("*");
	            					}
	            					for(int j=0; j<espacio2; j++) {
	            						System.out.print(" ");
	            					}
	            					ramaiz += 2;
	            					espacio1 --;
	            					espacio2 --;
	            				}
	            				if (talloiz < 1 && bizq>0) {
	            					for(int j=0; j<espacio12; j++) {
	            						System.out.print(" ");
	            					}
	            					for(int j=0; j<1; j++) {
	            						System.out.print("*");
	            					}
	            					for(int j=0; j<espacio22; j++) {
	            						System.out.print(" ");
	            					}
	            					bizq --;
	            				}
	            				if (b == true) {
	            					for(int j=0; j<espaciot; j++) {
	            						System.out.print(" ");
	            					}
	            				}
	            				if (tallode > 0) {
	            					for(int j=0; j<espacio3; j++) {
	            						System.out.print(" ");
	            					}
	            					for(int j=0; j<ramade; j++) {
	            						System.out.print("*");
	            					}
	            					ramade += 2;
	            					espacio3 --;
	            				}
	            				if (tallode < 1 && bder!=0) {
	            					for(int j=0; j<espacio32; j++) {
	            						System.out.print(" ");
	            					}
	            					for(int j=0; j<1; j++) {
	            						System.out.print("*");
	            					}
	            					bder --;
	            				}
	            				if (talloiz < 1 && bizq <1) {
	            					b = true;
	            				}
	            				talloiz --;
	            				tallode --;
	            				System.out.println();	
	            			}
	            	}
	            	System.out.println();
            	}
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}