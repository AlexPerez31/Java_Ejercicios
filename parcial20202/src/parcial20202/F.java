package parcial20202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int t = Integer.parseInt(linea);
            int r =0;
            for(int i = 0; i <t; i++) {
            	linea = br.readLine();
            	String x = linea;
            	if(x.charAt(0) == '1') {
            		if(x.length() == 1) {
            			r = 1;
            		}else if(x.length() == 2) {
            			r = 3;
            		}else if(x.length() == 3) {
            			r = 6;
            		}else if(x.length() == 4) {
            			r = 10;
            		}
            	}
            	if(x.charAt(0) == '2') {
            		r = 10;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '3') {
            		r = 20;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '4') {
            		r = 30;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '5') {
            		r = 40;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '6') {
            		r = 50;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '7') {
            		r = 60;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '8') {
            		r = 70;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	if(x.charAt(0) == '9') {
            		r = 80;
            		if(x.length() == 1) {
            			r = r + 1;
            		}else if(x.length() == 2) {
            			r = r + 3;
            		}else if(x.length() == 3) {
            			r = r + 6;
            		}else if(x.length() == 4) {
            			r = r + 10;
            		}
            	}
            	
            	System.out.println(r);
            }
            
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
