package seriusyok;
import java.io.*;
public class index {
    public static void main(String[] args) throws Exception{
        BufferedReader o=new BufferedReader (new InputStreamReader(System.in));
        
        humans[] h=new humans[2];
        
        int e=0;
        
        do{
            System.out.println("user"+(e+1));
            System.out.print("masukkan tinggi badan : ");
            double l=Double.parseDouble(o.readLine());
            System.out.print("masukkan jenis kelamin (L/P) : ");
            String q=o.readLine();
            
            if (q.toUpperCase().equals("L")){
                h[e]=new boy(l);
            System.out.print("BBI anda : "+h[e].hbbi());
            System.out.println("");
            }else if (q.toUpperCase().equals("P")){
            h[e]=new girl(l);
            System.out.print("BBI anda : "+h[e].hbbi());
            System.out.println("");
            }else {
                System.out.println("i'am sorry you not humans");
            }
            e++;
        }while(e<2);
    }
}
