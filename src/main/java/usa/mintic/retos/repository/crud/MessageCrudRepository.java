package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.entity.Audience;
import usa.mintic.retos.entity.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
