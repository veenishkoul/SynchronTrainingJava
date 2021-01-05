package interfaceExample;

public class ICICIBank implements RBI {

	@Override
	public void MiniBalanceforSaving() {
		// TODO Auto-generated method stub
		System.out.println("5000");

	}

	@Override
	public void MiniBalanceforCurrent() {
		// TODO Auto-generated method stub
		System.out.println("10000");

	}

	@Override
	public void ROIForSaving() {
		System.out.println("5%");
		// TODO Auto-generated method stub

	}

	public void internationalBankin() {
		System.out.println("This is a special feature in ICICIBank");
	}

}
