package br.com.philippe;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
 
	@Test
	public void testeExtracaoDoInput(){
		String[] input = {"Regular: 16Mar2015(seg), 17Mar2015(ter), 18Mar2015(qua)"};
		Main.main(input);
	}
}