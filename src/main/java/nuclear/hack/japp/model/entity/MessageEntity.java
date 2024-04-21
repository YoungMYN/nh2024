package nuclear.hack.japp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(schema = "public", name = "_message")
public class MessageEntity {
    @Column(name = "message_id")
    Long id;
    @Column(name = "tx")
    String json;
}
