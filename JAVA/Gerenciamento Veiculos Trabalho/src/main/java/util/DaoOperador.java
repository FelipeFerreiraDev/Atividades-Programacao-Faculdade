package util;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import modelo.Operador;

public class DaoOperador {
    public boolean autenticar(Operador operador){
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Operador> query = 
                manager.createNamedQuery("Operador.autenticar", Operador.class);
        query.setParameter("login", operador.getLogin());
        query.setParameter("senha", operador.getSenha());
        try {
            if (query.getSingleResult() != null) {
                return true;
            } else {
                return false;
            }
        } catch (NoResultException e) {
            return false;
        }
    }
}

