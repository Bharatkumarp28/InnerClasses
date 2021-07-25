package innerClasses;

public class StaticMaths {
	
	static class Geometry
	{
		static float PI = 3.14f;
		public static void areaOfCircle(int radius)
		{
			System.out.println("Area of circle: "+ PI * radius * radius);
		}
		public static void perimeterOfCircle(int radius)
		{
			System.out.println("Perimeter of Circle: "+ 2* PI * radius);
		}
		
	}
	
	static class Algebra
	{
		public static void multi(int a, int b)
		{
			System.out.println("Multiplication Answer is: " + a * b);
		}
		
	}

}
