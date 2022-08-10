package Acta;

import java.util.Arrays;
import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
	    String Nombre_de_Curso, Periodo_Lectivo, Carrera, Modalidad, Cantidad_de_Estudiantes,Grupo,  Cod_de_Asignatura;
	    double Cod_de_curso, Cod_de_programa, Primer_Parcial, Segundo_Parcial, Sistematico, Proyecto_de_Curso;
	    String ArraysNombre_de_Curso[] = {"introduccion a la programacion", "introduccion a la arquitectura", "introduccion a la ingenieria civil", "introduccion a mecanica","introduccion a la ingenieria industrial"};
	    String i_Nombre_de_Curso;
	    String ArraysPeriodoLectivo[] = {"primer semestre 2021", "segundo semestre 2021"};
	    String i_Periodo_de_Lectivo;
	    String ArraysCarrera[] = {"arquitectura", "ingenieria de sistemas", "ingenieria civil", "mecanica", "ingenieria industrial"};
	    String i_Carrera;
	    String ArraysModalidad [] = {"regular", "nocturno", "vespertino", "diurno"};
	    String i_Modalidad;
	    
	    String seguir = "si";
	    while  (seguir.equals("si")){
	    
	      System.out.println("^*^Datos Generales^*^");
	      System.out.print("curso:  ");
	      i_Nombre_de_Curso = leer.nextLine();
	      
	      while (i_Nombre_de_Curso == "" || !Arrays.asList(ArraysNombre_de_Curso).contains(i_Nombre_de_Curso.toLowerCase())) {
	        System.out.println(" ERROR, Nombre de curso incorrecto/o no disponible en esta univerisdad, favor volver a ingresar su curso");
	        System.out.print("curso:  ");
	        i_Nombre_de_Curso = leer.nextLine();
	      }
	      
	      System.out.print("Periodo Lectivo:  ");
	      i_Periodo_de_Lectivo = leer.nextLine();
	      while (i_Periodo_de_Lectivo == "" || !Arrays.asList(ArraysPeriodoLectivo).contains(i_Periodo_de_Lectivo.toLowerCase())){ 
	        System.out.println("ERROR, Su periodo de curso es incorrecto, favor vuelva a intentarlo");
	        System.out.print("Periodo Lectivo:  ");
	          i_Periodo_de_Lectivo = leer.nextLine();
	      }
	      
	      System.out.print("Carrera:  ");
	      i_Carrera = leer.nextLine();
	      while (i_Carrera == "" || !Arrays.asList(ArraysCarrera).contains(i_Carrera.toLowerCase())) {
	        System.out.println("ERROR, su carrera esta incorrecto/o no esta disponible en esta universidad, favor volver a ingresar su carrera");
	        System.out.print("Carrera:  ");
	          i_Carrera = leer.nextLine();
	      }
	  
	      System.out.print("Modalidad:  ");
	      i_Modalidad = leer.nextLine();
	      while (i_Modalidad == "" || !Arrays.asList(ArraysModalidad).contains(i_Modalidad.toLowerCase())) {
	        System.out.println("ERROR, su modalidad no exite/o no disponible, favor vuelva a ingresar su modalidad");
	        System.out.print("Modalidad:  ");
	          i_Modalidad = leer.nextLine();
	      }
	  
	      System.out.print("Cod. de Curso:  ");
	      Cod_de_curso = Double.parseDouble(leer.nextLine());
	      while ( Cod_de_curso < 0 ) {
	         System.out.println("ERROR, su codigo de curso no puede ser negativo, favor volver a ingresar su codigo");
	        System.out.print("Cod. de Curso:  ");
	          Cod_de_curso = Double.parseDouble(leer.nextLine());
	      }
	       System.out.print("Grupo:  ");
	       Grupo = leer.nextLine();
	       char ch;
	       while (true) {
	         boolean tieneLetra = false;
	         boolean tieneNumero = false;
	         for(int i=0;i < Grupo.length();i++) {
	           ch = Grupo.charAt(i);
	            if( Character.isDigit(ch)) {
	                tieneNumero = true;
	            }
	            else if (Character.isLetter(ch)) {
	                tieneLetra = true;
	            }
	          }
	        if (!tieneNumero || !tieneLetra) {
	          System.out.println("Error, su grupo tiene que tener al menos una letra y un numero");
	          System.out.print("Grupo:  ");
	          Grupo = leer.nextLine();
	        }
	        else {
	          break;
	        }
	       }
	       
	         System.out.print("Cod. de Asignatura:  ");
	         Cod_de_Asignatura = leer.nextLine();
	       char a;
	       while (true) {
	         boolean tieneLetra = false;
	         boolean tieneNumero = false;
	         for(int i=0;i < Cod_de_Asignatura.length();i++) {
	           a = Cod_de_Asignatura.charAt(i);
	            if( Character.isDigit(a)) {
	                tieneNumero = true;
	            }
	            else if (Character.isLetter(a)) {
	                tieneLetra = true;
	            }
	          }
	        if (!tieneNumero || !tieneLetra) {
	          System.out.println("Error, su codigo de asignatura tiene que tener al menos una letra y un numero");
	          System.out.print("Cod. de Asignatura:  ");
	         Cod_de_Asignatura = leer.nextLine();
	          
	        }
	        else {
	          break;
	        }
	       }

	         System.out.print("Cod. de programa:  ");
	         Cod_de_programa = Double.parseDouble(leer.nextLine());
	         
	         if (Cod_de_programa < 0) {
	           System.out.println("ERROR, su codigo no puede ser negativo, favor volver a ingresar su codigo");
	           System.out.print("Cod. de programa:  ");
		         Cod_de_programa = Double.parseDouble(leer.nextLine());
	         }
	      
	         System.out.print("Primer Parcial:  ");
	         Primer_Parcial = Double.parseDouble(leer.nextLine());
	        while (Primer_Parcial > 35) {
	          System.out.println("ERROR, Su nota del Primer Parcial debe de ser menor que 35, favor volver a ingresar su nota");
	          System.out.print("Primer Parcial:  ");
		         Primer_Parcial = Double.parseDouble(leer.nextLine());
	        }
	        while (Primer_Parcial < 0) {
	          System.out.println("ERROR, Su nota de primer parcial no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Primer Parcial:  ");
		         Primer_Parcial = Double.parseDouble(leer.nextLine());
	        }
	        
	        System.out.print("Segundo Parcial:  ");
	        Segundo_Parcial = Double.parseDouble(leer.nextLine());
	        while (Segundo_Parcial > 35) {
	          System.out.println("ERROR, Su nota del segundo Parcial debe de ser menor que 35, favor volver a ingresar su nota");
	          System.out.print("Segundo Parcial:  ");
		        Segundo_Parcial = Double.parseDouble(leer.nextLine());
	        }
	        while (Segundo_Parcial < 0) {
	          System.out.println("ERROR, Su nota de segundo parcial no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Segundo Parcial:  ");
		        Segundo_Parcial = Double.parseDouble(leer.nextLine());
	        }
	      
	        System.out.print("Sistematicos:  ");
	        Sistematico = Double.parseDouble(leer.nextLine());
	        while (Sistematico > 35) {
	          System.out.println("ERROR, Su nota del sistematico debe de ser menor que 35, favor volver a ingresar su nota ");
	          System.out.print("Sistematicos:  ");
		        Sistematico = Double.parseDouble(leer.nextLine());
	        }
	        while (Sistematico < 0) {
	          System.out.println("ERROR, Su nota de sistematico  no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Sistematicos:  ");
		        Sistematico = Double.parseDouble(leer.nextLine());
	        }

	        System.out.print("Proyecto de Curso:  ");
	        Proyecto_de_Curso = Double.parseDouble(leer.nextLine());
	        while (Proyecto_de_Curso > 35) {
	          System.out.println("ERROR, Su nota del proyecto de curso debe de ser menor que 35, favor volver a ingresar su nota");
	          System.out.print("Proyecto de Curso:  ");
		        Proyecto_de_Curso = Double.parseDouble(leer.nextLine());
	        }
	        while (Proyecto_de_Curso < 0) {
	          System.out.println("ERROR, Su proyecto de curso  no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Proyecto de Curso:  ");
		        Proyecto_de_Curso = Double.parseDouble(leer.nextLine());
	        }
	        
	      System.out.println("¿Quiere intentarlo de nuevo?");
	      seguir = leer.nextLine();
	    }
	    System.out.println("Take care, Thanks");
	    leer.close();
	  }
	
	}