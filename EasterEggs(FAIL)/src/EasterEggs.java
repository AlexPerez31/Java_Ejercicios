import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EasterEggs {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            linea = br.readLine();
            int n = Integer.parseInt(linea);
            char colors[] = {'R','O','Y','G','B','I','V'};
            char colors2[] = {'R','O','Y','G','R','B','I','V','G','B','I'};
            char res[] = new char[n];
            int j = 0;
            if(n<12) {
            	for(int i = 0; i < n; i++) {
                	res[i] = colors2[j];
                	j++;
                }
            }else{
	            for(int i = 0; i < n; i++) {
		            if(i==n-4) {
		            	if(j==3) j=5;
		            	else if(j==2) j=5;
		            	else if(j==1) j=4;
		            	else if(j==0) j=3;
		            	else if(j>3)j=j-4;
		            }
	            	res[i] = colors[j];
		            if(j == 6) {
	            		j=-1;
	            	}
	            	j++;
	            }
            }
            for(int i = 0; i < n; i++) {
            	if(n!=7) {
            		System.out.print(res[i]);
            	}else {
            		System.out.print(colors[i]);
            	}
            }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}