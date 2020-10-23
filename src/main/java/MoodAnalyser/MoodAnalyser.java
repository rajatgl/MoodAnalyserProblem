package MoodAnalyser;

public class MoodAnalyser {

	public String analyseMood(String message) {
		if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
