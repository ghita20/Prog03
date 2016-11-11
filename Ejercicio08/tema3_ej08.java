//este programa calcula el factorial de un número
import java.util.Scanner;
public class tema3_ej8 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,i=2,f=1;
		System.out.println("Introduce el numero que deseas realizar el factorial: ");
		n=teclado.nextInt();
	
		if(n==1);//si n==1 ya no calculo el factorial y paso ya al System.out.print
		else do{
			f*=i;
			i++;
		}while(n>=i);
		
		//si n>0 imprimo su factorial si no imprimo que es incorrecto
		System.out.println(n>0?"El factorial es: " +f:"El número es incorrecto");
	}

}