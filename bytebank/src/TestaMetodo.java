
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean SucessoTransferecnia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (SucessoTransferecnia) {
			System.out.println("transferencia feita com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
	}
}
