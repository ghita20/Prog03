import java.util.Scanner;

public class tema3_ej11_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,i=2,primo=0;
		System.out.println("introduce");
		n=teclado.nextInt();
		while(n>i){
			int p=2;
			primo=0;
			while(i>=p){
			if(i%p==0)
				primo++;
			p++;}
			if(primo==1)
				System.out.println(i);
			
			
		i++;
			}
		}
	}


