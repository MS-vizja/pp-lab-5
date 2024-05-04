import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        int sum = MathUtils.add(10, 21);
        
        System.out.println("Wynikiem dodawania 10 + 21 jest: " + sum);
        
        
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynikiem dodawania 10 + 21 jest: " + sum);
    }
}
