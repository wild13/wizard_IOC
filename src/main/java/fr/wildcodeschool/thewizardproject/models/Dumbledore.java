package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    public Dumbledore() {

    }

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
}
