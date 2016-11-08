import java.util.Scanner;

public class tema3_ej8 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
	int n,i=2,f=1;
	System.out.println("Introduce el numero que deseas realizar el factorial: ");
	n=teclado.nextInt();

	if(n<=0)
		System.out.println("El numero es incorrecto");
	if(n==1)
		System.out.println("El factorial es: 1");
	else do{
	
		f*=i;
		i++;
	}while(n>=i);
		
	if(n!=1 && n!=0)
		System.out.println("El factorial es: " +f);
	}

}