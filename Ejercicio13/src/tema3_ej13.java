//Calcula ecuaciones de 2º grado si existen raices reales
import java.util.Scanner;
public class tema3_ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		double resultado1,resultado2;//guardo el resultado en double por si hay decimales
		double raiz;
		String cosa="";
		
		System.out.println("Introduce el valor de a: ");
		a=teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		b=teclado.nextInt();
		System.out.println("Introduce el valor de c: ");
		c=teclado.nextInt();
		
		raiz=Math.sqrt(Math.pow(b, 2)-4*(a*c)); //hago la raiz cuadrada
		
		if(raiz<=0 || raiz>0){//si la raiz no es un número entero no tiene solución
		if(raiz<0)
			System.out.println("No tiene solución.");
		else{
			resultado1=(-b+raiz)/(2*a);
			resultado2=(-b-raiz)/(2*a);
			//si el resultado es igual solo imprimo uno de los resultados
			cosa=resultado1==resultado2?"El resultado es: " +resultado1:"Resultado 1: " +resultado1 +" Resultado 2: " +resultado2;
			System.out.println(cosa);
			}
		} else
			System.out.println("No tiene solución.");
	}

}
