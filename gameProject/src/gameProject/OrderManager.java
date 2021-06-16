package gameProject;

public class OrderManager implements IOrderService {
	
	ICampaignService campaignService;
	
	
	public OrderManager(ICampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}


	@Override
	public void buy(Gamer gamer) {
		System.out.println("Satýn alma iþlemi baþarýlý");
		
	}

}
