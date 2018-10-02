
public class Square extends Shape
{

	public Square(Point a, Point b) throws InvalidShapeException
	{
		super(2);
		vertex[0]=a;
		vertex[1]=b;
		testShape();
	}
	public void calcArea()
	{
		setArea(this.vertex[0].calcDist(this.vertex[1])*this.vertex[0].calcDist(this.vertex[1]));
	}
}
