package nuclear.hack.japp.model;

import lombok.Data;

@Data
public class TResponse {
    private String status;
    private String comment;
    public enum Status{
        SUCCESS,
        NEED_SMS_VERIFICATION,
        FROZEN
    }
}
