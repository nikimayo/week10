package java_10;
import java.util.Scanner;
import java.lang.Math;
public class SOfShape {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] x = new float[100];
        float[] y = new float[100];
        int i;
        System.out.print("Enter the number of the points: ");
        int n = input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        for( i = 1;i <= n;++ i){
            x[i] = input.nextFloat();
            y[i] = input.nextFloat();
        }
        float s = 0;
        for(i = 1;i <= n;++ i){
            if(i == n){
                
                s += x[n] * y[1] - x[1] * y[n];
            }
            else{
            	s += x[i] * y[i+1] - x[i+1] * y[i];
            }
        }
        s = Math.abs(s / 2);
        System.out.print("The total area is ");
        System.out.println(String.format("%.3f",s));
    }
}
