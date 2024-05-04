import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Testowa Wiaodmosc");
    }
}
