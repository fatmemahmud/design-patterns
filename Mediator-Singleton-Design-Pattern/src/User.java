

	public abstract class User {
		 protected ChatRoom mediator;
		   private String name;

		  

		   public void setName(String name) {
		      this.name = name;
		   }

		   public User(String name){
		      this.name  = name;
		   }

		   public User(ChatRoom mediator2, String name2) {
			// TODO Auto-generated constructor stub
		}

		protected void sendMessage(String message){
		      ChatRoom.getMessage(this,message);
		   }

		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

	    public ChatRoom getMediator() {
	        return mediator;
	    }

	    protected void setMediator(ChatRoom mediator) {
	        this.mediator = mediator;
	    }

	    public String getName1() {
	        return name;
	    }

	    protected void setName1(String name) {
	        this.name = name;
	    }

	    protected abstract void sendMessage1(String message);
	    protected abstract void receiveMessage(String message);
		

		}
		

