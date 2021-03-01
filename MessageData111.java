import java.io.Serializable;
import java.util.Date;

public class MessageData111 implements Serializable {
    String name;
    String message;
    Date sentData;


    public MessageData111(String name, String message) {
        this.name = name;
        this.message = message;
        sentData = new Date();
    }

    public MessageData111() {
    }

    @Override
    public String toString() {
        return sentData + " " + name + ": " +  message ;
    }
}
