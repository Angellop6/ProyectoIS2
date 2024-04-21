
package Errores;



public class Lectura {
    
    
    public static int Lint(String txt) { 
       int res = 0;
       int id = 0;
            try {
                id = Integer.parseInt(txt);
                res =1;
            } catch (NumberFormatException e) {
                        
            }
        return res ;
    }
    
    public static int LFloat(String txt) { 
       int res = 0;
       float id = 0;
            try {
                id = Float.parseFloat(txt);
                res =1;
            } catch (NumberFormatException e) {
               
            }
        return res ;
    }
    
    public static int Lcorreo(String txt, String tipo){
        
        int res = 0;
        if(txt.matches("[0-9a-zA-Z]+(@)"+tipo+"(.com)")){
            res = 1;
        }    
        return res ;
    }
    
    public static int Ltext(String txt){
        
        int res = 0;
        if(txt.matches("^[a-zA-Z\\s]+$")){
            res = 1;
        }        
        return res ;
    }
    
    public static int Ltelefono(String txt){
        
        int res = 0;
        if(txt.matches("\\d{10}")){
            res = 1;
        }        
        return res ;
    }
    
    public static int LContraseña(String txt){
        
        int res = 0;
        if(txt.matches(".+")){
            res = 1;
        }        
        return res ;
    }

    
    
}
