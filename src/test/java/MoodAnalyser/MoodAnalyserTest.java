package MoodAnalyser;
import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest 
{
	@Test
	public void GivenHappyMessage_WhenAnalysed_ShouldGiveHappyMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("im happy now");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);	
	}
	@Test
	public void GivenSadMessage_WhenAnalysed_ShouldGiveSadMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("im sad now");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);	
	}
	@Test
	public void GivenAnyMessage_WhenAnalysed_ShouldGiveSadMood()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("im ok");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);	
	}


}
