/**
 * Created by Junaid Salaat.
 */
import java.io.*;
import java.util.*;
public class Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n + " x " + i + " = " + i*n);
            i++;
        }
    }
}