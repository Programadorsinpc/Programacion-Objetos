/*
 * Programa: Este programa determina la bonificación de un empleado
 * Autor: Juan David Martínez Herrera
 * Fecha: 11/05/2022
 * 
 * */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String args[])throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader (System.in));
		//Bienvenida del programa
		System.out.println("¡Bienvenido!\nEste programa determina la bonificación de un empleado");

		double salario;
		int fin;
		//Calculo de porcentajes
		do {
			do {
				System.out.println("Ingrese el salario del empleado\n");
				salario=Double.parseDouble(in.readLine());
				if (salario<0)System.out.println("El salario es negativo");				
			}
			while(salario<=0);
			if(salario>=1000000) {
				System.out.println("El salario a pagar es: $"+ (salario+(salario*0.03)));
			}
			else if(salario>=700000 && salario<=999999) {
				System.out.println("El salario a pagar es: $"+(salario+(salario*0.05)));
			}
			else if(salario>=400000 && salario<=699999) {
				System.out.println("El salario a pagar es: $"+(salario+(salario*0.07)));
			}
			else
				System.out.println("El salario a pagar es: $"+(salario+(salario*0.2)));
			
		
			System.out.println("Si desea finalizar el programa ingrese 0, si desea hacer un nuevo calculo ingrese cualquier número");
			fin=Integer.parseInt(in.readLine());
		}
		while(fin!=0);
		System.out.println("Gracias por utilizar nuestros servicios\n");
	}
}
