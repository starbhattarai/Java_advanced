package programming_test;

public class Test {
	private int a;
	private String b;
	public Test(int a ,String b) {
		this.a =  a;
		this.b = b;
	}
	static {
		System.out.println("Static block 1");
	}
	public void display() {
		System.out.println("valure a"+this.a);
	}
	public static void main(String[] args) {
		new Test(1,"Hello");
		//a.display();
		int value =99;
		String var = value+"";
		int a = 45/2.0;
		int data = (int)var;
		
	}
}
