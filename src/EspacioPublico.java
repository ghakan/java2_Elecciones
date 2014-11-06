public class EspacioPublico {
		private	String nombre;
		private String tipo; //calle, plaza...
		private String localidad;
		private String direccion;

	public void setNombreEsp(String dato){
    	this.nomre = dato;
    }
	public void setTipoEsp(String dato){
    	this.tipo = dato;
    }
    public void setLocalidadEsp(String dato){
    	this.localidad = dato;
    }
    public void setDireccionEsp(String dato){
    	this.nombre = dato;
    }


    public String getNombreEsp() {
        return this.nombre;
    }
    public String getTipoEsp() {
        return this.tipo;
    }
    public String getLocalidadEsp() {
        return this.localidad;
    }
    public String getDireccionEsp() {
        return this.direccion;
    }
}

