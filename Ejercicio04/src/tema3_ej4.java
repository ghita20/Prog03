//Programa que dado un numero n imrpime si es o no primo
import java.util.Scanner;
public class tema3_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,i=2;
		boolean esPrimo=true;
		
		System.out.println("Introduce el número: ");
		n=teclado.nextInt();
		
		while(i<n && esPrimo){
			//si encuentra algún divisor significará que no es primo y salimos del bucle
			esPrimo= n%i==0?false:esPrimo;
			
			i++;
		}//fin del while
		
		//0 y 1 no son primos
		if(n<=0 || n==1)
			System.out.println("No es primo.");
		else
			//si esPrimo=true imprimo que es primo, si no, lo contrario
			System.out.println(esPrimo?"Es primo.":"No es primo.");
		


	}

}
