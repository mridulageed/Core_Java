package in.rays.oop;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile am = new Automobile();
		
		am.setColor("Blue");
		System.out.println(am.getColor());
		
		am.changeGear(1);
		
		am.setSpeed(200);		
		am.accelerator(5);

	}

}
