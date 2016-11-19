//Dado un numero n imprime sus divisores excepto n
import java.util.Scanner;
public class t3_ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,i=1;
		
		System.out.println("Introduce el numero: ");
		n=teclado.nextInt();
		
		System.out.println("LOS DIVISORES DE "+n +" SON:");
		//mientras i sea menor que n, no queremos que pruebe si n es divisor
		//por tanto no hace falta poner el <=
		while(i<n){
			
			//resto de n*i es igual a 0? entonces imprimo el divisor
			System.out.print(n%i==0?i +" ":"");	
			//aumento i en +1
			i++;
		}

		
	}

}
