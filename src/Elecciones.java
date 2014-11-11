import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

public class Elecciones {
		public static void main(String[] args) throws IOException{

		//Habitante
			Habitante ope_habitante = new Habitante();

			String[] resultadoHab = new String[4];
			int [] numresultadoHab = new int[3];
			double douresultadoHab;

		String hab_nombre = "Gorka";
		String hab_apellido = "Perez";
		String hab_sexo = "Hombre o algo asi";
		String hab_nacionalidad = "Spain" ;
		int hab_edad = 26;
		int hab_telefono = 94354657;
		int hab_peso = 80;
		double hab_altura = 1.80;

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
			resultadoHab[2] = ope_habitante.getSexoHab();
			resultadoHab[3] = ope_habitante.getNacionalidadHab();
			numresultadoHab[0] = ope_habitante.getEdadHab();
			numresultadoHab[1] = ope_habitante.getTelefonoHab();
			numresultadoHab[2] = ope_habitante.getPesoHab();
			douresultadoHab = ope_habitante.getAlturaHab();

			System.out.println("\n"+"Habitante:\n"+resultadoHab[0]+"\n"+resultadoHab[1]+"\n"
				+resultadoHab[2]+"\n"+resultadoHab[3]+"\n"+numresultadoHab[0]+" años\n"+numresultadoHab[1]+"\n"
				+numresultadoHab[2]+" Kg\n"+douresultadoHab+"\n");

			//Inmueble
			Inmueble ope_inmueble = new Inmueble();

			String[] resultadoInm = new String[4];

		String inm_tipo = "parcela"; //Tipo de inmueble, parcela, casa, finca
		String inm_antiguedad = "10-02-1986"; //fecha de construccion
		String inm_localidad = "Donostia";
		String inm_direccion = "Aranibar 7";

			ope_inmueble.setTipoInm(inm_tipo);
			ope_inmueble.setAntiguedadInm(inm_antiguedad);
			ope_inmueble.setLocalidadInm(inm_localidad);
			ope_inmueble.setDireccionInm(inm_direccion);

			resultadoInm[0] = ope_inmueble.getTipoInm();
			resultadoInm[1] = ope_inmueble.getAntiguedadInm();
			resultadoInm[2] = ope_inmueble.getLocalidadInm();
			resultadoInm[3] = ope_inmueble.getDireccionInm();

			System.out.println("\n"+"Inmueble:\n"+resultadoInm[0]+"\n"+resultadoInm[1]+"\n"
				+resultadoInm[2]+"\n"+resultadoInm[3]+"\n");

		//EspacioPublico
			EspacioPublico ope_espaciopublico = new EspacioPublico();

			String[] resultadoesp = new String[4];

		String esp_nombre = "Aranibar";
		String esp_tipo = "calle"; //calle, plaza...
		String esp_localidad = "Donsotia";
		String esp_direccion = "Aranibar";

			ope_espaciopublico.setNombreEsp(esp_nombre);
			ope_espaciopublico.setTipoEsp(esp_tipo);
			ope_espaciopublico.setLocalidadEsp(esp_localidad);
			ope_espaciopublico.setDireccionEsp(esp_direccion);

			resultadoesp[0] = ope_espaciopublico.getNombreEsp();
			resultadoesp[1] = ope_espaciopublico.getTipoEsp();
			resultadoesp[2] = ope_espaciopublico.getLocalidadEsp();
			resultadoesp[3] = ope_espaciopublico.getDireccionEsp();

			System.out.println("\n"+"Espacio Publico:\n"+resultadoesp[0]+"\n"+resultadoesp[1]+"\n"
				+resultadoesp[2]+"\n"+resultadoesp[3]+"\n");

		//Ayuntamiento
			Ayuntamiento ope_ayuntamiento = new Ayuntamiento();

			String[] resultadoayu = new String[4];
			int numresultadoayu;

		String ayu_nombre = "Nombre-Ayu";
		String ayu_nom_alcalde = "Pedro";
		String ayu_localidad = "Donostia";
		String ayu_direccion = "San-Pedro 5";
		int ayu_n_trabajadores = 23;

			ope_ayuntamiento.setNombreAyu(ayu_nombre);
			ope_ayuntamiento.setNom_AlcaldeAyu(ayu_nom_alcalde);
			ope_ayuntamiento.setLocalidadAyu(ayu_localidad);
			ope_ayuntamiento.setN_DireccionAyu(ayu_direccion);
			ope_ayuntamiento.setN_TrabajadoresAyu(ayu_n_trabajadores);

			resultadoayu[0] = ope_ayuntamiento.getNombreAyu();
			resultadoayu[1] = ope_ayuntamiento.getNom_AlcaldeAyu();
			resultadoayu[2] = ope_ayuntamiento.getLocalidadAyu();
			resultadoayu[3] = ope_ayuntamiento.getDireccionAyu();
			numresultadoayu = ope_ayuntamiento.getN_TrabajadoresAyu();

			System.out.println("\n"+"Ayuntamiento:\n"+resultadoayu[0]+"\n"+resultadoayu[1]+"\n"
				+resultadoayu[2]+"\n"+resultadoayu[3]+"\n"+numresultadoayu+"\n");

		//Partido
			/*Partido ope_partido = new Partido();
		String par_nombre = "KK";
		int par_n_miembros = 37; */


			BufferedReader fr = new BufferedReader(new FileReader("/home/zubiri/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt"));

			//Arraylist
			ArrayList<String> myarraylist = new ArrayList<String>();

			String contenido;
			  while ((contenido = fr.readLine()) != null) {
			       //System.out.println(contenido);
			       myarraylist.add(contenido);
			  } 
			 //Muestro los partidos que tiene el fichero
			System.out.println("\nPartidos que participan en las elecciones\n"+myarraylist);

			myarraylist.clear();
			if (myarraylist.size() == 0){
				System.out.println("\n ArrayList vaciado correctamente");
			}
		}
	}