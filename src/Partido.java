public class Partido {
		private String nombre;
		private int n_miembros;


	public void setNombrePar(String dato){
    	this.nombre = dato;
    }

    public void setN_MiembrosPar(int dato){
    	this.n_miembros = dato;
    }

    public String getNombrePar() {
        return this.nombre;
    }

    public int getN_MiembrosPar() {
        return this.n_miembros;
    }
}