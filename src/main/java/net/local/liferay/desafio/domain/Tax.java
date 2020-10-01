package net.local.liferay.desafio.domain;

import net.local.liferay.desafio.model.Product;

public interface Tax {

    public double calculateTaxAmount(Product product);

}
