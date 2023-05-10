package org.example.data;

public class VisaCard extends Card{

    public VisaCard() {
        super(paymentSystem.VISA);
    }
    protected boolean isCountryValidForTheseCard(Country country){
        return true;
    }
}
