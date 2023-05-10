package org.example.data;

import java.io.Serializable;

public class MasterCard extends Card implements ICard, Serializable {
    public MasterCard() {
        super(paymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForTheseCard(Country country){
    return true;
    }
}
