
public class PerimeterCalculator {
	
	public static void main(String[] args) {
		 double d = 234.04f;
        long l = (long)d;   //explicit type casting
        int i = (int)l;     //explicit type casting
        byte b = 50;
        System.out.println("double value " + d);
        System.out.println("long value " + l);
        System.out.println("int value " + i);
		Rectangle r = new Rectangle(5,8);
		System.out.println(r.calculatePerimeter());
	}
}
