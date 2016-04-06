package br.com.philippe.util;

import java.util.ArrayList;
import java.util.List;

import br.com.philippe.model.TipoClienteEnum;

/**
 * Está classe é responsável por extrair os dados passados como parâmetros para a aplicação.
 * Ela encontra o tipo de cliente que deseja buscar um hotel, 
 * e também os dias da semana da hospedagem deste cliente.
 * @author philippe
 *
 */
public class StringUtils {

	/**
	 * Este método realiza a estração do tipo de cliente ao qual
	 * será verificado se possui desconto ou não. Ele é convertido
	 * para uma classe do tipo {@link TipoClienteEnum}.
	 * 
	 * @param entrada
	 * @return
	 */
	public static TipoClienteEnum extrairTipoCliente(String entrada) {
		int indexFimTipoCliente = entrada.indexOf(':');
		
		String tipoCliente = entrada.substring(0, indexFimTipoCliente).toLowerCase();
		TipoClienteEnum enumCliente = TipoClienteEnum.getFromValue(tipoCliente);
		
		return enumCliente;
	}

	
	/**
	 * Este método extraí todos as dadas de hospedagem de um cliente.
	 * Ao final retorna somente o dia da semana ao qual o cliente estará
	 * hospedado.
	 * 
	 * @param entrada
	 * @return
	 */
	public static List<String> extrairDatas(String[] entradas) {
		List<String> listaDeDatas = new ArrayList<String>();
		
		for (int i = 0; i < entradas.length; i++) {
			String dataExtraida = extrairDiaDaSemana(entradas[i]);

			if(dataExtraida != null){
				listaDeDatas.add(dataExtraida);
			}
			
		}
		
		return listaDeDatas;
	}
	
	/**
	 * Método responsável por extrair de uma determinada data, qual o
	 * dia da semana está data é.
	 * @param entrada
	 * @return
	 */
	public static String extrairDiaDaSemana(String entrada) {
		if(!validarData(entrada)) return null;
		entrada = entrada.replaceAll("\\s", "");
		String diaDaSemana = entrada.substring(entrada.indexOf('(')+1, entrada.indexOf(')'));
		return diaDaSemana;
	}
	
	/**
	 * Método responsável por verificar se o dia da semana pode ser extraído.
	 * @param date
	 * @return
	 */
	private static boolean validarData(String date) {
		boolean dataValida = false;
		
		if(date.contains("(") 
				&& date.contains(")") ){
			dataValida = true;
		}
		
		return dataValida;
	}

}