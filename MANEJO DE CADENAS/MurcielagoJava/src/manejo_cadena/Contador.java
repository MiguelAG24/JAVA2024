/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo_cadena;

import java.text.Normalizer;
import static manejo_cadena.Buscador.buscador;
import static manejo_cadena.Remplazar.actual;
import static manejo_cadena.Remplazar.nuevo;

/**
 *
 * @author chech
 */
public class Contador {
   
    public static void Ra(String dato, String letra){
     
        String cadenaNormalize = Normalizer.normalize(dato, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        
        String s= dos.toLowerCase();
        
        int T =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               T++;
           }
       }
      
       Principal.R_A.setText(Integer.toString(T));
        
    }
    
     public static void Re(String dato, String letra){
        
        String cadenaNormalize = Normalizer.normalize(dato, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
 
       String s= dos.toLowerCase();

      
       int T =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               T++;
           }
       }

       Principal.R_e.setText(Integer.toString(T));
       
   }
    
     public static void Ri(String dato, String letra){
        
        String cadenaNormalize = Normalizer.normalize(dato, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String s= dos.toLowerCase();
       
       
       int T =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               T++;
           }
       }

       Principal.R_i.setText(Integer.toString(T));
       
   }
    
     public static void Ro(String dato, String letra){
        
        String cadenaNormalize = Normalizer.normalize(dato, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String s= dos.toLowerCase();
       
       
       int T =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               T++;
           }
       }

       Principal.R_o.setText(Integer.toString(T));
       
   }
     
      public static void Ru(String dato, String letra){
        
        String cadenaNormalize = Normalizer.normalize(dato, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String s= dos.toLowerCase();
       
       
       int T =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               T++;
           }
       }

       Principal.R_u.setText(Integer.toString(T));
       
   }
      
      
      public static void par_o_impar(String valor){
             String[] valorarray = valor.split(" ");
             int sumPar=0;
             int sumImp=0;
             
             
             for (int i = 0; i < valorarray.length; i++){
            String palabra = valorarray[i];

            int cont = palabra.length();

            
            if (cont % 2 == 0 ){
                sumPar = sumPar + 1;
                
            }else {
                sumImp = sumImp + 1;
            }
            
        }
            
             Principal.palabra_par.setText(Integer.toString(sumPar));
             Principal.palabra_impar.setText(Integer.toString(sumImp));
         }
      
      
      
      
       public static void remplazar(){
       
   
   String valor = Principal.contenido.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String s= valor2.toLowerCase();
       
       String find = actual.getText();
       String rep =  nuevo.getText();
       
    
       
       for (int i = 0; i <find.length(); i++){

           s = s.replace(find, rep);
       }
       Principal.contenido.setText(s);
    
   }
      
      
     public static void Buscar(){
              
              String valor = Principal.contenido.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String s= valor2.toLowerCase();
       
       String find = buscador.getText();
      
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(find)){
               times++;
               
           }
       }
       System.out.println(times);
       manejo_cadena.Buscador.Econtrado.setText(Integer.toString(times));
       


          }  
 
}
