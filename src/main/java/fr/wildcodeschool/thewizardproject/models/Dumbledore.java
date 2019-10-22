package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component( "theActor" )
public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    public Dumbledore() {

    }

    @Autowired
    public Dumbledore( Outfit theOutfit ) {
        this.myOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "go see my movies !";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.displayColor();
    }

    public Outfit getMyOutfit() {
        return myOutfit;
    }

    public void setMyOutfit( Outfit myOutfit ) {
        this.myOutfit = myOutfit;
    }
}
