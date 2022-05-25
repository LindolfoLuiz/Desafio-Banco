import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> listaClientes;

	public void adicionarCliente(String nome) {
		listaClientes.add(new Cliente(nome));
	}

	public List<Cliente> getListaCliente() {
		return this.listaClientes;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaClientes = listaCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Banco(String nome, List<Conta> listaContas, List<Cliente> listaClientes) {
		this.nome = nome;
		this.listaClientes = listaClientes;
	}

	public Banco() {
		this.nome = "Banco Java Dio";
		this.listaClientes = new ArrayList<>();
	}

}


