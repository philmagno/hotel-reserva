package br.com.philippe;

import java.util.Arrays;

public class Main {
	
    public static void main( String[] args ){
        
    	for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
    	
    	extrairString(args[0]);
    }
    
    private static void extrairString(String entrada){
    	int indexFimTipoCliente = entrada.indexOf(':');
    	
    	String tipoCliente = entrada.substring(0, indexFimTipoCliente);    	
    	System.out.println(tipoCliente);
    	
    	String stringDatas = entrada.substring(indexFimTipoCliente +1, entrada.length()).replaceAll("\\s", "");
    	System.out.println(stringDatas);
    	
    	String[] datasHospedagem = stringDatas.split(",");
    	System.out.println(Arrays.toString(datasHospedagem));
    }
}