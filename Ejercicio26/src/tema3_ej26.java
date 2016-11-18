
import java.util.Scanner;
public class tema3_ej26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String nombre,nombreAlumnoAnterior="";
		//hago la variable alumnoanterior para cuando introduzca FIN
		//no me lo pille como otro alumno mas
		int nota=0,media=0,mediaGrupo=0,cantidadAlumnos=0;
		do{
			System.out.println("Introduce el nombre del alumno: ");
			nombre=teclado.nextLine();
			if(!nombre.equals("FIN")){
				nombreAlumnoAnterior=nombre;
				cantidadAlumnos++;
				nota=0; //reinicio la nota
				//si el nombre es correcto aumento la cantidad de alumnos +1
				for(int i=1;i<=6;i++){
					System.out.println("Introduce la nota número " +i +" :");
					nota+=teclado.nextInt();
				}//fin del for
				//pongo esto para pasar de linea debido a que seguimos en la linea donde hemos escrito el int
				//y siempre despues de escribir un int hay que pasar linea sino nos guarda el buffer
				teclado.nextLine();
				media=nota/6;//divido entre 6 porque son 6 notas
				mediaGrupo+=media;
			}//fin del if
		}while(!nombre.equals("FIN"));
		
		System.out.println("El alumno " +nombreAlumnoAnterior +" tiene de media " +media +".");
		System.out.println("La media grupal es: " +mediaGrupo/cantidadAlumnos);
	}

}
