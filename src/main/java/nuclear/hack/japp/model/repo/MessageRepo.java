package nuclear.hack.japp.model.repo;

import nuclear.hack.japp.model.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<MessageEntity, Long> {
}
