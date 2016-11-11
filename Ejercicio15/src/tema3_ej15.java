//Pide 3 números y los muestra en forma ascendente
import java.util.Scanner;
public class tema3_ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c,mayor=0,medio=0,menor=0;
		System.out.println("Introduce a: ");
		a=teclado.nextInt();
		System.out.println("Introduce b: ");
		b=teclado.nextInt();
		System.out.println("Introduce c: ");
		c=teclado.nextInt();
		
		if(a>b)//hacemos las comprobaciones de cual es el mayor
			if(a>c){
				mayor=a;
				if(b>c){
					medio=b;
					menor=c;
				} else{
					medio=c;
					menor=b;
				}
				
			} else{
				mayor=c;
				medio=a;
				menor=b;
			}
		else
			if(b>c)
				if(c>a){
					menor=a;
					medio=c;
					mayor=b;
				} else{
					menor=c;
					medio=a;
					mayor=b;
				}
			else{
				mayor=c;
				medio=b;
				menor=a;
			}
		System.out.println(+menor +" " +medio +" " +mayor);
	}

}
