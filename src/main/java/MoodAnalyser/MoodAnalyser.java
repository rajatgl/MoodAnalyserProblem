package MoodAnalyser;

public class MoodAnalyser {
	String message;
	MoodAnalyser(String message) {
		this.message = message;
	}
	MoodAnalyser() {}
	public String analyseMood() 
	{
		if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
