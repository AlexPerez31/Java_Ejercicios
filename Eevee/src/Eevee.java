import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Eevee {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            linea = br.readLine();
            String letras = linea;
            String res = null;
            String[] evol = {"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"};
            if(n==8) {
            	res=evol[0];
            }
            if(n==6) {
            	res=evol[3];
            }
            if(n==7) {
            	if(letras.contains("l")){
            		if(letras.charAt(2)=='l') {
            			if(letras.contains("j") || letras.contains("t")) {
                			res=evol[1];
                		}else{
                			res=evol[7];
                		}
            		}else if(letras.charAt(1)=='l') {
            			if(letras.contains("f") || letras.contains("r")) {
            				res=evol[2];
                		}else {
                			res=evol[6];
                		}
            		}else {
            			res=evol[5];
            		}
                }else if(letras.contains("a")){
                	if(letras.charAt(0)=='f' || letras.contains("r")) {
                		res=evol[2];
                	}else {
                		if(letras.contains("f") || letras.contains("e")) {
                			res=evol[5];
                    	}else {
                    		res=evol[6];
                    	}
                	}
                }else if(letras.contains("f")){
                	if(letras.charAt(0)=='f') {
                		res=evol[2];
                	}else {
                		res=evol[5];
                    }
                }else if(letras.contains("r") || letras.contains("u") || letras.contains("m")  || letras.contains("b")){
                	res=evol[4];
                }else if(letras.contains("j") || letras.contains("t")){
                	res=evol[1];
                }else if(letras.contains("g")){
                	res=evol[6];
                }else if(letras.contains("e")){
                	res=evol[5];
                }else if(letras.contains("s") || letras.contains("y") || letras.contains("v")){
                	res=evol[7];
                }
            }
            System.out.print(res); 	
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}