//Programa que pide numeros hasta que introduzcas 0 y luego
// imprime la media de todos ellos, el mayor y el menor.
import java.util.Scanner;
public class tema3_ej7bueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,elMayor=0,elMenor=0,suma=0,cantidad=0;
		do{
			System.out.println("Introduce valores: ");
			n=teclado.nextInt();
			if(n!=0){ //esta condición es por si introducimos 0 ya no realice las comprobaciones (estropearía la media y el número menor)
				cantidad++;
				suma+=n;
			//si N es mayor que elMayor actualizamos el número Mayor
			elMayor=n>elMayor?n:elMayor;	
			
			if(cantidad==1)//el primer número srá el mas pequeño
				elMenor=n;
			else 
			//luego vamos comprobando si hay alguno mas pequeño que el primero
			elMenor=n<elMenor?n:elMenor;				
			}
		}while(n!=0);
		
		System.out.println("La media es: " +suma/cantidad);
		System.out.println("El mayor es: " +elMayor);
		System.out.print("El menor es: " +elMenor);

		}
	}


