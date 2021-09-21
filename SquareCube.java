
import java.util.*;
public class SquareCube {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
	int temp=num,rem=0,digits=0;
		while(num!=0)
		{
		    rem = num%10;
		    digits++;
		    num=num-rem;
		    num = num/10;
		}
		//System.out.println(digits);
		num=temp;
		
		if(digits%2==0)
		{
			System.out.println(digits+","+digits*digits);
		}
		else if(digits%3==0)
		{
			System.out.println(digits+","+digits*digits*digits);
		}
		else
		{
		    if(digits==1)
		    System.out.println(digits);
		
		    else
		    System.out.println(digits+"["+ (digits-1) +"], "+(digits-1)*(digits-1));
		}

	}

}
