/*
 * Programa: Este programa hace conversiones entre los diversos sistemas 
 * Autor: Juan David Martínez Herrera
 * Fecha:11/05/2022
 * 
 * */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conversor {
	public static void main(String arg[])throws IOException{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("¡BIENVENIDOS!\n");
		System.out.println("Este programa permite hacer conversiones entre los distintos sistemas númericos\n");
		int fin=0;
		do {
			int caso;
			System.out.println("Ingrese el valor de la conversión que desea hacer:");
			System.out.println("1. Sistema binario a octal");
			System.out.println("2. Sistema octal a hexadecimal");
			System.out.println("3. Sistema binario a hexadecimal");
			System.out.println("4. Sistema octal a binario");
			System.out.println("5. Sistema hexadecimal a octal");
			System.out.println("6. Sistema hexadecimal a binario");			
			caso=Integer.parseInt(in.readLine());
			switch 
			
			
			fin=Integer.parseInt(in.readLine());
		}
		while(fin!=0);
	}
}
