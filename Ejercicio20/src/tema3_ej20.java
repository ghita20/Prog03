//Calcula numeros factoriales hasta que introduzcamos un 0
//imprimirá el factorial de 0 también
import java.util.Scanner;
public class tema3_ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,factorial;
		do{
			System.out.println("Introduce un numero: ");
			n=teclado.nextInt();
			//compruebo que el numero es natural desde +0 a infinito
			if(n>=0){
				factorial=1;//reinicio factorial con 1 ya que todos los numeros tienen en la operación el 1
				if(n!=0){//si n no es 0
					//voy multiplicando cada numero por el producto de los anteriores
					for(int i=2;i<=n;i++)
						factorial*=i;
					//imprimo el factorial
					System.out.println("El factorial de "+n +" es " +factorial +".");
				}else //si introducimos 0
					System.out.println("El factorial de "+n +" es " +factorial +".");
			}else
				System.out.println("Número incorrecto.");
		
		}while(n!=0);
	}

}
