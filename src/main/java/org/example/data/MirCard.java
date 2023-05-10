package org.example.data;

public class MirCard extends Card{

    public MirCard() {
        super(paymentSystem.MIR);
    }
    protected boolean isCountryValidForTheseCard(Country country){
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
