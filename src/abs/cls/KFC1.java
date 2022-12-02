package abs.cls;

public class KFC1 extends KFCMain{

	@Override
	public void size() {
		System.out.println("500sqft");	
	}
	@Override
	public void empDetails() {
		System.out.println("details");		
	}
	
	
	public static void main(String[] args) {
		KFC1 s = new KFC1();
		s.size();
		s.empDetails();
		s.logo();
	}

}
