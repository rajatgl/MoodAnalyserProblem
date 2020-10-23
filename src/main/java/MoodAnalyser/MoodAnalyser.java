package MoodAnalyser;
class MoodAnalysisException extends Exception{
	private static final long serialVersionUID = 1L;
	private Issue error;
	public static enum Issue{
		NULL_POINTER_EXCEPTION,
		EMPTY_STRING_EXCEPTION,
		UNDEFINED_MOOD_EXCEPTION
	}
	MoodAnalysisException(Issue error){
		this.error = error;
	}
	MoodAnalysisException() {}
	@Override
	public String toString() {
		switch(this.error) {
			case NULL_POINTER_EXCEPTION:
				return "MoodAnalysisException: Null Message Provided";
			case EMPTY_STRING_EXCEPTION:
				return "MoodAnalysisException: Empty String Provided";
			default:
				return "MoodAnalysisException: Undefined Mood Exception";
		}
	}
}
public class MoodAnalyser {
	String message;
	MoodAnalyser(String message) {
		this.message = message;
	}
	MoodAnalyser() {}
	public String analyseMood() {
		try {
			//throwing custom exceptions
			if(message == null)
				throw new MoodAnalysisException(MoodAnalysisException.Issue.NULL_POINTER_EXCEPTION);
			else if(message.isEmpty())
				throw new MoodAnalysisException(MoodAnalysisException.Issue.EMPTY_STRING_EXCEPTION);
			
			//analyzing mood
			if(message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(MoodAnalysisException e) {
			//handling exception
			e.printStackTrace();
			return "HAPPY";
		}
	}
}