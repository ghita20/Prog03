//Dado un numero N leído por teclado encontrar el numero primo mas cercano a él por exceso.
 
import java.util.Scanner;
public class tema3_ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i,k=1,primo=0;
		boolean cosa=false;

		System.out.println("Introduce N: ");
		N=teclado.nextInt();
		//i será N+1 para no probar si N es primo a que queremos
		//averiguar el siguiente número primo después de N, no nos importa si N es primo
		i=N+1;

		while(!cosa){
			primo=0;//reinicio variables
			k=1;
			while(k<=i){
				//si k es divisor de i aumento primo en 1
				primo=i%k==0?++primo:primo;
				k++;
			}
			
			if(primo==2)
				cosa=true;//si encuentro un número que solo tiene 2 divisores(primo) 
			else //si no, sigo probando
				i++;
		}
		
		System.out.println(i);

	}

}
