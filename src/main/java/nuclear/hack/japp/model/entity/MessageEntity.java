package nuclear.hack.japp.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(schema = "public",catalog = "nh24", name = "_message")
public class MessageEntity {
    @Id
    @Column(name = "message_id", nullable = false)
    private Long id;
    @Column(name = "tx")
    private String json;
}
