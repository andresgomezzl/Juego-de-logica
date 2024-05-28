package Back;


import Front.Diseño;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import Front.Diseño3;
 
      
public class Main {
      
      
       int numAleatorio=0;
    
    public void main(String[] args) {
      Diseño d = new Diseño();
      d.setVisible(true);
        ArrayList<Integer> digitos = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            digitos.add(i);
        }
        Collections.shuffle(digitos);
        
        for (int i = 0; i < 4; i++) {
            numAleatorio = numAleatorio * 10 + digitos.get(i);
        }
        
      
    }

    public void recibirNombre(String name)
    {
        Date fecha1= new Date();
        SimpleDateFormat Formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = Formatofecha.format(fecha1);
        
        
        
    }
    
    
    public void usuario (int numeroUsuario)
    {
    
    }
    
   
    
    
}
