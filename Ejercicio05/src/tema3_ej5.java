//Programa que lee números hasta que el número introducido sea 0
//seguidamente imprime la suma y cantidad de numeros introducidos
import java.util.Scanner;
public class tema3_ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,suma=0,contador=0;
		do{
			System.out.println("Introduce el numero: ");
			n=teclado.nextInt();
			//si introducimos 0 no queremos que nos aumente el contador 
			//asi que la solución es un if
			if(n!=0){
				contador++;
				suma+=n;
				}//fin del if
			
			}while(n!=0); //hace el do mientras n sea diferente de 0
		
		System.out.println("La suma es: "+ suma +" "+". La cantidad de valores introducidos es: "+contador);
			
			
			
		

	}

}
