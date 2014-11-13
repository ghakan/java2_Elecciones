
//package java2_Elecciones.src.Partido;

public class Partido {
		private String nombre;
		private String n_miembros;
        private String presidente;
        private String tipo;

    public Partido(String nom, String n_mie, String pres, String tip)
        {   setNombrePar(nom);
            setN_MiembrosPar(n_mie);
            setPresidentePar(pres);
            setTipoPar(tip);
        }

    // SET
	public void setNombrePar(String dato){
    	this.nombre = dato;
        //(System.out.println("\n "+nombre);
    }
    public void setN_MiembrosPar(String dato){
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
    public String getN_MiembrosPar() {
        return this.n_miembros;
    }
     public String getPresidentePar() {
        return this.presidente;
    }
     public String getTipoPar() {
        return this.tipo;
    }
}