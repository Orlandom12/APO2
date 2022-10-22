
public class VideoJuegos implements Entregable {

	
	   private String titulo;
	    private int hEstimadas;
	    private boolean entregado;
	    private String genero;
	    private String compañia;
	    
		private final static int horas_pretederminadas = 10;
	    public final static int may = 1;
	    public final static int men = -1;
	    public final static int igual = 0;

	    public String getTitulo() {
	        return titulo;	    } 
	    public int gethEstimadas() {
	        return hEstimadas;	    }
	    public String getGenero() {
	        return genero;	    }
	    public String getcompañia() {
	        return compañia;	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;	    }
	    public void sethEstimadas(int hEstimadas) {
	        this.hEstimadas = hEstimadas;	    }
	    public void setGenero(String genero) {
	        this.genero = genero;   }
	    public void setcompañia(String compañia) {
	        this.compañia = compañia;	    }

	    public boolean entregar() {
	        return entregado = true;	    }
	    public boolean devolver() {
	        return entregado = false;	    }

	    public boolean isEntregado() {
	        if(entregado){
	            return true;	        }
	        return false;	    }

	    public int compareTo (Object a) {
	        int estado = men;
	  
	        VideoJuegos ref=(VideoJuegos)a;
	        if (hEstimadas>ref.gethEstimadas()){
	            estado = may;
	        }else if(hEstimadas==ref.gethEstimadas()){
	            estado = igual;
	        
	  
	        return estado;
	    }
			return estado;}

	    public String toString(){
	        return "Informacion del videojuego: \n" +
	                "\tTitulo: "+titulo+"\n" +
	                "\tHoras estimadas: "+hEstimadas+"\n" +
	                "\tGenero: "+genero+"\n" +
	                "\tcompañia: "+compañia;
	    }

	    public boolean equals(VideoJuegos a){
	        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
	            return true;
	        }
	        return false;
	    }

	    public VideoJuegos(){
	        this("", horas_pretederminadas , "", "");
	    }

	    public VideoJuegos(String titulo, String compañia){
	        this(titulo, horas_pretederminadas , "", compañia);
	    }

	    public VideoJuegos(String titulo, int hEstimadas, String genero, String compañia){
	        this.titulo=titulo;
	        this.hEstimadas=hEstimadas;
	        this.genero=genero;
	        this.compañia=compañia;
	        this.entregado=false;
	    }
	
}
