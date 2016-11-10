import java.util.Scanner;

public class tema3_ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion,base=0,altura=0;
		do{
			System.out.println("Elige un tipo de figura.");
			System.out.println("1.Triángulo 2.Cuadrado 3.Rectángulo");
			opcion=teclado.nextInt();
		}while(opcion<1 || opcion>3);
		
		switch(opcion){
			case 1: System.out.println("Introduce la base: ");
					base=teclado.nextInt();
					System.out.println("Introduce la altura: ");
					altura=teclado.nextInt();
					System.out.println("El área del triangulo es: " +base*altura/2); break;
			case 2: 
					System.out.println("Introduce la base: ");
					base=teclado.nextInt();
					System.out.println("El área del cuadrado es: " +Math.pow(base, 2)); break;
			case 3: 
					System.out.println("Introduce la base: ");
					base=teclado.nextInt();
					System.out.println("Introduce la altura: ");
					altura=teclado.nextInt();
					System.out.println("El área del rectángulo es: " +base*altura); break;
					
		}
	}

}
