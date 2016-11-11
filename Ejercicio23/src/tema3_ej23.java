import java.util.Scanner;

public class tema3_ej23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n, residuo=0,cero=0;
		do{
			System.out.println("introduce un valor: ");
			n=teclado.nextInt();
			
			if(n==0) //si n=0 aumento 0 en 1
				cero++;
			else{
				residuo=n; //esta variable la uso para poder ir dividiendo entre 10
				while(residuo!=0){
				cero=residuo%10==0?cero+1:cero; //si encuentra un 0 aumenta en 1 cero
					residuo/=10;
				}//fin del while
			}//fin del elses
				
			
		}while(n>=0);
		System.out.println("La cantidad de 0s introducidos es: " +cero);
	}

}
