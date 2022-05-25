
public class Main {

	public static void main(String[] args) {
		Cliente lindolfo = new Cliente();
		lindolfo.setNome("Lindolfo");
		
		ContaCorrente cc = new ContaCorrente(lindolfo);
		ContaPoupanca poupanca = new ContaPoupanca(lindolfo);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
