package br.com.philippe.model;

/**
 * Classe responsável por representar qual o tipo de cliente
 * ao qual o hotel deve verificar o preço da diária.
 * 
 * @author philippe
 *
 */
public enum TipoClienteEnum {
	REGULAR,
	VIP;
	
	/**
	 * Método responsável por criar um enum a partir do tipo de cliente
	 * passado como parâmetro.
	 * 
	 * @param tipoCliente
	 * @return
	 */
	public static TipoClienteEnum getFromValue(String tipoCliente) {
		switch(tipoCliente){
			case "regular": 
				return TipoClienteEnum.REGULAR;
			case "vip":
				return TipoClienteEnum.VIP;
			default:
				return null;
		}
	}
}