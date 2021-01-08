package java_10;
import java.util.*;
public class Max {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int i,j;
        System.out.println("The random array is");
        int[][] aa = new int[n][n];
        int[] max1 = new int[n];
        int[] max2 = new int[n];
        int maxa = 0,maxb = 0;
        for(i = 0; i < n;++ i){
            for(j = 0;j < n;++ j){
                aa[i][j] = (int)(Math.random() * 2);
                System.out.print(aa[i][j]);
            }
            System.out.println("");
        }
        int k = 0;
        for(i = 0; i < n;++ i){
            int x = 0;
            for( j = 0;j < n;++ j){
                if(aa[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxa){
                maxa = x;
                max1[0] = i;
                k = 1;
            }else if(x == maxa){
                max1[k] = i;
                k++;
            }
        }
        System.out.print("The largest row index: ");
        for( i = 0;i < k;++i){
            System.out.print(max1[i]);
            if(i != k-1){
                System.out.print(" ");
            }else{
                System.out.println("");
            }
        }
        k = 0;
        for(j = 0; j < n;++ j){
            int x = 0;
            for(i = 0;i < n;++ i){
                if(aa[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxb){
                maxb = x;
                max2[0] = j;
                k = 1;
            }else if(x == maxb){
                max2[k] = j;
                k++;
            }
        }
        System.out.print("The largest column index: ");
        for(i = 0;i < k;++i){
            System.out.print(max2[i]);
            if(i != k-1){
                System.out.print(" ");
            }else{
                System.out.println("");
            }
        }
    }
}
