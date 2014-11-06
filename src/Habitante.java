
public class Habitante {

	//Propiedades | Atributos
		private String nombre;
		private String apellido;
		private int edad;
		private String sexo;
		private double altura;
		private int peso;
		private String nacionalidad;
		private int telefono;

	public void setNombreHab(String dato){
    	this.nombre = dato;
    }

    public void setApellidoHab(String dato){
    	this.apellido = dato;
    }

    public void setEdadHab(int dato){
    	this.edad = dato;
    }

    public void setSexoHab(String dato){
    	this.sexo = dato;
    }

    public void setAturaHab(double dato){
    	this.altura = dato;
    }

    public void setPesoHab(int dato){
    	this.peso = dato;
    }

    public void setNacinalidadHab(String dato){
    	this.nacionalidad = dato;
    }

    public void setTelefonoHab(int dato){
    	this.telefono = dato;
    }


 	public String getNombreHab() {
        return this.nombre;
    }

    public String getApellidoHab() {
        return this.apellido;
    }

 	public int getEdadHab() {
        return this.edad;
    }

    public String getSexoHab() {
        return this.sexo;
    }

    public double getAlturaHab() {
        return this.altura;
    }

    public int getPesoHab() {
        return this.peso;
    }

    public String getNacionalidadHab() {
        return this.nacionalidad;
    }

    public int getTelefonoHab() {
        return this.telefono;
    }
}