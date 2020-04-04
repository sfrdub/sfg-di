package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
@Controller //2. added the stereo type
public class PetController {

    /**
	 * @param petService
	 */
	//1. Adde the constructor
	public PetController(@Qualifier("petService") PetService petService) {
		this.petService = petService;
	}

	private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
