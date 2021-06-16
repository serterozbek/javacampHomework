package gameProject;

public class GamerManager implements IGamerService {

	IUserValidationService userValidationService;

	public GamerManager(IUserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void save(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("Kay�t ba�ar�l�.");
		} else {
			System.out.println("Do�rulama ba�ar�s�z. Kay�t ba�ar�s�z.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("G�ncelleme ba�ar�l�");
		} else {
			System.out.println("Do�rulama ba�ar�s�z. G�ncelleme ba�ar�s�z.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("Silme ba�ar�l�");
		} else {
			System.out.println("Do�rulama ba�ar�s�z. Silme ba�ar�s�z.");
		}

	}

}
