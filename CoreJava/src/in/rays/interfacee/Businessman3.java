package in.rays.interfacee;

public class Businessman3 extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		System.out.println("Hepl Others");
	}

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("Earn Money");
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Donate");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("party");
	}

}
