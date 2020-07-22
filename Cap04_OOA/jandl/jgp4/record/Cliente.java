package jandl.jgp4.record;

public record Cliente (String nome, int id) { 
	// Adi��es do exemplo 4.67
	// Construtor can�nico com valida��o
	public Cliente(String nome, int id) {
		if (nome==null || nome.length()<2) {
			throw new IllegalArgumentException("Componente nome invalido: " + nome);
		}
		if (id<0) {
			throw new IllegalArgumentException("Componente id invalido: " + id);
		}
		this.nome = nome;
		this.id = id;
	}
	// Construtor com par�metro �nico
	public Cliente(String nome) {
		this(nome, 0);
	}
	// M�todo adicional: prenome (primeiro nome)
	public String prenome() {
		return nome.split(" ")[0];
	}
}
