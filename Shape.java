
public class Shape
{
	protected double area;
	protected Point vertex[];
	public Shape(int number)
	{
		vertex = new Point[number];
	}
	public void setArea(double a)
	{
		area = a;
	}
	public double getArea()
	{
		return area;
	}
	public String toString()
	{
		String s="";
		for (int i=0; i<vertex.length; i++)
		{
			s=s+vertex[i].toString();
		}
		return s;
	}
	public void testShape() throws InvalidShapeException
	{
		int i=0;
		boolean is = false;
		while (i<vertex.length && is==true)
		{
			int j=0;
			while (j<vertex.length && is==true)
			{
				is = vertex[i].isEqual(vertex[j]);
				j++;
			}
			i++;
		}
		if (is==true)
		{
			throw new InvalidShapeException();		
		}
	}
}
