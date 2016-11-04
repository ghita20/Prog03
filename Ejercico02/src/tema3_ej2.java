import java.util.Scanner;
public class tema3_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N;
		do{
			System.out.print("Introduce el valor de N:");
			N=teclado.nextInt();
		}while(N<1 || N>100);
		int i=1;
		while(i<=10)
			System.out.println(N +" x " +i +" = " +N*i++);
		
	}

}
