package innerClasses;

public class InnerClassesCall
{

	public static void main(String[] args) 
	{
		//Calling Inner classes by creating objects
		Maths obj = new Maths();
		Maths.Geometry g = obj.new Geometry();
		
		g.areaOfCircle(4);
		g.perimeterOfCircle(5);
		
		Maths.Algebra ag = obj.new Algebra();
		ag.multi(5, 4);
		
		//Calling Static Inner Classes
		StaticMaths.Geometry.areaOfCircle(22);
		StaticMaths.Geometry.perimeterOfCircle(32);
		StaticMaths.Algebra.multi(10, 10);

	}

}
