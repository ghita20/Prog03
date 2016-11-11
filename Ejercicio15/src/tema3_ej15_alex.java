import java.util.Scanner;

public class tema3_ej15_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c,elMayor=0,medio=0,elMenor=0;
		System.out.println("Introduce el primer valor: ");
		a=teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		b=teclado.nextInt();
		System.out.println("Introduce el tercer valor: ");
		c=teclado.nextInt();
		if(a>b){
			if(a>c){
				elMayor=a;
				if(c>b){
					medio=c;
					elMenor=b;
				}else{
					medio=b;
					elMenor=c;}
			}else {
			elMayor=c;
			medio=a;
			elMenor=b;}
		}else {
			if(b>c){
			elMayor=b;
				if(c>a){
					medio=c;
					elMenor=a;
				}else {
						medio=a;
						elMenor=c;}
			}else{
				elMayor=c;
				medio=b;
				elMenor=a;}}
		System.out.println("El número mayor es: "+ elMayor + " El numero mediano es: "+ medio + " El numero menor es: "+ elMenor);
	}}
					
	
