package net.local.liferay.desafio.model;

import net.local.liferay.desafio.domain.TaxFree;
import net.local.liferay.desafio.domain.TaxImported;
import net.local.liferay.desafio.domain.TaxOnlyImported;
import net.local.liferay.desafio.domain.TaxOthers;

public class SaleItem {
    
    private int saleItemId;
    private Product product;
    private Integer quantity;

    public SaleItem(final int saleItemId, final Product product, final Integer quantity) {
        this.saleItemId = saleItemId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(final int saleItemId) {
        this.saleItemId = saleItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public double getTaxAmount() {
        double result = 0;
        switch(this.product.getProductType()){
            case BOOK: 
                result = new TaxFree().calculateTaxAmount(this.product); 
            break;
            case FOOD:
                result = new TaxFree().calculateTaxAmount(this.product); 
            break;
            case MEDICINE:
                result = new TaxFree().calculateTaxAmount(this.product); 
            break;
            case IMPORTED:
                result = new TaxImported().calculateTaxAmount(this.product); 
            break;
            case TAX_ONLY_IMPORTED:
                result = new TaxOnlyImported().calculateTaxAmount(this.product); 
            break;
            case OTHERS:
                result = new TaxOthers().calculateTaxAmount(this.product); 
            break;
        }
        return result;
    }
}
