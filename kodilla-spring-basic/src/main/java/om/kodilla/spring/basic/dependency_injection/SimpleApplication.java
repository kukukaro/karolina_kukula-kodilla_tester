package om.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    MessageService messageService = new FacebookMessageService();

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
