package in.rays.interfacee;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Richman rm = new Businessman();
		SocialWorker sw = new Businessman2();
		Businessman3 b = new Businessman3();
		
		rm.earnMoney();
		rm.donation();
		rm.party();
		
		sw.helpToOthers();
		
		b.earnMoney();
		b.donation();
		b.party();
		b.helpToOthers();

	}

}
