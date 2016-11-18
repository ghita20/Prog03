//Programa que obtenga el producto de dos números enteros positivos dados por teclado mediante
//sumas sucesivas y lo muestre en pantalla.
import java.util.Scanner;
public class tema3_ej24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n1,n2,suma=0,i=1;
		
		System.out.println("Introduce el numero 1: ");
		n1=teclado.nextInt();
		
		System.out.println("Introduce el numero 2: ");
		n2=teclado.nextInt();
		
		while(i<=n2){
			suma+=n1;
			i++;
		}
		System.out.println("El producto de " +n1 +" x " +n2 +" = " +suma);
		
	}

}
