import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ChatRoomMediator {


   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }

private User userToBeRemoved;

public void addUser(User user) {
	 this.users.add(user);
	
}
private final List<User> users;
private User userToBeRemoved1;
private boolean removeUser;

{
    removeUser = false;
    users = new ArrayList<>();
}

public void setUserToBeRemoved(User lastMessageSender) {
	
    this.userToBeRemoved = userToBeRemoved;
    removeUser = true;
	
}
public void removeUser(User user) {
    users.remove(user);
}
public void sendMessage(String message, User user) {
    }
}


