package domain;

public abstract class Carro {
	
	private String modelo;
	private Integer ano;
	private String cor;
	
	public Carro() {
	}
	
	public Carro(String modelo, Integer ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public void imprimirCarro() {
		System.out.println("Carro: " + this.getClass().getSimpleName() + " " + modelo + " " + ano + " " + cor);
	}
}
