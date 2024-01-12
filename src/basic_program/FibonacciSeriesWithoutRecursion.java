package basic_program;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) 
	
	{  
		int p1=0, p2=1,p3;
		
		System.out.print(p1+" "+p2);
		
		for(int i=2; i<10; i++)
		{
			p3=p1+p2;
			System.out.print(" "+p3);
			
			p1=p2;
			p2=p3;
		}
	
	}

}

//0 1 1 2 3 5 8 13 21 34 55
//0 1 1 2 3 5 8 13 21 34 55   i++
