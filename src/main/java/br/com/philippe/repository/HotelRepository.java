package br.com.philippe.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.philippe.model.Hotel;

/**
 * Classe responsável por recuperar os hotéis disponíveis no sistema.
 * Esta classe visa simular o acesso ao banco de dados ou a um serviço para 
 * recuperação da lista dos mesmos.
 * @author philippe
 *
 */
public class HotelRepository {
	
	private List<Hotel> hoteis;
	
	/**
	 * Realiza a criação dos hotéis,e de seus atributos
	 * afim de serem utilizados no processamento.
	 * 
	 * Os valores das diárias estão distribuídos da seguinte maneira no array de preços:
	 * [0] preço dia de semana, cliente regular
	 * [1] preço dia de semana, cliente vip 
	 * [2] preço fim dia de semana, cliente regular
	 * [3] preço fim dia de semana, cliente vip 
	 */
	public HotelRepository(){
		hoteis = new ArrayList<Hotel>();
		
		int[] valores = {110, 80, 90, 80};
    	Hotel carlyle = new Hotel("The Carlyle",3, valores);
    	hoteis.add(carlyle);
    	
    	int[] valoresPlaza = {160, 110, 60, 50};
    	Hotel plaza = new Hotel("The Plaza",4, valoresPlaza);
    	hoteis.add(plaza);
    	
    	int[] valoresRoyal = {220, 100, 150, 40};
    	Hotel royal = new Hotel("Royal Hotel",5, valoresRoyal);
    	hoteis.add(royal);
	}
	
	/**
	 * Retorna a lista de hotéis disponíveis no sistema.
	 * @return
	 */
    public List<Hotel> listarHoteis(){
     	return hoteis;
    }

}
