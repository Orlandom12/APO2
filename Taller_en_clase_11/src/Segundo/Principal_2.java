package Segundo;
import javax.swing.JOptionPane;
public class Principal_2 {
	
	    public static void main(String[] args) {


	        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
	        String texto = JOptionPane.showInputDialog("Ingrese la edad");
	        int edad = Integer.parseInt(texto);
	        texto = JOptionPane.showInputDialog("ingrese el  sexo");
	        char sexo = texto.charAt(0);
	        texto = JOptionPane.showInputDialog("ingrese un peso sin puntos ni comas");
	        double peso = Double.parseDouble(texto);
	        texto = JOptionPane.showInputDialog("ingrese la altura sin puntos ni comas");
	        double altura = Double.parseDouble(texto);


	        
	        Persona persona1 = new Persona();

	        Persona persona2 = new Persona(nombre, edad, sexo);

	        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);


	
	        persona1.setNombre("Laura");

	        persona1.setEdad(30);

	        persona1.setSexo('M');

	        persona1.setPeso(60);

	        persona1.setAltura(1.60);

	        persona2.setPeso(90.5);

	        persona2.setAltura(1.80);


	   
	        System.out.println("Persona1");

	        MuestraMensajePeso(persona1);

	        MuestraMayorDeEdad(persona1);

	        System.out.println(persona1.toString());


	       

	    }


	    public static void MuestraMensajePeso(Persona p) {

	        int IMC = p.calcularIMC();

	        switch (IMC) {

	            case Persona.PESO_IDEAL:

	                System.out.println("La persona tiene un peso correspondiente a su peso ideal");

	                break;

	            case Persona.INFRAPESO:

	                System.out.println("La persona presenta un valor menor al peso ideal");

	                break;

	            case Persona.SOBREPESO:

	                System.out.println("La persona presenta un valor mayor al peso ideal");

	                break;

	        }

	    }


	    public static void MuestraMayorDeEdad(Persona p) {


	        if (p.esMayorDeEdad()) {

	            System.out.println("La persona es ya mayor de 18 años");

	        } else {

	            System.out.println("La persona aun no cumple la mayoria de edad");

	        }

	    }


	}


