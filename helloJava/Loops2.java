import java.util.*;
import java.io.*;
/**
 * Created by Junaid Salaat.
 */
public class Loops2 {
    /*public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int seq = 0;
            while(n>=0){
                seq += Math.pow(2,b);
                n--;
            }
            System.out.print(a+seq);
            System.out.print(" ");
//            in.nextLine();
            in.close();
        }
    }*/
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();

    }

}
