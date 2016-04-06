package br.com.philippe.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DiaSemanaUtilTest {
	
	@Test
	public void verificaSeSegundaDiaDeSemana() {
		String diaSemana = "seg";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificaSeTercaDiaDeSemana() {
		String diaSemana = "ter";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificaSeQuartaDiaDeSemana() {
		String diaSemana = "qua";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificaSeQuintaDiaDeSemana() {
		String diaSemana = "qui";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificaSeSextaDiaDeSemana() {
		String diaSemana = "sex";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificaSeSabadoDiaDeSemana() {
		String diaSemana = "sab";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertFalse(resultado);
	}
	
	@Test
	public void verificaSeDomingoDiaDeSemana() {
		String diaSemana = "dom";
		boolean resultado = DiaSemanaUtil.isDiaSemana(diaSemana);
		
		assertFalse(resultado);
	}
	
	@Test(expected = IllegalArgumentException.class)  
	public void verificaExcecaoDiaInvalidoSemana() {
		String diaSemana = "mai";
		DiaSemanaUtil.isDiaSemana(diaSemana);
	}
}
