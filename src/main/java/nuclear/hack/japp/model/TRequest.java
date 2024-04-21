package nuclear.hack.japp.model;

import lombok.Data;



@Data
public class TRequest {
    private String uuid;

    private String fromId;
    private String toId;
    private Double value;
    private String tx;

    private String ipFrom;

    private String tr_tm;//timestamp

    private String wifiStatus;

    public enum WifiStatus {
        PUBLIC,
        LOCAL

    }
}
