//Este programa pide un numero y un car�cter
//imprimir� ese car�cter tantas veces como el numero indique
import java.util.Scanner;
public class tema3_ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero;
		char caracter;
		String impresion="";
		
		do{
		System.out.println("Introduce el n�mero: ");
		numero=teclado.nextInt();
		//simpre despues de un int si necesitamos leer teclado otra vez pondremos .nextLine
		//porque sino seguir�a en la misma linea y generaria errores
		teclado.nextLine();
		}while(numero<=0 || numero>80);
		
		System.out.println("Introduce el car�cter: ");
		caracter=teclado.nextLine().charAt(0);
		//a�ado el car�cter al string impresion tantas veces como numero me indique
		for(int i=1;i<=numero;i++)
			impresion+=caracter;
		
		System.out.println(impresion);
	}

}
