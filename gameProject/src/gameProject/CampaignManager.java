package gameProject;

public class CampaignManager implements ICampaignService{

	@Override
	public void newCampaign() {
		System.out.println("Yeni kampanya oluþturuldu.");
		
	}

	@Override
	public void deleteCampaign() {
		System.out.println("Kampanya silme iþlemi baþarýlý.");
		
	}

	@Override
	public void updateCampaign() {
		System.out.println("Kampanya güncellendi.");
		
	}

}
