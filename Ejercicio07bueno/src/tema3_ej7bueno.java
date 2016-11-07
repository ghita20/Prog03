import java.util.Scanner;

public class tema3_ej7bueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,elMayor=0,elMenor=0,suma=0,cantidad=0;
		do{
			System.out.println("Introduce valores: ");
			n=teclado.nextInt();
			if(n!=0){
				cantidad++;
				suma+=n;
			if(n>elMayor)
				elMayor=n;
			if(cantidad==1)
				elMenor=n;
			else if(n<elMenor)
				elMenor=n;}
		}while(n!=0);
		
		System.out.println("La media es: " +suma/cantidad);
		System.out.println("El mayor es: " +elMayor);
		System.out.print("El menor es: " +elMenor);

		}
	}


