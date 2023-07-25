package libreria.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-23T21:28:40", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Editorial.class)
public class Editorial_ { 

    public static volatile SingularAttribute<Editorial, Editorial> editorial;
    public static volatile SingularAttribute<Editorial, Integer> ejemplares;
    public static volatile SingularAttribute<Editorial, Boolean> alta;
    public static volatile SingularAttribute<Editorial, Integer> ejemplaresPrestados;
    public static volatile SingularAttribute<Editorial, String> titulo;
    public static volatile SingularAttribute<Editorial, Long> id;
    public static volatile SingularAttribute<Editorial, Integer> ejemplaresRestantes;
    public static volatile SingularAttribute<Editorial, Integer> anio;
    public static volatile SingularAttribute<Editorial, Autor> autor;

}