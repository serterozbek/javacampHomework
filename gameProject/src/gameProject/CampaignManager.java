package gameProject;

public class CampaignManager implements ICampaignService{

	@Override
	public void newCampaign() {
		System.out.println("Yeni kampanya olu�turuldu.");
		
	}

	@Override
	public void deleteCampaign() {
		System.out.println("Kampanya silme i�lemi ba�ar�l�.");
		
	}

	@Override
	public void updateCampaign() {
		System.out.println("Kampanya g�ncellendi.");
		
	}

}
