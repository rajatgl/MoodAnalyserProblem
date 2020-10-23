package MoodAnalyser;
import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest 
{
	@Test
	public void GivenHappyMessage_WhenAnalysed_ShouldGiveHappyMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("im happy now");
		Assert.assertEquals("HAPPY", mood);	
	}
	@Test
	public void GivenSadMessage_WhenAnalysed_ShouldGiveSadMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("im sad now");
		Assert.assertEquals("SAD", mood);	
	}
	@Test
	public void GivenAnyMessage_WhenAnalysed_ShouldGiveSadMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("im ok now");
		Assert.assertEquals("HAPPY", mood);	
	}


}
