package br.com.philippe.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.philippe.model.Hotel;

public class HotelRepositoryTest {

	@Test
	public void verificaListaHoteis() {
		HotelRepository repository = new HotelRepository();
		
		List<Hotel> hoteis = repository.listarHoteis();
		assertEquals(hoteis.size(), 3);
	}

}