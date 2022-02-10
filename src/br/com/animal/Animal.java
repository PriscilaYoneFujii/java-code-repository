package br.com.animal;
//import java.lang.reflect.Field;

public class Animal {
	private String nome;
	//private Alimento alimento;
	private float comprimento;
	private int numero_patas;
	private String cor;
	private String ambiente;
	private float velocidade_media;
	private float peso;
	private int idade;
	
	public Animal(String nome, float comprimento, int numero_patas, String cor, String ambiente, float velocidade_media, float peso, int idade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numero_patas = numero_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.idade = idade;
		this.peso = peso;
		this.velocidade_media = velocidade_media;
	}
	
	public void dados() {
		System.out.println(nome
				+"\n"+ comprimento
				+"\n"+ numero_patas
				+"\n"+ cor
				+"\n"+ ambiente
				+"\n"+ velocidade_media
				+"\n"+ peso
				+"\n"+ idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumero_patas() {
		return numero_patas;
	}
	public void setNumero_patas(int numero_patas) {
		this.numero_patas = numero_patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade_media() {
		return velocidade_media;
	}
	public void setVelocidade_media(float velocidade_media) {
		this.velocidade_media = velocidade_media;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
