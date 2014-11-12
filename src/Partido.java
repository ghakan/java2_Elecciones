public class Partido {
		private String nombre;
		private int n_miembros;
        private String presidente;
        private String tipo;

public Partido(){
        this.nombre = "";
        this.n_miembros = 0;
        this.presidente = "";
        this.tipo = "";
    }

    public Partido(String nombre, int n_miembros, String presidente, String tipo)
        {   this.nombre = nombre;
            this.n_miembros = n_miembros;
            this.presidente = presidente;
            this.tipo = tipo;
        }

    // SET
	public void setNombrePar(String dato){
    	this.nombre = dato;
    }
    public void setN_MiembrosPar(int dato){
    	this.n_miembros = dato;
    }
    public void setPresidentePar(String dato){
        this.presidente = dato;
    }
    public void setTipoPar(String dato){
        this.tipo = dato;
    }

    // GET
    public String getNombrePar() {
        return this.nombre;
    }
    public int getN_MiembrosPar() {
        return this.n_miembros;
    }
     public String getPresidentePar() {
        return this.presidente;
    }
     public String getTipoPar() {
        return this.tipo;
    }
}