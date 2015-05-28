package hamsterofdark.action;

public class TutorialAction
{
	private String bestTutorialSite, language;
	public String execute()
	{
		String input = getLanguage();
		String output = "Language not supported";
		
		if((input != null) && (input.length() > 0))
		{
			if (input.equals("java"))
			{
				output = "javabrains";
			}
			if (input.equals("python"))
			{
				output = "Udacity";
			}
			
			setBestTutorialSite(output);
			return "success";			
		}
		return "success";
	}
	
	
	
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}
	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}

}
