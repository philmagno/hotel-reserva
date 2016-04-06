package br.com.philippe.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe realiza um mapeamento dos todos os dias da semana.
 * Sua principal função é verificar se determinado dia é dia de semana
 * ou não, para que possa ser verificado o valor da diária.
 * 
 * @author philippe
 *
 */
public class DiaSemanaUtil {
	
	private static Map<String, Boolean> mapeamento = new HashMap<String, Boolean>();
	
	/**
	 * Este método preenche os dados da semana, sua função é mapear
	 * se um dia da semana é dia útil ou final de semana. 
	 * 
	 */
	static{
			mapeamento.put("seg",true);
			mapeamento.put("ter",true);
			mapeamento.put("qua",true);
			mapeamento.put("qui",true);
			mapeamento.put("sex",true);
			mapeamento.put("sab",false);
			mapeamento.put("dom",false);
	}
	
	/**
	 * Este método retorna se um dia da semana é dia útil ou final de semana. 
	 * 
	 */
	public static boolean isDiaSemana(String dia) throws IllegalArgumentException{
		Boolean isDiaSemana = mapeamento.get(dia);
		if(isDiaSemana != null){
			return mapeamento.get(dia);	
		}else{
			throw new IllegalArgumentException("Dia de semana Inexistente");
		}
		
	}
}