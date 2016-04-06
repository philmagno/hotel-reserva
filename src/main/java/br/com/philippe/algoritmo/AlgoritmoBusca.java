package br.com.philippe.algoritmo;

import java.util.List;

import br.com.philippe.model.Hotel;
import br.com.philippe.model.TipoClienteEnum;
import br.com.philippe.repository.HotelRepository;

/**
 * Algoritmo de busca para encontrar o melhor preço de hospedagem 
 * para um determinado cliente. 
 * 
 * @author philippe
 *
 */
public class AlgoritmoBusca {
	
	private List<Hotel> hoteis;
	private HotelRepository repository = new HotelRepository();
	
	public AlgoritmoBusca(){
		hoteis = repository.listarHoteis();
	}
	
	/**
	 * Método responsável por encontrar o melhor preço para um determinado cliente,
	 * tendo em vista se este tem algum desconto, os dias em que estará hospedado, 
	 * e a rede de hotéis disponíveis no sistema.
	 * 
	 * @param tipoCliente
	 * @param dias
	 * @param hoteis
	 */
	public Hotel pesquisarMelhorHotel(TipoClienteEnum tipoCliente, List<String> dias){
		int totalFinal = -1;
		Hotel melhorHotel = null;
		
		for (Hotel hotel : hoteis) {
			int valorHospedagem = hotel.obterPrecoHospedagem(tipoCliente, dias);
			
			if(melhorHotel == null ||
					totalFinal > valorHospedagem){
				
				totalFinal = valorHospedagem;
				melhorHotel = hotel;
			}else if(totalFinal == valorHospedagem){
				if(hotel.getEstrelas() > melhorHotel.getEstrelas()){
					melhorHotel = hotel;
				}
			}
		}
		return melhorHotel;
	}
}