import java.util.Scanner;
public class tema3_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,v=1,p=0;
		System.out.println("Introduce el valor");
		n=teclado.nextInt();
		while(n>=v){
		if(n%v==0)
		p++;
		v++;}
		if(p==2)
			System.out.println("Es primo");
		else 
			System.out.println("No es primo");
		
		
	}

}
