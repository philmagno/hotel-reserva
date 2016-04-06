package br.com.philippe.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TipoClienteEnumTest {

	@Test
	public void verificarCriacaoClienteRegular() {
		String regular = "regular";
		TipoClienteEnum tipoCliente = TipoClienteEnum.getFromValue(regular);
		
		assertEquals(tipoCliente, TipoClienteEnum.REGULAR);
	}
	
	@Test
	public void verificarCriacaoClienteVip() {
		String regular = "vip";
		TipoClienteEnum tipoCliente = TipoClienteEnum.getFromValue(regular);
		
		assertEquals(tipoCliente, TipoClienteEnum.VIP);
	}
	
	@Test
	public void verificarCriacaoClienteInvalido() {
		String regular = "regvipular";
		TipoClienteEnum tipoCliente = TipoClienteEnum.getFromValue(regular);
		
		assertEquals(tipoCliente, null);
	}

}
