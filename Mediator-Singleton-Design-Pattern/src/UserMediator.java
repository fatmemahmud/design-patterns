
public class UserMediator {
	public static void main(String[] args) {
		ChatRoomMediator mediator = new ChatRoomMediator();
		ChatBotSingleton1 chatBot = ChatBotSingleton1.getInstance();
		chatBot.setName("Bot");

	      Chat alex = new Chat("Alex");
	      Chat anthony = new Chat("Anthony");
	      Chat joe = new Chat( "Joe");
	      
	      alex.sendMessage("Hi friends !");
	      anthony.sendMessage("Hello! Alex!");
	      joe.sendMessage("Hello!Alex! Friends i want to add Elon !");
	      
	   
	      Chat elon = new Chat("Elon");
	      mediator.addUser(elon);
	      elon.sendMessage("Anthony you are a mouse I will add bot to protect you from treats");
	      elon.sendMessage("addBot");
	      anthony.sendMessage("Yes I am. I hate Tom he is a cat");

	      alex.sendMessage("See Anthony was removed for saying cat lol");
	   }
	}


