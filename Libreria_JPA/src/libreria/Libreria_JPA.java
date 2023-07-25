
package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;
import libreria.servicios.AutorServicio;


// @author Valentin Mathey

public class Libreria_JPA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AutorServicio aDAO = new AutorServicio();
        Integer ID;
        String nombre;
        
        for (int i = 0; i < 10; i++) {
            ID = leer.nextInt();
            nombre = leer.next();
            aDAO.crearAutor(ID, nombre, false);
        }
        
    }

}
