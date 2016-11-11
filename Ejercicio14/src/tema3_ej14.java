//Lee un número de 3 cifras y lo invierte
import java.util.Scanner;
public class tema3_ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,longitud=0,r=0;
		boolean cosa=false;
		do{
		System.out.println("Introduce un número de 3 cifras.");
		N=teclado.nextInt();
		r=N;//esta variable la uso para hacer las operaciones con N para no modificar el contenido de N
		//en este bucle averiguo la longitud de N
		while(!cosa){
			if(r%10!=0)
				longitud++;
			else
				cosa=true;
			r/=10;
		}

		}while(longitud!=3);//si la longitud es diferente de 3 pido N de nuevo
		int i=1;
		r=N;
		while(i<=3){
			System.out.print(r%10);//imprimo el ultimo número ya que por ejemplo 123%10=3
			r/=10;//voy quitando un número ya que por ejemplo 123/10=12
			i++;
			
		}
		
	}

}
