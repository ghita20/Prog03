import java.util.Scanner;

public class tema3_ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N,i,k=1,primo=0;
		boolean cosa=false;

		System.out.println("Introduce N: ");
		N=teclado.nextInt();
		i=N+1;

		while(!cosa){
			primo=0;
			k=1;
			while(k<=i){
				if(i%k==0)
					primo++;
				k++;
			}
			
			if(primo==2)
				cosa=true;
			else
				i++;
		}
		
		System.out.println(i);

	}

}
