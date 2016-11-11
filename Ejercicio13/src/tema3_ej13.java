import java.util.Scanner;

public class tema3_ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		double resultado1,resultado2;
		double raiz;
		String cosa="";
		System.out.println("Introduce el valor de a: ");
		a=teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		b=teclado.nextInt();
		System.out.println("Introduce el valor de c: ");
		c=teclado.nextInt();
		
		raiz=Math.sqrt(Math.pow(b, 2)-4*(a*c));
		
		if(raiz<=0 || raiz>0){
		if(raiz<0)
			System.out.println("No tiene solución.");
		else{
			resultado1=(-b+raiz)/(2*a);
			resultado2=(-b-raiz)/(2*a);
			
			cosa=resultado1==resultado2?"El resultado es: " +resultado1:"Resultado 1: " +resultado1 +" Resultado 2: " +resultado2;
			System.out.println(cosa);
			}
		} else
			System.out.println("No tiene solución.");
	}

}
