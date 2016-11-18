//Programa que calcula la media de los numeros naturales comprendidos entre 10 y 15 (incluidos)
import java.util.Scanner;
public class tema3_ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma=0,cantidad=0;
		
		for(int i=10;i<=15;i++){
			suma+=i;
			cantidad++;
			}//fin del for
		
		//pongo el resultado de suma/cantidad en un float porque la media suele tener decimales en muchas ocasiones
		System.out.println("La media de los numeros naturales entre 10 y 15 es: " +(float)suma/cantidad);
	}

}
