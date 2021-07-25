package innerClasses;

public class Maths 
{
	
	class Geometry
	{
		float PI = 3.14f;
		public void areaOfCircle(int radius)
		{
			System.out.println("Area of circle: "+ PI * radius * radius);
		}
		public void perimeterOfCircle(int radius)
		{
			System.out.println("Perimeter of Circle: "+ 2* PI * radius);
		}
		
	}
	
	class Algebra
	{
		public void multi(int a, int b)
		{
			System.out.println("Multiplication Answer is: " + a * b);
		}
		
	}

}
