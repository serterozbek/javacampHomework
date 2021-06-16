package gameProject;


public class Main {

	public static void main(String[] args) {
		//Gamer Operation
		Gamer gamer1 = new Gamer();
		gamer1.firstName="Serter";
		gamer1.lastName="Özbek";
		gamer1.id=1;
		gamer1.birthYear=1950;
		gamer1.identityNumber="12345678911";
		
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.save(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);

		//Campaign Operation
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("%20 Ýndirim");
		campaign.setDiscount(0.20);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.newCampaign();
		campaignManager.deleteCampaign();
		campaignManager.updateCampaign();
		
		//Order Operation
		Order order = new Order();
		order.setId(1);
		order.setPrice(500);
		order.setOrderDetails("Battlefield");
		
		OrderManager orderManager = new OrderManager(campaignManager);
		orderManager.buy(gamer1);
	}

}
