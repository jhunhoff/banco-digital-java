
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	
	
	public ContaPoupanca(int agencia, double saldo, Cliente cliente) {
		super(agencia, saldo, cliente);
	}



	@Override
	public void sacar(double valor) {
		if(valor<=this.saldo && valor<=1000) {
			saldo -= valor;
		}
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
