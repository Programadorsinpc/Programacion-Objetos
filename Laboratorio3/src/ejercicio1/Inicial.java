
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicial {
	public static void main (String arg[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//Bienvenida al programa
		System.out.println("、IENVENIDOS!\n Este programa permite c嫮cular el 嫫ea de tres figuras geom彋ricas");
		
		int opcion;
		double lado, radio, dMay,dMen;
		double area;
		int fin;
		do {
			//Menu de opciones
			System.out.println ("Ingrese el nero de la figura a la que desea calcularle el 嫫ea:\n\t1) Cuadrado\n\t2) Rombo\n\t3)Circulo");
			opcion= Integer.parseInt(in.readLine());
			
			//Area de cuadrado
			if(opcion==1) {
				do {
					System.out.print("Ingrese el lado del cuadrado: ");
					lado= Double.parseDouble(in.readLine());
					if(lado>0)
						System.out.print("El 嫫ea del cuadrado es: "+ Math.pow(lado, 2));
					if(lado<=0)System.out.println("El lado del cuadrado no es valido");
				}
				while(lado<=0);
			}
			//Area de rombo
			else if(opcion==2) {
				do {
					System.out.print("Ingrese la diagonal mayor: ");
					dMay=Double.parseDouble(in.readLine());
					System.out.print("Ingrese la diagonal menor: ");
					dMen=Double.parseDouble(in.readLine());
					if(dMen>dMay || dMen<=0 || dMay<=0){
						System.out.println("Los datos son erroneos");
					}
				}
				while(dMen>dMay || dMen<=0 || dMay<=0);
				area=(dMay*dMen)/2;
				area=Math.round(area*100.0)/100.0;
				System.out.println("El 嫫ea del rombo es: "+((dMay*dMen)/2));
			}
			
			//Area de circulo
			else if(opcion==3) {
				do {
					System.out.print("Ingrese el radio del circulo: ");
					radio=Double.parseDouble(in.readLine());
					if(radio<0) {
						System.out.println("El radio es negativo");
					}
				}
				while(radio<0);				
				area=Math.PI*(Math.pow(radio, 2));
				area=Math.round(area*100.0)/100.0;
				System.out.println("El 嫫ea del circulo es: "+ Math.PI*(Math.pow(radio, 2)));
			}
			
			//Opcion invalida
			else {
				System.out.println("Esta no es una opci鏮 v嫮ida\n");
			}
			
			//Nuevo c嫮culo
			System.out.println("\nSi desea finalizar el programa ingrese 0, de lo contrario ingrese otro nero\n");
			fin= Integer.parseInt(in.readLine());
		}
		while(fin!=0);
		
		System.out.println("Gracias por utilizar nuestro servicio\n");
	}
}
