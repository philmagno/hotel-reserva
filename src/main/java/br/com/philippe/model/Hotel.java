package br.com.philippe.model;

import java.util.Arrays;
import java.util.List;

import br.com.philippe.util.DiaSemanaUtil;

/**
 * Classe modelo para representação de um Hotel no sistema.
 * Nela estão contidas todas as informações relevantes do hotel: nome, estrelas, precos.
 * 
 * Para evitar o modelo anêmico de classes, alguns métodos de comportamento que a classe
 * deve fornecer estão contidos nesta classe, como o cálculo do valor da hospedagem para
 * os dias informados.
 * 
 * @author philippe
 *
 */
public class Hotel {
	
	private String nome;
	private int estrelas;
	private int[] precos;
	private int precoTotalHospedagem = 0; 
	
	public Hotel(String nome, int estrelas, int[] precos){
		this.nome = nome;
		this.estrelas = estrelas;
		this.precos = precos;
	}
	
	/**
	 * Realiza o processamento do valor total da hospedagem para um 
	 * determinado tipo de cliente, levando em consideração todos os 
	 * dias que o mesmo estará hospedado. 
	 * 
	 * @param tipoCliente
	 * @param dias
	 * @return
	 */
	public int obterPrecoHospedagem(TipoClienteEnum tipoCliente, List<String> dias){
		int precoTotalHospedagem = 0;
		for (int i = 0; i < dias.size(); i++) {
			precoTotalHospedagem += valorDiaria(tipoCliente, dias.get(i));
		}
		
		this.precoTotalHospedagem = precoTotalHospedagem;
		return precoTotalHospedagem;
	}
	
	/**
	 * Realiza a busca para o preço de um dia de hospedagem.
	 * Este método verifica qual o tipo de cliente, e qual dia da semana
	 * o mesmo está hospedando, para informar o valor da diária.
	 * 
	 * @param tipoCliente
	 * @param dia
	 * @return
	 */
	public int valorDiaria(TipoClienteEnum tipoCliente, String dia){
		boolean eDiaSemana  = DiaSemanaUtil.isDiaSemana(dia);
		
		if(eDiaSemana){
			if(tipoCliente.equals(TipoClienteEnum.REGULAR)){
				return precos[0];
			}else if(tipoCliente.equals(TipoClienteEnum.VIP)){
				return precos[1];
			}
		}else{
			if(tipoCliente.equals(TipoClienteEnum.REGULAR)){
				return precos[2];
			}else if(tipoCliente.equals(TipoClienteEnum.VIP)){
				return precos[3];
			}
		}
		
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public int[] getPrecos() {
		return precos;
	}

	public int getEstrelas() {
		return estrelas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estrelas;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(precos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (estrelas != other.estrelas)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(precos, other.precos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome + ": R$" + precoTotalHospedagem ;
	}
	
}