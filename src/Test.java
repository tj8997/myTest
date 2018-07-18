
public class Test {
	Test(){
		System.out.println("Hello A");
	}
	{System.out.println("I'm A class");}
	static{System.out.println("static A");}
}
class cc extends Test{
	cc(){
		System.out.println("Hello B789");
	}
	{System.out.println("I'm B class");}
	static{System.out.println("static B");}
	private void MAIN() {
		new cc();

	}
}
