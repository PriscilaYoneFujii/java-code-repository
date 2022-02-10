package br.com.especies;

import br.com.animal.Animal;

public class Cachorro extends Animal{
	private String caracteristica;
	
	public Cachorro(String nome, float comprimento, int numero_patas, String cor, String ambiente, float velocidade_media, float peso, int idade, String caracteristica) {
		super(nome, comprimento,numero_patas, cor, ambiente, velocidade_media, peso, idade);
		this.caracteristica = caracteristica;
	}
	public void dadosCachorro() {
		dados();		
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
