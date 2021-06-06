import java.util.Arrays;

public class ChatBotSingleton1 {

	

    private User lastMessageSender1;
    private ChatBotSingleton1(){}

	private static ChatBotSingleton1 instance;
	private User lastMessageSender;
	private void ChatBotSingleton() {}
	public static ChatBotSingleton1 getInstance() {
		if (instance == null) {
			instance = new ChatBotSingleton1();
		}
		return instance;
	}
	 private static class SingletonHelperBillPugh {
	        private static final ChatBotSingleton1 INSTANCE = new ChatBotSingleton1();
	    }

	    public static ChatBotSingleton1 getInstance1() {
	        return SingletonHelperBillPugh.INSTANCE;
	    }

	    
	    protected void receiveMessage(String message, ChatRoomMediator mediator) {
	        if (message != null) {
	            String[] splitStrings = message.split(" ");
	            long count = Arrays.stream(splitStrings)
	                    .filter("cat"::equals)
	                    .count();

	            if (count >= 1l) {
	                ((ChatRoomMediator) mediator).setUserToBeRemoved(lastMessageSender1);
	            }
	        }
	    }

	    public void setLastMessageSender(User lastMessageSender) {
	        this.lastMessageSender1 = lastMessageSender;
	    }
	    public void sendMessage(String message, User user) {
	        ChatBotSingleton1.getInstance().setLastMessageSender(user);
	        users.stream()
	                .filter(userReceiving -> !userReceiving.equals(user))
	                .forEach(userReceiving -> userReceiving.receiveMessage(message));
	        if (removeUser) {
	            System.out.println(userToBeRemoved.getName() + " was removed from the room for saying cat");
	            removeUser(userToBeRemoved);
	            removeUser = false;
	            ChatBotSingleton1 instance = ChatBotSingleton1.getInstance();
	            instance.sendMessage(instance.name + " warns everybody that cat is restricted word in this chat you will be removed if you use it");
	        }
	    }
		public void setName(String string) {
			// TODO Auto-generated method stub
			
		}
}
