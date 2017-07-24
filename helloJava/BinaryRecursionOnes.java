/**
 * Created by Junaid Salaat.
 */
import java.io.*;
import java.util.*;

public class BinaryRecursionOnes {

    private static int recursion = 0;
    private static int hRecursion = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimalN = in.nextInt();
        getBinary(decimalN);
        System.out.println(hRecursion);
        in.close();
    };

    // todo: make it better;
    private static void getBinary(int dec){
        if(dec%2 == 1) {
            recursion++;
            if(hRecursion <= recursion) hRecursion = recursion;
        }
        else{
            if(hRecursion <= recursion) hRecursion = recursion;
            recursion = 0;
        };
        if (dec/2 != 1){
            getBinary(dec/2);
        }
        else{
            recursion++;
            if(hRecursion <= recursion) hRecursion = recursion;
        }
    }
}
