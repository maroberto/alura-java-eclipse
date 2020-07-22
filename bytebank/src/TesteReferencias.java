
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta é: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da primeira atualizado é: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda atualizado é: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}else {
			System.out.println("São contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
