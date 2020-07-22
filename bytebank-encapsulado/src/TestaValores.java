
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 27226);
		
		//System.out.println("Ag. " + conta.getAgencia());
		//System.out.println("Cc. " + conta.getNumero());
		
		Conta conta2 = new Conta(1337, 27229);
		Conta conta3 = new Conta(1337, 27231);
		
		System.out.println("Total de contas " + Conta.getTotal());
	}
}
