package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit {

    public Outfit() {

    }

    public String displayColor() {
        return "The wizard's dress is blue";
    }

}
