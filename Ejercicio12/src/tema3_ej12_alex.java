import java.util.Scanner;

public class tema3_ej12_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,l=0,a=0,ar=0,b=0;
		System.out.println("Elige: 1=Triangulo 2=Cuadrado 3=Rectangulo");
		n=teclado.nextInt();
		
		switch(n){
		case 2: System.out.println("Intrduce el lado del cuadrado: ");
		l=teclado.nextInt();
		ar=l*l;
		System.out.println("El area del cuadrado es= "+ar); break;
		case 1: System.out.println("Introduce la base del triangulo: ");
		b=teclado.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		a=teclado.nextInt();
		ar=b*a/3; 
		System.out.println("El area del trinagulo es= "+ar); break;
		case 3: System.out.println("Introduce la base del rectangulo: ");
		b=teclado.nextInt();
		System.out.println("Introduce la altura del rectangulo: ");
		a=teclado.nextInt();
		ar=b*a;
		System.out.println("El area del rectangulo es: "+ar); break;
		default: System.out.println("El numero no pertenece a las figuras =)"); }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
