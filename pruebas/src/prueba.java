import java.util.HashMap;
import java.io.IOException;
import java.util.Scanner;

public class prueba {
    
   HashMap<Integer,Long> hm=new HashMap<Integer,Long>();
    public static void main(String args[])throws IOException  {
     
        Scanner sc = new Scanner(System.in);
        
        prueba m = new prueba();
        
          while(sc.hasNext())
          {
              
              int n=sc.nextInt();
              
              System.out.println(m.goldC(n));
          }
    }
      long goldC(int n)
      {
         if(n==0)
        return n;
    

           if(hm.containsKey(n)) {
                
                return hm.get(n).longValue();
           }
           
           else {
        	  
               long res = Math.max(n,goldC(n/2)+goldC(n/3)+goldC(n/4));
               
               hm.put(n,res);
               
               return res;
              
               
           }
           
      
      }
      
     
    
}