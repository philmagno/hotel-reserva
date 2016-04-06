package br.com.philippe;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
 
	@Test
	public void testeExtracaoDoInput01(){
		String[] input = {"Regular:", "16Mar2015(seg),",  "17Mar2015(ter),", "18Mar2015(qua)"};
		Main.main(input);
	}
	
	@Test
	public void testeExtracaoDoInput02(){
		String[] input = {"Regular:", "20Mar2015(sex)", "21Mar2015(sab),", "22Mar2015(dom)"};
		Main.main(input);
	}
	
	@Test
	public void testeExtracaoDoInput(){
		String[] input = {"Vip:", "26Mar2015(qui)", "27Mar2015(sex),", "28Mar2015(sab)"};
		Main.main(input);
	}
}