import java.util.Scanner;

public class Elecciones {
		public static void main(String[] args) {

		String hab_nombre = "Gorka";
		String hab_apellido = "Perez";
		int hab_edad = 26;
		String hab_sexo = "H";
		double hab_altura = 1.80;
		int hab_peso = 80;
		String hab_nacionalidad = "Espana" ;
		int hab_telefono = 94354657;

			String[] resultadoHab = new String[7];

			Arraylist
			Scanner sc = new Scanner(System.in);

			System.out.println("\nIntroduce nombre habitante");

			//hab_nombre = sc.next();

			Habitante ope_habitante = new Habitante();

			ope_habitante.setNombreHab(hab_nombre);
			ope_habitante.setApellidoHab(hab_apellido);
			ope_habitante.setEdadHab(hab_edad);
			ope_habitante.setSexoHab(hab_sexo);
			ope_habitante.setAturaHab(hab_altura);
			ope_habitante.setPesoHab(hab_peso);
			ope_habitante.setNacinalidadHab(hab_nacionalidad);
			ope_habitante.setTelefonoHab(hab_telefono);

		resultadoHab[0] = ope_habitante.getNombreHab();
		resultadoHab[1] = ope_habitante.getApellidoHab();
		resultadoHab[2] = ope_habitante.getEdadHab();
		resultadoHab[3] = ope_habitante.getSexoHab();
		resultadoHab[4] = ope_habitante.getAlturaHab();
		resultadoHab[5] = ope_habitante.getPesoHab();
		resultadoHab[6] = ope_habitante.getNacionalidadHab();
		resultadoHab[7] = ope_habitante.getTelefonoHab();


			System.out.println("\n"+resultadoHab[0]+"\n"+resultadoHab[1]+"\n"
				+resultadoHab[2]+"\n"+resultadoHab[3]+"\n"+resultadoHab[4]+"\n"+resultadoHab[5]+"\n"
				+resultadoHab[6]+"\n"+resultadoHab[7]+"\n");
		}
	}