import java.io.*;
import java.math.*;
import java.util.*;



public class HourglassSum {
	// prints the sum of hourglass which is the largest of all the sums of the hourglasses
    public static void main(String[] args) throws IOException {
    	System.out.println("Enter 36 numbers for the 2D array:");
    	Scanner scan = new Scanner(System.in);
        int[][] store = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                store[i][j] = scan.nextInt();
            }
            
        }
        
        int[] arr = new int[16];
        int count = 0;
        for(int row = 0; row <= 3; row++){
            for(int col = 0; col <= 3; col++){
                int sum = 0;
                sum += store[row][col];
                sum += store[row][col + 1];
                sum += store[row][col + 2];
                sum += store[row + 1][col + 1];
                sum += store[row + 2][col];
                sum += store[row + 2][col + 1];
                sum += store[row + 2][col + 2];
                
                arr[count++] = sum;
                
            }
            

            
        }
        Arrays.sort(arr);
        System.out.println("The largest sum of the hourglasses is: " + arr[arr.length - 1]);
        scan.close();
    }
}
