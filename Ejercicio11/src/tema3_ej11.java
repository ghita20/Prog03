import java.util.Scanner;

public class tema3_ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i=2,k=1,primo=0;
		System.out.print("Introduce N: ");
		N=teclado.nextInt();
		if(N<=1)
			System.out.println("No hay primos.");
		else
			while(i<N){
				k=1;
				primo=0;
				while(k<=i){
					if(i%k==0)
						primo++;
					k++;
				}
				if(primo==2)
					System.out.print(i +" ");
				i++;
			}
		
	}

}
