import java.util.Objects;

public class Cliente {

	private String nome;
	private ContaCorrente contaCorrente;
	private ContaPoupanca contaPoupanca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public Cliente(String nome) {
		this.nome = nome;
		this.contaCorrente = new ContaCorrente(this);
		this.contaPoupanca = new ContaPoupanca(this);
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	

}