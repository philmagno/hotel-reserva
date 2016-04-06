package br.com.philippe.model;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class HotelTest {
	
	private Hotel hotel;
	
	@Before
	public void configurarTeste(){
		String nome = "Hotel JUnit";
		int[] valores = {110, 80, 90, 80};
		
		hotel = new Hotel(nome, 5, valores);
	}

	@Test
	public void verificaPrecoHospedagemRegularDiaDeSemana() {
		int valorEsperado = 330;
		
		int valoCalculado = hotel.obterPrecoHospedagem(TipoClienteEnum.REGULAR, Arrays.asList("seg", "ter", "qua"));
		
		assertEquals(valoCalculado, valorEsperado);
	}
	
	@Test
	public void verificaPrecoHospedagemRegularFimDeSemana() {
		int valorEsperado = 290;
		
		int valoCalculado = hotel.obterPrecoHospedagem(TipoClienteEnum.REGULAR, Arrays.asList("sex", "sab", "dom"));
		
		assertEquals(valoCalculado, valorEsperado);
	}
	
	@Test
	public void verificaPrecoHospedagemVipDiaDeSemana() {
		int valorEsperado = 240;
		
		int valoCalculado = hotel.obterPrecoHospedagem(TipoClienteEnum.VIP, Arrays.asList("seg", "ter", "qua"));
		
		assertEquals(valoCalculado, valorEsperado);
	}
	
	@Test
	public void verificaPrecoHospedagemVipFimDeSemana() {
		int valorEsperado = 240;
		
		int valoCalculado = hotel.obterPrecoHospedagem(TipoClienteEnum.VIP, Arrays.asList("sex", "sab", "dom"));
		
		assertEquals(valoCalculado, valorEsperado);
	}

}
