//Dado un número N, imprime la lista de todos los números
//primos hasta N(sin incluir N)
import java.util.Scanner;
public class tema3_ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i=2,k=1,primo=0;
		System.out.print("Introduce N: ");
		N=teclado.nextInt();
		
		if(N<=1)
			System.out.println("No hay primos.");
		else
			while(i<N){
				k=1; //reinicializo variables para usarlas con el siguiente numero i
				primo=0;
				while(k<=i){
					//si i tiene como divisor k aumento primo en 1
					primo=i%k==0?++primo:primo;
					k++;
				}
				//si primo==2 imprimo el numero, si no imprimo la nada xD
				System.out.print(primo==2?i +" ":"");
				i++;
			}
		
	}

}
