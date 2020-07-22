
public class Conta {
	
	/*Modificadores de acesso
	 * 1) Public    - > todas as classes terão acesso
	 * 2) Private   - > apenas pode ser acessado de dentro da classe
	 * 3) Protected - > pode ser acessado estando dentro do mesmo pacote e/ou subclasses
	 * 4) Default   - > caso não tenha sido definido nunhum modificador, permitindo acesso dentro do pacote
	 *  
	 */
	
	
    private int numeroConta;
    private double saldo = 100;
    
    public double recuperarSaldo() {
    	
    	return this.saldo;
    }
   
   public void depositar ( double valorDepositado) {
	this.saldo = this.saldo + valorDepositado;  
   }
   
   public void sacar(double valorSaque) {
	this.saldo = this.saldo - valorSaque;
   }
		   
   
}
