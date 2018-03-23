package Ficheros;

import java.util.Arrays;

public class Arrays {

	public void accion(String parametros, Object[] arr) throws Exception{
		int i =0;
		while(i<arr.length && arr.getparametro().compareTo(parametros)!=0) {
			i++
			}
		if(i<arr.length) {
			//Acciones
		}else {
			throws new Exception("404");
		}
	}
	
	
	public void add(Object a, Object[] arr) {
		
		if (arr==null)
			arr= new Object[1];
		else
			arr=Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1]=a;
	}
}
