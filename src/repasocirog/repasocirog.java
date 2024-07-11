package repasocirog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class repasocirog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dni = new ArrayList<>();
        ArrayList<String> apellido = new ArrayList<>();
        boolean trabajo = true, trabajito = true;
        int dnis = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de dnis y apellidos: "));    
        int aux;
        for (int i = 0;i<dnis;i++) {
            
        System.out.println("ingresar dni: ");
        dni.add(scanner.nextInt());
        
        System.out.println("ingrese el apellido: ");
        apellido.add(scanner.next());
        }

            for (int i = 0; i<dnis-1;i++){
                for (int j = 0; j<dnis-i -1; j++) {
                    if (dni.get(j)> dni.get(j+1)){
                        aux = dni.get(j);
                        
                        dni.set( j, dni.get(j+1)); 
                        
                        dni.set(j+1, aux);    
                    
                }
            
            }
            
                
        }
            System.out.println("dnis ordenados: ");
            while (trabajito) {
            for (int i = 0; i<dnis; i++) {
            
                System.out.println(dni.get(i) + "\t" + apellido.get(i));
                
            }
            
            
            System.out.println("ingresa tu numero de dni: ");
            int numerito = scanner.nextInt();
            
            for (int i = 0; i<dnis;i++) {
                if (numerito == dni.get(i)) {
                System.out.println("este es tu dni: "+ dni.get(i)+"\t"+apellido.get(i));
                
                
                
                System.out.println("elegir una de las 3 opciones");
                System.out.println("1. Eliminar, 2. Modificar, 3. Salir del programa: ");
                int salir = scanner.nextInt();
                
                if (salir == 1) {
                    
                    System.out.println("Ingrese el numero de dni y apellido a borrar: ");
                    System.out.println(dni);
                    
                    int numeroDeDniABorrar = scanner.nextInt();
                    int posicionEnLaLista = dni.indexOf(numeroDeDniABorrar);
                    
                    dni.remove(posicionEnLaLista);
                    apellido.remove(posicionEnLaLista);
                    
                    System.out.println("lista de dni renovada: " + dni + "\t" + apellido);
                    
                }
                else if (salir == 2) {
                	 
                 
                    int posicionEnLaLista = dni.indexOf(numerito);
                    
                    System.out.println("elegir una de las 3 opciones");
                    System.out.println("1. ambos, 2. cambiar apellido, 3.cambiar dni :");
                     int eleccion = scanner.nextInt();
                   
                    
                    if (eleccion == 1) {
                    	System.out.println("Ingrese el nuevo apellido: ");
                        String nuevoapellido = scanner.next();
                        
                        System.out.println("Ingrese el nuevo dni: ");
                        int nuevodni = scanner.nextInt();
                    apellido.set(posicionEnLaLista, nuevoapellido);
                    dni.set(posicionEnLaLista, nuevodni);
                    System.out.println(nuevodni + nuevoapellido);
                    }
                    else if (eleccion == 2) {
                    System.out.println("Ingrese el nuevo apellido: ");
                    String nuevoapellido = scanner.next();
                    apellido.set(posicionEnLaLista, nuevoapellido);
                    
                    System.out.println(nuevoapellido);
                    }
                    
                    else  if (eleccion == 3) {
                    System.out.println("Ingrese el nuevo dni: ");
                    int nuevodni = scanner.nextInt();
                    dni.set(posicionEnLaLista, nuevodni);	
                    
                    System.out.println("lista cambiando el dni: " + dni + "\n" + apellido);
                    }
               
                    
                }
                else if (salir == 3) {
                    
                    trabajito = false;
                }
                else {
                    System.out.println("no existe esta opcion");
                }
                }
                }
              
            }	
            System.out.println("desea buscar otro dni: ");
            String pregunta = scanner.next();
         
            if (pregunta.equals("si")) {
            	
            }
            }
		

	}


