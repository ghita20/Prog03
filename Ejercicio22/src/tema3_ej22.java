import java.util.Scanner;

public class tema3_ej22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int mayores=0,edadMayor=0,edad=0,i=1;
		String nombre,nombreMayor="";
		do{
			System.out.println("Introduce el nombre: ");
			nombre=teclado.next();
			System.out.println("Introduce la edad: ");
			edad=teclado.nextInt();
			if(edad>=18)
				mayores++;
			if(i==1){
				edadMayor=edad;
				nombreMayor=nombre;
			}
			if(edad>edadMayor){
				edadMayor=edad;
				nombreMayor=nombre;
			}
			i++;
		}while(i<=10);
		System.out.println("El número de alumnos mayores de edad es: " +mayores +".");
		System.out.println("El alumno " +nombreMayor +" con " +edadMayor +" años, es el alumno más mayor.");
		
	}

}
