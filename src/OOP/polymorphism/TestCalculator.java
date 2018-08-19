package OOP.polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.areaOfLand(5, 10));
		System.out.println(cal.areaOfLand(5, 10, 20));
		System.out.println(cal.areaOfLand(5, 10,10,10));
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.areaOfLand(5, 10,10,10));
		System.out.println(mc.areaOfLand(5, 10, 20));
	
	}

}
