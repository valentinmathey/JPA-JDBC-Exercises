
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;


// @author Valentin Mathey
 
public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    //Elimina un objeto por el numero de ID
    public void eliminar(String id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    //Busca Y trae un objeto en la base de datos por el ID
    public Autor buscarPorId(String id) throws Exception {
        conectar();
        Autor direccion = em.find(Autor.class, id);
        desconectar();
        return direccion;
    }
    //Busca Y trae un objeto en la base de datos por una QUERY especifica
    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT d FROM Autor d")
                .getResultList();
        desconectar();
        return autores;
    }
}
