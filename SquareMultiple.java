
import java.util.*;
public class SquareMultiple {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int firstVal = sc.nextInt();
		int secondVal = sc.nextInt();
		
		if(secondVal%firstVal==0)
		{
			if(firstVal*2==secondVal)
			{
				System.out.println(secondVal+" is square as well as multiple of "+firstVal);
			}
			else
			{
				System.out.println(secondVal+" is multiple of "+firstVal+" ="+secondVal/firstVal);
			}
				
		}
		else
		{
			System.out.println("Niether Multiple nor square.");
		}

	}

}
