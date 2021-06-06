
public class Chat  extends User {

    public Chat() {}

    public Chat(ChatRoom mediator, String name) {
        super(mediator, name);
    }

    protected void sendMessage(String message) {
        System.out.println("\n" + this.name + ": Sending Message=" + message);
        mediator.sendMessage(message, this);

        if ("addBot".equals(message)) {
            mediator.addUser(ChatBotSingleton.getInstance());
            ((Object) ChatBotSingleton
                    .getInstance())
                    .setChatRoom(mediator);
        }
    }

 
    protected void receiveMessage(String message) {
        System.out.println(this.name + ": Received Message:" + message);
    }
}
