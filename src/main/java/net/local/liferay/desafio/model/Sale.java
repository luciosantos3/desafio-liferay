package net.local.liferay.desafio.model;

import java.util.List;

public class Sale {
    
    private int saleId;

    private List<SaleItem> saleItems;

    public Sale() {
        super();
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public double getTotalTaxAmount() {
        double result = 0;
        for(SaleItem item : this.saleItems) {
            result += item.getTaxAmount() * item.getQuantity();
        }
        return result;
    }

    public double getTotalSaleAmount() {
        double result = 0;
        for(SaleItem item : this.saleItems) {
            result += item.getProduct().getProductValue() * item.getQuantity();
        }
        return result;
    }
}
