package abs.cls;

public class BurgerKing1 implements BurgerKing {
	@Override
	public void logo() {
		System.out.println("logo");
	}
	@Override
	public void theme() {
		System.out.println("theme");
	}
    @Override
	public void empdet() {
		System.out.println("emp");
	}
    public void menu() {
    	System.out.println("menu");
    }
    public void data() {
    	System.out.println("data");
    }
    public static void main(String[] args) {
		BurgerKing1 b = new BurgerKing1();
		b.logo();b.theme();b.empdet();b.data();b.menu();
		BurgerKing v = new BurgerKing1();
		v.logo();
		v.theme();
		v.empdet();
		
	}

}
