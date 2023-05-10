package org.example.data;

public class UnionPayCard extends Card{


    public UnionPayCard() {
        super(paymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForTheseCard(Country country){
        if (country == Country.CH)
            return true;
        else
            return false;
    }
}
