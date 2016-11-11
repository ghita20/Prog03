import java.util.Scanner;

public class tema3_ej13_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		double raiz,r1=0,r2=0;
		System.out.println("Introduce el primer valor");
		a=teclado.nextInt();
		System.out.println("Introduce el segundo valor");
		b=teclado.nextInt();
		System.out.println("Introduce el tercer valor");
		c=teclado.nextInt();
		raiz=Math.sqrt(Math.pow(-b, 2)-4*a*c);
		if(raiz<=0 || raiz>0){
		if(raiz<0)
			System.out.println("Es una raiz negativa por lo tanto no tiene resutado");
		else{
			r1=(-b+raiz)/(2*a);
			r2=(-b-raiz)/(2*a);}
		System.out.println("El primero resultado es: " + r1 + " "+"El segundo resultado es: " + r2);
		} else
			System.out.println("No tiene solución.");
		
		}

}
