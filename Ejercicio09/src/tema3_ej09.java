//programa que nos dice si un número es perfecto(la suma de sus divisores es el propio numero)
import java.util.Scanner;
public class tema3_ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i=1,divisores=0;
		System.out.print("Introduce N: ");
		N=teclado.nextInt();
		
		if(N==1 || N<=0)//1 y 0 no son perfectos y números negativos tampoco
			System.out.println("No es perfecto.");
		else{
			
			while(i<N){
				//si i es divisor de N sumo i a divisores, si no le sumo 0
				divisores+=N%i==0?i:0;
				i++;
			}
			//si la suma de los divisores=N es perfecto, si no no 
			System.out.println(divisores==N?"Es perfecto.":"No es perfecto.");

		}
	}

}
