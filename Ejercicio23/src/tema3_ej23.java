import java.util.Scanner;

public class tema3_ej23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=0,ceros=0;
		boolean cosa=true;
		do{
			System.out.println("Introduce el número: ");
			numero=teclado.nextInt();
			int longitud=0,residuo=0;
			while(residuo!=0){
				if(longitud==0)
					residuo=numero;
				residuo/=10;
				if(residuo!=0)
					longitud++;
			}
			residuo=numero;
			while(cosa){
				residuo/=10;
				if(residuo==0)
					cosa=false;
				else
					ceros++;
			}
			
		}while(numero>=0);
		System.out.println(ceros);
	}

}
