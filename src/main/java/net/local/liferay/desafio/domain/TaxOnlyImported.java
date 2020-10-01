package net.local.liferay.desafio.domain;

import net.local.liferay.desafio.model.Product;

public class TaxOnlyImported implements Tax {

    public double calculateTaxAmount(Product product) {
    	return product.getProductValue() * 0.05;
    }
    
}
