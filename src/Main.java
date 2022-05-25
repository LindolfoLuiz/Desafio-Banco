import java.util.List;

public class Main {
	

	public static void main(String[] args) {
			
			Banco banco = new Banco();
			
			System.out.println("=========== " + banco.getNome() + " ==============");
			
			banco.adicionarCliente("Lindolfo");
			banco.adicionarCliente("Juliana");
			banco.adicionarCliente("Junior");
			banco.adicionarCliente("Sandra");
			
			System.out.println("\n=========== Imprimindo Extratos Zerados ==============");
			imprimirExtratos(banco.getListaCliente());
			
			System.out.println("\n=========== Depositando na conta da Sandra ==============");	
			banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Sandra"))).getContaCorrente().depositar(200);
			banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Sandra"))).getContaPoupanca().depositar(400);
			
			System.out.println("\n=========== Sacando da conta da Sandra ==============");	
			banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Sandra"))).getContaCorrente().sacar(20);
			banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Sandra"))).getContaPoupanca().sacar(40);
			
			System.out.println("\n===== Transferindo da cc Sandra para cp Lindolfo ==============");
			banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Sandra"))).getContaCorrente().transferir(20, banco.getListaCliente().get(banco.getListaCliente().indexOf(new Cliente("Lindolfo"))).getContaPoupanca());
			
			
			System.out.println("\n=========== Imprimindo Extratos Depois das Transações ==============");
			imprimirExtratos(banco.getListaCliente());
			
		}
		
		private static void imprimirExtratos(List<Cliente> clientes) {
			for(int i = 0; i < clientes.size(); i++) {
				imprimirExtrato(clientes.get(i).getContaCorrente(), clientes.get(i).getContaPoupanca());
				System.out.println("----------");
			}
			
		}

		private static void imprimirExtrato(Conta cc, Conta cp) {
			cc.imprimirExtrato();
			cp.imprimirExtrato();
		}

	}
