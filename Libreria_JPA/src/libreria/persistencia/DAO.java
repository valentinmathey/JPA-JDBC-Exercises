
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


// @author Valentin Mathey
 
public class DAO<T> {
    
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibraryConnect"); //conexion con la persistencia
    protected EntityManager em = EMF.createEntityManager(); //Una interfaz que gestiona las operaciones de persistencia de las entidades,  
                                                            //ya sea crear, editar, eliminar, traer de la base de datos
    
    //Conectamos con la base de datos
    protected void conectar() {
        if (!em.isOpen()) { //En caso de que este cerrada
            em = EMF.createEntityManager();
        }
    }
    
    //Desconectamos con la base de datos
    protected void desconectar() {
        if (em.isOpen()) { //En caso de que este abierta
            em.close();
        }
    }
    
    //Metodo para guardar un objeto en la base de datos
    protected void guardar(T objeto){
        conectar();
        em.getTransaction().begin(); //Se inicia la transaccion
        em.persist(objeto);
        em.getTransaction().commit(); //Terminamos la transacción con el método commit
        desconectar();
    }
    /*
    -Persist()
    Este método nos deja persistir una entidad en nuestra base de datos. Persistir es la acción de
    preservar la información de un objeto de forma permanente, en este caso en una base de datos,
    pero a su vez también se refiere a poder recuperar la información del mismo para que pueda ser
    nuevamente utilizado.
    */
    
    //Metodo para editar objetos y los guarda actualizados en la base de datos
    protected void editar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    /*
    -Merge()
    Este método funciona igual que el método persist pero, sirve para actualizar una entidad en la
    base de datos.
    */
    
    //Metodo para eliminar objetos en la base de datos
    protected void eliminar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    /*
    -Remove()
    Este método se encarga de eliminar una entidad de la base de datos.
    */
    
}
