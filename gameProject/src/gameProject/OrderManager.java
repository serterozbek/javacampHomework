package gameProject;

public class OrderManager implements IOrderService {
	
	ICampaignService campaignService;
	
	
	public OrderManager(ICampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}


	@Override
	public void buy(Gamer gamer) {
		System.out.println("Sat�n alma i�lemi ba�ar�l�");
		
	}

}
