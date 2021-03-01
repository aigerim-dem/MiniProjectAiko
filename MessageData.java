import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate; // java.util.Date

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;
        sentDate = new Date();
    }

    public MessageData() {
    }

    @Override
    public String toString() {
        return "MessageData{" +
                "userName='" + userName + '\'' +
                ", messageText='" + messageText + '\'' +
                ", sentDate=" + sentDate +
                '}';
    }
}
