import java.util.Scanner;

public class tema3_ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N=0, elMayor=0,elMenor=0,media,cantidad=0,suma=0,r=0;
		do{

			System.out.println("Introduce numero: ");
			N=teclado.nextInt();

			if(N!=0){
				suma+=N;
				cantidad++;
				if(N>elMayor)
					elMayor=N;
				if(cantidad==1)
					elMenor=N;
				if(N<elMenor)
					elMenor=N;
			}
		}while(N!=0);
		System.out.println("Media =" +suma/cantidad);
		System.out.println("El mayor es: " +elMayor);
		System.out.println("El menor es: " +elMenor);

	}

}
