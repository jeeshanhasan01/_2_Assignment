import java.util.*;
public class Count_Digits
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int digit=sc.nextInt();
		System.out.println(Count(n, digit));
	}
	
	public static int Count(int n, int digit){
	    int count=0;
	    while(n>0){
	        int rem= n%10;
	        n=n/10;
	        if(rem==digit){
	            count++;
	        }
	    }
	    return count;
	}
}
