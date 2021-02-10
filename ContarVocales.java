package es.ulpgc.eii.strings;

public class StringUtils {
    public static int vocales(String s1){
        //Creamos una string con todas las vocales que pueden sumarse
        String vocales = "AEIUOaeiouÁÉÍÓÚáéíóúÜü";
        //Si la ristra que recibimos está vacía
        if (s1.length() == 0){
            //Devolvemos 0
            return 0;
        }
        
        //Si la String the vocales contiene el carácter que se encuentra en la
        //posición inicial de la String parámetro
        if (vocales.contains(Character.toString(s1.charAt(0)))){
            //Devolvemos la cantidad de vocales que contiene la ristra
            return 1 + vocales(s1.substring(1));
        } else {
            //Si no, repetimos el proceso
            return vocales(s1.substring(1));
        }
    }
}