//Pide números hasta que introduzcas 0
//además hace suma de los números introducidos en lugar par y de los introducidos en lugar impar,
import java.util.Scanner;
public class tema3_ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,suma_par=0,suma_impar=0,cantidad=0;
		do{
			System.out.println("Introduce el numero: ");
			n=teclado.nextInt();
			if(n!=0){//si n==0 no queremos hacer lo del if ya que estropearía todo
				++cantidad;
				if(cantidad%2==0)//si la cantidad es par sumamos n a la suma_par
					suma_par+=n;
				else
					suma_impar+=n;
			}//fin del if
			
		}while(n!=0); 		
		System.out.println("La suma de los numeros pares: "+ suma_par +" "+"La suma de los numeros impares: " +suma_impar);


	}

}
