
public class Principal {

	public static void main(String[] args) {
		System.out.println("MAIN BEGIN");
		m1();
		System.out.println("MAIN END");
	}

	public static void m1() {
		System.out.println("B BEGIN");
		m2();
		System.out.println("B END");
	}

	public static void m2() {
		System.out.println("A BEGIN");
		System.out.println("A END");
	}

}
//execução:
//MAIN BEGIN
//B BEGIN
//A BEGIN
//A END
//B END
//MAIN END
