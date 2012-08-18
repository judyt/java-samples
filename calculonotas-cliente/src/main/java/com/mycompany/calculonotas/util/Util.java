package com.mycompany.calculonotas.util;

public class Util {

	//redondea al numero a dos digitos
	public static double Redondear(double numero)
	{
	       return Math.rint(numero*100)/100;
	}
}
