import java.util.Scanner;

public class tema3_ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,suma=0,contador=0;
		do{
			System.out.println("Introduce el numero: ");
			n=teclado.nextInt();
			if(n!=0){
				contador++;
				suma+=n;}
			}while(n!=0); 		
			System.out.println("La suma es: "+ suma +" "+"La cantidad de valores introducidos es: "+contador);
			
			
			
		

	}

}
