package interfaceExample;

public class TestBank {

	public static void main(String[] args) {

	//	ICICIBank i = new ICICIBank();
		RBI i = new ICICIBank(); //Run time polymorphism
		i.MiniBalanceforCurrent();
		i.MiniBalanceforSaving();
		i.ROIForSaving();
	//	i.internationalBankin();
//		i.minibalance = i.minibalance + 500;


	}

}
