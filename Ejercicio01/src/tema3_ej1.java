import java.util.Scanner;
public class tema3_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,r;
		boolean cosa=false;
		do{
			System.out.print("Inroduce A: ");
			a=teclado.nextInt();
			System.out.print("Inroduce B: ");
			b=teclado.nextInt();
		}while(b<=a);
		
		r=0;
		while(!cosa){
			a++;
			if(a==b)
				cosa=true;
				else
					r+=a;
		}
			
	
	
		System.out.print(r);
	}}



