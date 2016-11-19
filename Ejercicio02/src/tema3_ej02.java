//Programa que pide un numero entre 1 y 100 y imprime su tabla de multiplicar
import java.util.Scanner;
public class tema3_ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i=1,n;
		
		System.out.println("Introduce un número entre 1 y 100: ");
		n=teclado.nextInt();
		//si el numero es menor que 1 y mayor que 100 es incorrecto
		if(n<1 || n>100)
			System.out.println("Número incorrecto.");
		else{
			System.out.println("TABLA DE MULTIPLICAR DE " +n);
			while(i<=10){
				//imprimo el numero, luego i que es igual al numero por el que se multiplica
				//y después imprimo n*i
				System.out.println(n +" * " +i +" = " +n*i);
				//aumento i en +1
				i++;
			}//fin del while
		}//fin del else
	}

}
