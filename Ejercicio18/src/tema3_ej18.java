//Calcula la media de los primeros n numeros naturales n=max;
import java.util.Scanner;
public class tema3_ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma=0,cantidad=0,max;
		//cualquier numero menor o igual a 0 no es natural
		do{
		System.out.println("Introduce el max: ");
		max=teclado.nextInt();
		}while(max<=0);
		
		for(int i=1;i<=max;i++){
			suma+=i;
			cantidad++;
		}//fin del for
		
		//si max es 1 imprimo que la media es 1
		System.out.println(max==1?"La media de los primeros "+max +" numeros naturales es: 1":"La media de los primeros "+max +" numeros naturales es: " +(float)suma/cantidad);
		
		
	}

}
