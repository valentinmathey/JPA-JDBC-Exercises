
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


// @author Valentin Mathey
 
public class AutorServicio {

    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }
    
    
    public Autor crearAutor(Integer id, String nombre, Boolean alta){
        
        Autor autor = new Autor();
        
        try {
            autor.setId(id);
            autor.setNombre(nombre);
            autor.setAlta(alta);
            DAO.guardar(autor);
            
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
