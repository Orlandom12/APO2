
public class Serie implements Entregable {
	
 private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String categoria;
	private String creador;
	
	private final static int temporadas_por_defecto = 3;
	public final static int may = 1;
	public final static int men = -1;
	public final static int igual = 0;
	
	
	public String getTitulo() {
        return titulo; 
        }
	public int getnumTemporadas() {
        return numTemporadas;}
	public String getcreador() {
        return creador; }
	public String getcategoria() {
        return categoria;}
	
	public void setTitulo(String titulo) {
        this.titulo = titulo;}
	public void setnumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas; }
	public void setcategoria(String categoria) {
        this.categoria = categoria;}
	


		
		public boolean entregar() {
	        return entregado=true;	    }
		
		public boolean devolver() {
	        return entregado=false;  }
		
		public boolean isEntregado() {
	        if(entregado){
	            return true;
	        }
	        return false;
	    }
		
		
		
		public int compareTo(Object a) {
	        int estado = men;
	        
	        Serie ref=(Serie)a;
	        if (numTemporadas>ref.getnumTemporadas()){
	            estado = may;
	        }else if(numTemporadas==ref.getnumTemporadas()){
	            estado = igual;
	        }
	        return estado;
	    }
		
		public String toString(){
	        return "Informacion de la Serie: \n" +
	                "\tTitulo: " + titulo + "\n" +
	                "\tNumero de temporadas: " + numTemporadas + "\n" +
	                "\tcategoria: " + categoria + "\n" +
	                "\tCreador: " + creador;
	    }
		
		public boolean equals(Serie a){
	        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getcreador())){
	            return true;
	        }
	        return false;
	    }
		
		public Serie(){
	        this("", temporadas_por_defecto , "", "");
	    }
		
		public Serie(String titulo, String creador){
	        this(titulo, temporadas_por_defecto , "", creador);
	    }
		
		public Serie(String titulo, int numTemporadas, String categoria, String creador){
	        this.titulo = titulo;
	        this.numTemporadas = numTemporadas;
	        this.categoria = categoria;
	        this.creador = creador;
	        
	    }
	}


	
	
	