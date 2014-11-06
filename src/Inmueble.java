public class Inmueble {
		private String tipo; //Tipo de inmueble, parcela, casa, finca
		private String antiguedad; //fecha de construccion
		private String localidad;
		private String direccion;

	public void setTipoInm(String dato){
    	this.tipo = dato;
    }
	public void setAntiguedadInm(String dato){
    	this.antiguedad = dato;
    }
    public void setLocalidadInm(String dato){
    	this.localidad = dato;
    }
    public void setDireccionInm(String dato){
    	this.direccion = dato;
    }

    public String getTipoInm() {
        return this.tipo;
    }
    public String getAntiguedadInm() {
        return this.antiguedad;
    }
    public String getLocalidadInm() {
        return this.localidad;
    }
    public String getDireccionInm() {
        return this.direccion;
    }

}