import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultiDArrayHourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int highestSum = 0;
            for(int i=0; i < 4; i++){
                for(int j=0; j < 4; j++){
                    int sum = arr[0+i][0+j] + arr[0+i][1+j] + arr[0+i][2+j]
                                            + arr[1+i][1+j]
                            + arr[2+i][0+j] + arr[2+i][1+j] + arr[2+i][2+j];
                    if (sum > highestSum || i==0 && j==0) highestSum = sum;
                }
            }
        System.out.println(highestSum);
    }
}
