package br.com.philippe.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.philippe.model.TipoClienteEnum;

public class StringUtilsTest {

	@Test
	public void verificaCriacaoClienteRegular() {
		String tipoCliente = "Regular:";
		TipoClienteEnum tipoClienteEnum = StringUtils.extrairTipoCliente(tipoCliente);
		
		assertEquals(tipoClienteEnum, TipoClienteEnum.REGULAR);
	}
	
	@Test
	public void verificaCriacaoClienteVip() {
		String tipoCliente = "Vip:";
		TipoClienteEnum tipoClienteEnum = StringUtils.extrairTipoCliente(tipoCliente);
		
		assertEquals(tipoClienteEnum, TipoClienteEnum.VIP);
	}
	
	@Test
	public void verificaCriacaoClienteInvalido() {
		String tipoCliente = "RegularVip:";
		TipoClienteEnum tipoClienteEnum = StringUtils.extrairTipoCliente(tipoCliente);
		
		assertEquals(tipoClienteEnum, null);
	}
	
	@Test
	public void verificaExtracaoDiaDaSemana() {
		String data = "16Mar2015(seg),";
		String diaDaSemana = StringUtils.extrairDiaDaSemana(data);
		
		assertEquals(diaDaSemana, "seg");
	}
	
	@Test
	public void verificaExtracaoDiaDaSemanaComEspaco() {
		String data = "16Mar2015(seg ),";
		String diaDaSemana = StringUtils.extrairDiaDaSemana(data);
		
		assertEquals(diaDaSemana, "seg");
	}
	
	@Test
	public void verificaExtracaoArrayDiasDaSemana() {
		String[] datas = {"16Mar2015(seg),", "17Mar2015(ter),", "18Mar2015(qua)"};
		List<String> diasDaSemana = StringUtils.extrairDatas(datas);
		
		List<String> esperado = Arrays.asList("seg", "ter", "qua");
		
		assertEquals(diasDaSemana.size(), esperado.size());
	}

}