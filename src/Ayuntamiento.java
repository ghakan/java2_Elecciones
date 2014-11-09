public class Ayuntamiento {
		private String nombre;
		private String nom_alcalde;
		private int n_trabajadores;
		private String localidad;
		private String direccion;

	public void setNombreAyu(String dato){
    	this.nombre = dato;
    }
    public void setNom_AlcaldeAyu(String dato){
    	this.nom_alcalde = dato;
    }
    public void setN_TrabajadoresAyu(int dato){
    	this.n_trabajadores = dato;
    }
    public void setLocalidadAyu(String dato){
    	this.localidad = dato;
    }
    public void setN_DireccionAyu(String dato){
    	this.direccion = dato;
    }

    public String getNombreAyu() {
        return this.nombre;
    }
    public String getNom_AlcaldeAyu() {
        return this.nom_alcalde;
    }
    public int getN_TrabajadoresAyu() {
        return this.n_trabajadores;
    }
    public String getLocalidadAyu() {
        return this.localidad;
    }
    public String getDireccionAyu() {
        return this.direccion;
    }
}