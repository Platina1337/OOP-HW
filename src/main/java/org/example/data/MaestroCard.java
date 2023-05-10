package org.example.data;

import static org.example.data.Country.RU;
import static org.example.data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card{
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
