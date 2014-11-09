import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

public class Elecciones {
		public static void main(String[] args) throws IOException{

		//Habitante
		String hab_nombre = "Gorka";
		String hab_apellido = "Perez";
		int hab_edad = 26;
		String hab_sexo = "H";
		double hab_altura = 1.80;
		int hab_peso = 80;
		String hab_nacionalidad = "Espana" ;
		int hab_telefono = 94354657;

		//Inmueble
		String inm_tipo = "parcela"; //Tipo de inmueble, parcela, casa, finca
		String inm_antiguedad = "10-02-1986"; //fecha de construccion
		String inm_localidad = "Donostia";
		String inm_direccion = "Aranibar 7";

		//EspacioPublico
		String esp_nombre = "Aranibar";
		String esp_tipo = "calle"; //calle, plaza...
		String esp_localidad = "Donsotia";
		String esp_direccion = "Aranibar";

		//Ayuntamiento
		String ayu_nombre = "Nombre-Ayu";
		String ayu_nom_alcalde = "Pedro";
		int ayu_n_trabajadores = 23;
		String ayu_localidad = "Donostia";
		String ayu_direccion = "San-Pedro 5";

		//Partido
		String par_nombre = "KK";
		int par_n_miembros = 37;

			String[] resultadoHab = new String[7];

			//Arraylist
			Scanner sc = new Scanner(System.in);

			//System.out.println("\nIntroduce nombre habitante");

			//hab_nombre = sc.next();

			Habitante ope_habitante = new Habitante();
			Inmueble ope_inmueble = new Inmueble();
			EspacioPublico ope_espaciopublico = new EspacioPublico();
			Ayuntamiento ope_ayuntamiento = new Ayuntamiento();
			Partido ope_partido = new Partido();

			FileReader fr = new FileReader("/home/zubiri/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");

			ArrayList<Character> arrayList = new ArrayList<Character>(10);


			char[] lpartidos = new char[50];

		  char [] mostrar = new char[50];
		  fr.read(mostrar); 

		  int linea=0;
		      for(char c : mostrar){
		        System.out.print(c);
		        arrayList.add(c);
		        linea++;
		      	}
		      fr.close();



			ope_habitante.setNombreHab(hab_nombre);
			ope_habitante.setApellidoHab(hab_apellido);
			/*ope_habitante.setEdadHab(hab_edad);
			ope_habitante.setSexoHab(hab_sexo);
			ope_habitante.setAturaHab(hab_altura);
			ope_habitante.setPesoHab(hab_peso);
			ope_habitante.setNacinalidadHab(hab_nacionalidad);
			ope_habitante.setTelefonoHab(hab_telefono);*/

		resultadoHab[0] = ope_habitante.getNombreHab();
		resultadoHab[1] = ope_habitante.getApellidoHab();
		/*resultadoHab[2] = ope_habitante.getEdadHab();
		resultadoHab[3] = ope_habitante.getSexoHab();
		resultadoHab[4] = ope_habitante.getAlturaHab();
		resultadoHab[5] = ope_habitante.getPesoHab();
		resultadoHab[6] = ope_habitante.getNacionalidadHab();
		resultadoHab[7] = ope_habitante.getTelefonoHab();

			System.out.println("\n"+resultadoHab[0]+"\n"+resultadoHab[1]+"\n"
				+resultadoHab[2]+"\n"+resultadoHab[3]+"\n"+resultadoHab[4]+"\n"+resultadoHab[5]+"\n"
				+resultadoHab[6]+"\n"+resultadoHab[7]+"\n"); */

			System.out.println("\n"+resultadoHab[0]+"\n"+resultadoHab[1]);

			System.out.println("\n"+arrayList);

		}
	}