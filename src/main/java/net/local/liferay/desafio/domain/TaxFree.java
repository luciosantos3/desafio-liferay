package net.local.liferay.desafio.domain;

import net.local.liferay.desafio.model.Product;

public class TaxFree implements Tax {

    public double calculateTaxAmount(Product product) {
        return 0; 
    }
}