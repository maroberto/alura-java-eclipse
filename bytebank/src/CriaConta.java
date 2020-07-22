
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 146;
		
		System.out.println("Agencia da primeira conta é: " + primeiraConta.agencia);
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		segundaConta.agencia = 146;
		
		System.out.println("Agencia da segunda conta é: " + segundaConta.agencia);
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}else {
			System.out.println("São contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

