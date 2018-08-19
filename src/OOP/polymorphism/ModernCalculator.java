package OOP.polymorphism;

public class ModernCalculator extends Calculator {
	
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a+b+c+d-1;
		return total;
	}
	@Override
	public int areaOfLand(int a, int b, int c) {
		int total = a+b+c-1;
		return total;
	}
}
