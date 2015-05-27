package hamsterofdark.action;

public class TutorialAction
{
	private String bestTutorialSite;
	public String execute()
	{
		setBestTutorialSite("Udacity");
		System.out.println("execute fired");
		return "success";
	}
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}
	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

}
