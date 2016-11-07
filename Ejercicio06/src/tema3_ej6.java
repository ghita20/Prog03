import java.util.Scanner;

public class tema3_ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,suma_par=0,suma_impar=0;
		do{
			System.out.println("Introduce el numero: ");
			n=teclado.nextInt();
			if(n!=0){
				if(n%2==0)
					suma_par+=n;
				else 
					suma_impar+=n;}
		}while(n!=0); 		
		System.out.println("La suma de los numeros pares: "+ suma_par +" "+"La suma de los numeros impares: " +suma_impar);



	}

}
