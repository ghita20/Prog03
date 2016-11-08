import java.util.Scanner;

public class tema3_ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i=1,divisores=0;
		System.out.print("Introduce N: ");
		N=teclado.nextInt();
		
		if(N==1)
			System.out.println("No es perfecto.");
		else{
			
			while(i<N){
				if(N%i==0)
					divisores+=i;
				i++;
			}
			if(divisores==N)
				System.out.println("Es perfecto.");
			else
				System.out.println("No es perfecto.");
			
			
		}
	}

}
