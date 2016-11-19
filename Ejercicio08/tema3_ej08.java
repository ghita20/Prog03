//este programa calcula el factorial de un número
import java.util.Scanner;
public class tema3_ej08 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,i=2,f=1;
		//empiezo i en 2 porque es innecesario multiplicar 1x1
		//y f=1 porque 1x1 es = 1
		System.out.println("Introduce el numero que deseas realizar el factorial: ");
		n=teclado.nextInt();
	
		if(n==1);//si n==1 ya no calculo el factorial y paso ya al System.out.print
			else 
				do{
					//multiplico la anterior multiplicación por i
					f*=i;
					i++;
				}while(i<=n);
		
		//si n>0 imprimo su factorial si no imprimo que es incorrecto
		System.out.println(n>0?"El factorial es: " +f:"El número es incorrecto");
	}

}