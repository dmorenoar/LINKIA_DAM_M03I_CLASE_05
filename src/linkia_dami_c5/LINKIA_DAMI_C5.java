/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c5;

import java.util.Scanner;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* 
       Scanner sc = new Scanner(System.in); 
        
       int numCajas = 0;
       
       
       //la primera letra minúscula y las siguientes letras con la primera en mayúscula
       numCajas = sumaCajas();
       
       //Forma normal -> De esta forma, puedo utilizar más tarde el valor de la suma y el valor leido por teclado
       System.out.println("Introduce el primer número");
       int num1 = sc.nextInt();
       int suma = sumaCalc(num1,3);
       System.out.println("La suma personalizada es: " + suma);
       
       //Forma Guay 1 -> De esta forma, puedo utilizar más tarde el valor de la suma
       System.out.println("Introduce dos números para la suma guay(Introduce enter para el siguiente num):");
       int sumaGuay = sumaCalc(sc.nextInt(),sc.nextInt());     
       sumaGuay += 3;
       System.out.println("La suma personalizada guay es: " + sumaGuay);
       
       //Forma Guay 2 -> Aquí muestro la suma pero pierdo la lectura de teclado y el valor de la suma
       System.out.println("Número para la suma guay del paraguay:");
       System.out.println("La suma personalizada guay del paraguay es: " + sumaCalc(sc.nextInt(),3));
       
       int sumaDos = sumaCalc(4,2);
        */
       
       /*Llámadas a los tipos de funciones*/
       
       /* ++++++++++++++++++++++++++++++++++++++++ */
       //Función que no recibe nada ni devuelve nada
       saludar();
       /* ++++++++++++++++++++++++++++++++++++++++ */
       
       /* ++++++++++++++++++++++++++++++++++++++++ */
       //Función que no recibe pero si devuelve 
       //Opción normal
       String valor = devuelveSaludo();
       System.out.println(valor);
       
       //Opción guay
       System.out.println(devuelveSaludo());
       /* ++++++++++++++++++++++++++++++++++++++++ */
       
       /* ++++++++++++++++++++++++++++++++++++++++ */
       //Función que recibe y no devuelve nada
       int numero1 = 3, numero2 = 4;
       sumarPorPantalla(numero1,numero2);
       /* ++++++++++++++++++++++++++++++++++++++++ */
       
       /* ++++++++++++++++++++++++++++++++++++++++ */
       //Función que recibe y devuelve
       //Opción 1
       String palabra = "";
       palabra = concatenarValores(33, 'S');
       System.out.println(palabra);
       
       //Opción 2
       String palabra2 = concatenarValores(33, 'T');
       System.out.println(palabra2);
       
       //Opción 3
       System.out.println(concatenarValores(33, 'A'));
       
       /* ++++++++++++++++++++++++++++++++++++++++ */
    }
  
    //Definir una función
    //Tipo de accesibilidad -> public, private, protected
    //Valor que retorna(si lo hace) con su tipo -> int, String, double..
    //Nombre de la función (Lo elegimos nosotros) -> nombreFuncionJava 
    //Parámetros(si los recibo), se les indica de que tipo son y su nombre para usarlos dentro
    
    //Método privado
    private static int sumaCalc (int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    //Método vacío o default
    int sumaCalcGuay (int num1, int num2){ 
        return num1 + num2;               
    }
    
    //Método público
    public static int sumaCajas(){
        return 10;
    }
  
    /*TIPOS DE FUNCIONES*/
    
    /*Función que no recibe NADA ni retorna NADA (void significa que no devuelve nada). 
    Hace lo que tenga que hacer no devuelve nada, y lo que suceda se debe mostrar por pantalla o ni lo veremos*/
    public static void saludar(){
        System.out.println("Hola Buenos días");
        int num1 = 3, num2 =4;
        System.out.println("La suma es:" + (num1+num2));
    }
    
    //Función que no recibe NADA pero si devuelve. Hace dentro lo que tenga que hacer y devuelve sus operaciones internas
    public static String devuelveSaludo(){
        String saludar ="Hola buenos días DAM!";
        return saludar;
    }
    
    //Función que recibe pero no devuelve NADA. Hago dentro lo que tenga que hacer y lo muestro o sino lo pierdo
    public static void sumarPorPantalla(int num1, int num2){ //No se queja de que llame todo el rato int num1 o num2 porque son variables locales
        System.out.println("La suma es: " + (num1+num2));
    }
    
    //Función que recibe y devuelve. Hace sus cosas dentro y cuando ha acabado devuelve el valor que sea.
    public static String concatenarValores(int numerito, char digitoControl){
        String palabraJunta = "Tu numero de la suerte es: " + numerito;
        return palabraJunta;
    }
    
}
