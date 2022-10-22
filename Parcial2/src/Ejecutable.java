
public class Ejecutable {

	public static void main(String[] args) {
	
		VideoJuegos listaVideojuegos[]=new VideoJuegos[5];

	    listaVideojuegos[0]=new VideoJuegos("Free fire" ,20,"Misiones", "Garena");
	    listaVideojuegos[1]=new VideoJuegos("GTA",5,"Misiones", "Rockstar");
	    listaVideojuegos[2]=new VideoJuegos("FIFA", 2 ,"futbol" , "EA MOBILE");
	    listaVideojuegos[3]=new VideoJuegos("Call of duty", 7, "Misiones", " Activision");
	    listaVideojuegos[4]=new VideoJuegos("FAR CRY 6 ", 13, "Fps", "SUbisoft");
	    
	    Serie listaSeries[]=new Serie[5];
	    listaSeries[0]=new Serie("El chapo", 3 ,"Acion", "Daniel Posada" );
	    listaSeries[1]=new Serie("EL Juego del Calamar", 1, "Suspenso ","Hwang Dong-hyuk ");
	    listaSeries[2]=new Serie("El cartel", 2, "Accion", "Andrés López López.");
	   listaSeries[3]=new Serie("La casa de papel", 5 ,"Accion", "Alex Piña");
	    listaSeries[4]=new Serie("El chavo del 8", 5, "Comedia", "Roberto Gomez Bolañoz");
	    	    
	    	    listaVideojuegos[0].entregar();
	    	    listaVideojuegos[3].entregar();
	    	    listaSeries[1].entregar();
	    	    listaSeries[4].entregar();
	    	    
	    	    
	    	    int entregados=0;
	    	    
	    	    for(int i=0;i<listaSeries.length;i++){
	    	        if(listaSeries[i].isEntregado()){
	    	            entregados+=1;
	    	            listaSeries[i].devolver();

	    	        }
	    	        if(listaVideojuegos[i].isEntregado()){
	    	            entregados+=1;
	    	            listaVideojuegos[i].devolver();
	    	        }
	    	    }

	    	    System.out.println("En total hay " + entregados + " articulos entregados");
	    	    
	    	    Serie serieMayor=listaSeries[0];
	    	    VideoJuegos videojuegoMayor=listaVideojuegos[0];
	    	    
	    	    for(int i=1;i<listaSeries.length;i++){
	    	        if(listaSeries[i].compareTo(serieMayor)==Serie.may){
	    	            serieMayor=listaSeries[i];	    	        }
	    	        if(listaVideojuegos[i].compareTo(videojuegoMayor)==VideoJuegos.may){
	    	            videojuegoMayor=listaVideojuegos[i];	    	        }

	    	    }
	    	    
	    	    System.out.println("a continaucion se muestra el VideoJuego de mayor horas   //"+videojuegoMayor);
	    	    System.out.println("a continaucion se muestra la serie de mayor temporadas  //"+serieMayor);
	    	}}
	    	