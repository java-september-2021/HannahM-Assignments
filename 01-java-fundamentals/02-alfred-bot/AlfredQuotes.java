import java.util.Date; 
public class AlfredQuotes{
	public String basicGreeting(){
		return "Hello, lovely to see you. How are you?";
	}
	public String guestGreeting(String name, String dayPeriod){
		String greeting = String.format("Good %d, %s. Lovely to see you.", dayPeriod, name);
		return greeting;
	}
	public String dateAnnouncement(){
		String getCurrentDate; {
        Date date = new Date();
        return "Current date is: " + date;
    	}
    }
	public String respondBeforeAlexis(String conversation){
		String looking = conversation;
		if (looking.indexOf("Alexis") > 1) {
			return "Right away, sir. She certainly isn't sophisticated enough for that.";
		} else if (looking.indexOf("Alfred") > 1) {
			return "At your service. As you wish, naturally.";
		} else {
			return "Right with that I shall retire.";
		}
	}
}