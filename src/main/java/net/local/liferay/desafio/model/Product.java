package net.local.liferay.desafio.model;

public class Product {

    private int productId;
    private String productName;
    private ProductType productType;
    private Double productValue;

    public Product(final int productId, final String productName, final ProductType productType,
            final Double productValue) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productValue = productValue;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(final int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    public void setProductValue(final Double productValue) {
        this.productValue = productValue;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(final ProductType productType) {
        this.productType = productType;
    }
}