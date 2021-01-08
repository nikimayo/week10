package java_10;
import java.util.*;
public class Remove {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter 10integers: ");
	        int i;
	        ArrayList<Integer> a = new ArrayList<Integer>();
	        for( i=1;i <= 10;i++){
	            a.add(input.nextInt());
	        }
	        System.out.print("The distinct integers are ");
	        removeDuplicate(a);
	    }
	    public static void removeDuplicate(ArrayList<Integer> list){
	        Set<Integer> setlist = new HashSet<Integer>();
	        int i;
	        int c;
	        for(i = 0;i < 10;++i){
	            c =list.get(i);
	            if(!setlist.contains(c)){
	                System.out.print(c + " ");
	                setlist.add(c);
	            }
	        }
	    }
}
