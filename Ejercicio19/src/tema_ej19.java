//imprime la media de los primeros n numeros al cuadrado
import java.util.Scanner;
public class tema_ej19 {

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
			suma+=Math.pow(i, 2);
			cantidad++;
		}//fin del for
		
		//si max es 1 imprimo que la media es 1
		System.out.println(max==1?"La media de los primeros "+max +" numeros naturales al cuadrado es: 1":"La media de los primeros "+max +" numeros naturales al cuadrado es: " +(float)suma/cantidad);
		
		
	}

}
