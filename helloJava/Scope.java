/**
 * Created by Alexandre Santos.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] els){
        this.elements = els;
    }

    int computeDifference(){
        for(int i=0; i < this.elements.length; i++){
            for(int j=i+1; j < this.elements.length; j++){
                maximumDifference = maximumDifference < Math.abs(this.elements[i] - this.elements[j])
                        ? Math.abs(this.elements[i] - this.elements[j])
                        : maximumDifference;
            }
        }
        return maximumDifference;
    }
}

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

