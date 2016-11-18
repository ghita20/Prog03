//Pide 2 numeros y una opcion y según la opción incluirá los numeros en las operaciones.
//Imprimira los primos comprendidos entre esos dos numeros
//la suma de los pares e impares.
import java.util.Scanner;
public class tema3_ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion,n1,n2,primo=0,sumaPares=0,sumaImpares=0;
		String primosFinales="";
		do{
			System.out.println("Introduce el numero 1: ");
			n1=teclado.nextInt();
			
			System.out.println("Introduce el numero 2: ");
			n2=teclado.nextInt();
			}while(n2<=n1);
	
		do{
			System.out.println("Elige una opción: ");
			System.out.println("Imprimir el resultado - 1.Incluyendo ambos números 2.Sin incluirlos");
			opcion=teclado.nextInt();
		}while(opcion>2 || opcion<1);
		
		
		switch(opcion){
		case 1:
			//numeros primos
			for(int i=n1;i<=n2;i++){
				primo=0;
				for(int k=2;k<=i;k++)
					primo=i%k==0?++primo:primo;
				
				primosFinales=primo==1?primosFinales+i+" ":primosFinales;
			}
			//sumo los pares e impares
			for(int i=n1;i<=n2;i++){
				if(i%2!=0)
					sumaImpares+=i;
				else
					sumaPares+=i;
			}
			
			break;
		case 2:
			
				//numeros primos
				for(int i=n1+1;i<n2;i++){
					primo=0;
					for(int k=2;k<=i;k++)
						primo=i%k==0?++primo:primo;
					
					primosFinales=primo==1?primosFinales+i+" ":primosFinales;
				}
				//sumo los pares e impares
				for(int i=n1+1;i<n2;i++){
					if(i%2!=0)
						sumaImpares+=i;
					else
						sumaPares+=i;
				}
				break;
		}
		
		System.out.println("Los numeros primos comprendidos entre " +n1 +" y " +n2 + " son: ");
		System.out.println(primosFinales);
		System.out.println("La suma de los numeros pares es: " +sumaPares);
		System.out.println("La suma de los impares es: " +sumaImpares); 
	
			
	}

}
