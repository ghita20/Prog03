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
		r=N;
		while(!cosa){
			if(r%10!=0)
				longitud++;
			else
				cosa=true;
			r/=10;
		}

		}while(longitud!=3);
		int i=1;
		r=N;
		while(i<=3){
			System.out.print(r%10);
			r/=10;
			i++;
			
		}
		
	}

}
