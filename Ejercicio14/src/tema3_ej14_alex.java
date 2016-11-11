import java.util.Scanner;

public class tema3_ej14_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,a,b,c,resultado;
		do{
			System.out.println("Introduce un numero de 3 cifras");
			n=teclado.nextInt();
		}while(n<=100 || n>1000);
			a=n%10;
			resultado=n/10;
			b=resultado%10;
			resultado/=10;
			c=resultado%10;
		
			System.out.println(a +" "+ b +" "+ c);
		
	}

}
