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
			System.out.println("Kayýt baþarýlý.");
		} else {
			System.out.println("Doðrulama baþarýsýz. Kayýt baþarýsýz.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("Güncelleme baþarýlý");
		} else {
			System.out.println("Doðrulama baþarýsýz. Güncelleme baþarýsýz.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("Silme baþarýlý");
		} else {
			System.out.println("Doðrulama baþarýsýz. Silme baþarýsýz.");
		}

	}

}
