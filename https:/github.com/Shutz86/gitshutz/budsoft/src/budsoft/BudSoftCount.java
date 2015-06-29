package budsoft;

public class BudSoftCount {
	//Write a program that prints the numbers from 1 to 100. But for multiples of three print “Bud” instead of the number and for the multiples of five print “Soft”. 
	//For numbers which are multiples of both three and five print “BudSoft”.
	
	public static void main(String[] args) {
		for (int i = 1; i<100; i++)
		{
			if(i % 3 == 0 && i%5 == 0)
				System.out.println("BudSoft");
			else if (i % 3 ==0 )
				System.out.println("Bud");
			else if (i % 5 ==0)
				System.out.println("Soft");
			else
				System.out.println(i);
		}
	}

}
