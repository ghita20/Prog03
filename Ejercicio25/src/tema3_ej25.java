//Programa que suma los números del 1 al 100 que no terminan en 5.
import java.util.Scanner;
public class tema3_ej25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma=0;
		
		for(int i=2;i<100;i++)
			//si el resto de i entre 10 es 5 no sumo el numero
			suma=i%10==5?suma:suma+i;
		
		System.out.println(suma);
	}

}
