
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of squared to be processed");
		int nSquares = keyboard.nextInt();
		Point a,b;
		double max=-1;
		for (int i=0; i<nSquares; i++)
		{
			try
			{
				a=new Point(Math.random(), Math.random());
				b=new Point(Math.random(), Math.random());
				Square sq= new Square(a,b);
				sq.calcArea();
				if (sq.getArea()>max)
				{
					max=sq.getArea();
				}
			}
			catch(InvalidShapeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Maximum Area = " + max);
	}

}
