package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit myOutfit;

    public Gandalf() {

    }

    public Gandalf( Outfit theOutfit ) {
        this.myOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "give the One Ring to Frodon!";
    }

    @Override
    public String changeDress() {
        return myOutfit.displayColor();
    }

    public Outfit getMyOutfit() {
        return myOutfit;
    }

    public void setMyOutfit( Outfit myOutfit ) {
        this.myOutfit = myOutfit;
    }

}
