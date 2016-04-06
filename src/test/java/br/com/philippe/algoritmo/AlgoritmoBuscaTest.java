package br.com.philippe.algoritmo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.philippe.model.Hotel;
import br.com.philippe.model.TipoClienteEnum;

public class AlgoritmoBuscaTest {
	
	private AlgoritmoBusca algoritmoBusca;
	@Before
	public void configurarTeste(){
		algoritmoBusca = new AlgoritmoBusca();
	}

	@Test
	public void verificarBuscaPorMelhorHotelCarlyle() {
		List<String> diasDaSemana = Arrays.asList("seg","ter","qua");
		int[] valoresDiaria = {110, 80, 90, 80};
		
		Hotel esperado = new Hotel("The Carlyle", 3, valoresDiaria);
		Hotel melhorHotel = algoritmoBusca.pesquisarMelhorHotel(TipoClienteEnum.REGULAR, diasDaSemana);
		
		assertEquals(melhorHotel, esperado);
	}
	
	@Test
	public void verificarBuscaPorMelhorHotelPlaza() {
		List<String> diasDaSemana = Arrays.asList("sex","sab","dom");
		int[] valoresDiaria = {160, 110, 60, 50};
		
		Hotel esperado = new Hotel("The Plaza", 4, valoresDiaria);
		Hotel melhorHotel = algoritmoBusca.pesquisarMelhorHotel(TipoClienteEnum.REGULAR, diasDaSemana);
		
		assertEquals(melhorHotel, esperado);
	}
	
	@Test
	public void verificarBuscaPorMelhorHotelRoyal() {
		List<String> diasDaSemana = Arrays.asList("qui","sex","sab");
		int[] valoresDiaria = {220, 100, 150, 40};
		
		Hotel esperado = new Hotel("Royal Hotel", 5, valoresDiaria);
		Hotel melhorHotel = algoritmoBusca.pesquisarMelhorHotel(TipoClienteEnum.VIP, diasDaSemana);
		
		assertEquals(melhorHotel, esperado);
	}

}
