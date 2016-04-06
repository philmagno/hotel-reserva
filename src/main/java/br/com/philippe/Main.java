package br.com.philippe;

import java.util.List;

import br.com.philippe.algoritmo.AlgoritmoBusca;
import br.com.philippe.model.Hotel;
import br.com.philippe.model.TipoClienteEnum;
import br.com.philippe.util.StringUtils;

/**
 * Esta é a classe principal do sistema, responsável por receber os parâmetros para execução,
 * assim como controlar a execução do programa.
 * 
 * @author philippe
 *
 */
public class Main {
	
	/**
	 * Método principal de todo programa Java.
	 * Realiza a extração dos parâmetros, conversão destes dados para o processamento.
	 * Por fim os passa como parâmetro para execução do algoritmo.
	 * 
	 * @param args
	 */
    public static void main( String[] args ){  	
    	
    	AlgoritmoBusca buscar = new AlgoritmoBusca();

    	TipoClienteEnum tipoCliente = StringUtils.extrairTipoCliente(args[0]);
		List<String> dias = StringUtils.extrairDatas(args);
		
		Hotel melhorHotel = buscar.pesquisarMelhorHotel(tipoCliente, dias);
		
		System.out.println(melhorHotel);
    }
    
}