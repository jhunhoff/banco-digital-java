
public class Main {

	public static void main(String[] args) {
		//Construtor dos clientes utilizando nome e CPF (como um Long)
		Cliente cliente1 = new Cliente("Cliente Teste", 12345678900L);
		Cliente cliente2 = new Cliente("Cliente Teste 2", 98765432100L);

		//Instanciando uma conta corrente e poupança utilizando apenas o construtor do cliente
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		//Instanciando uma conta corrente e poupança populando os atributos de agencia, saldo e cliente
		Conta cc2 = new ContaCorrente(123, 0, cliente2);
		Conta poupanca2 = new ContaPoupanca(123, 5000, cliente2);

		
		cc.depositar(1000);
		cc.transferir(500, poupanca);
		cc.transferir(150, poupanca2); // transferencia de dinheiro para contas de clientes diferentes
		cc2.sacar(150); //não vai realizar o saque pois não tem saldo na conta
		poupanca2.sacar(1500); //não vai sacar pois a poupança tem limitação de saque de 1000
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
