package gameProject;

public class UserValidationManager implements IUserValidationService { 

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.birthYear==2001 && gamer.firstName=="Serter" && gamer.lastName=="�zbek") {
			return true;
		}else {
			return false;
		}
		
		
	}

}
