/*
 * Programa: Este programa calcula la ecuación de la linea recta dado un punto y una linea
 * Autor: Juan David Martínez Herrera
 * Fecha: 11/05/2022
 * 
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicial {
	public static void main (String arg[]) throws IOException{
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));

		//Bienvenida al programa
		System.out.println("BIENVENIDOS\n Este programa calcula la ecuación de la linea recta dado un punto y una linea");
		
		int fin;
		double pendiente, x1,y1;
		String a;
		do {
			//Lectura de variables
			System.out.print("Ingrese el valor de la pendiente: ");
			pendiente=Double.parseDouble(in.readLine());
			System.out.print("Ingrese el valor de x del punto: ");
			x1=Double.parseDouble(in.readLine());
			System.out.print("Ingrese el valor de y del punto: ");
			y1=Double.parseDouble(in.readLine());
			a="y= "+String.valueOf(pendiente)+"x"+String.valueOf(y1-x1*pendiente);
			
			//Muestra de resultado
			System.out.println("La ecuación del a recta es:");
			for(int i=0;i<a.length()+2;i++){
				System.out.print("_");
			}
			System.out.println("\n|y= "+pendiente+"x "+ (y1-(x1*pendiente))+"|\n");
			for(int i=0;i<a.length()+2;i++) {
				System.out.print("¯");
			}
			
			//Opción de nuevo cálculo
			System.out.println("\n\nSi desea finalizar el programa ingrese 0, de lo contrario ingrese otro número");
			fin=Integer.parseInt(in.readLine());
		}
		while(fin!=0);
		System.out.println("Gracias por utilizar nuestros servicios\n");
	}
}
