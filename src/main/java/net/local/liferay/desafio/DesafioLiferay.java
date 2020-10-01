package net.local.liferay.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import net.local.liferay.desafio.model.Product;
import net.local.liferay.desafio.model.ProductType;
import net.local.liferay.desafio.model.Sale;
import net.local.liferay.desafio.model.SaleItem;
import net.local.liferay.desafio.util.InMemoryData;
import net.local.liferay.desafio.util.Util;

public class DesafioLiferay {

    private static InMemoryData database;

    public static void main(String[] args) {
        setup();
        
        for(Sale sale : database.getSaleList()) {
            String output = "Quantity: %s - Product: %s - Value: %s ";
            for(SaleItem item : sale.getSaleItems()) {
                BigDecimal value = Util.roundNumber(new BigDecimal(item.getTaxAmount()), new BigDecimal("0.05"), RoundingMode.UP);
                System.out.println(String.format(output, item.getQuantity(), item.getProduct().getProductName(), Util.formatNumber(value.add(new BigDecimal(item.getProduct().getProductValue())) )));
            }
            BigDecimal totalTaxAmount = Util.roundNumber(new BigDecimal(sale.getTotalTaxAmount()), new BigDecimal("0.05"), RoundingMode.UP);
            System.out.println("Total Tax: "  + totalTaxAmount);

            BigDecimal totalSale = new BigDecimal(sale.getTotalSaleAmount());
            System.out.println("Total Sale Amount: " +  Util.formatNumber(totalSale.add(totalTaxAmount)) + "\n");
         }
    }
    
    private static void setup() {
        database = InMemoryData.getInstance();
        setupSale1();
        setupSale2();
        setupSale3();         
    }

    private static void setupSale1(){
        Sale sale = new Sale();
        sale.setSaleItems(new ArrayList<SaleItem>());

        Product product1 = new Product(1, "Book", 	  	  ProductType.BOOK,   12.49);
        Product product2 = new Product(2, "Music CD", 	  ProductType.OTHERS, 14.99);
        Product product3 = new Product(3, "Chocolat Bar", ProductType.FOOD,   0.85);

        sale.getSaleItems().add(new SaleItem(1, product1, 1));
        sale.getSaleItems().add(new SaleItem(2, product2, 1));
        sale.getSaleItems().add(new SaleItem(3, product3, 1));

        database.getSaleList().add(sale);
    }
    
    private static void setupSale2(){
        Sale sale = new Sale();
        sale.setSaleItems(new ArrayList<SaleItem>());

        Product product1 = new Product(4, "Imported box of chocolates", ProductType.TAX_ONLY_IMPORTED, 10.0);
        Product product2 = new Product(5, "Imported bottle of perfume", ProductType.IMPORTED, 47.50);

        sale.getSaleItems().add(new SaleItem(1, product1, 1));
        sale.getSaleItems().add(new SaleItem(2, product2, 1));

        database.getSaleList().add(sale);
    }
    
    private static void setupSale3(){
        Sale sale = new Sale();
        sale.setSaleItems(new ArrayList<SaleItem>());

        Product product1 = new Product(6, "Imported bottle of perfume", ProductType.IMPORTED, 27.99);
        Product product2 = new Product(7, "Bottle of perfume", 			ProductType.OTHERS,   18.99);
        Product product3 = new Product(8, "Packet of headache pills", 	ProductType.MEDICINE,  9.75);
        Product product4 = new Product(9, "Imported box of chocolates", ProductType.TAX_ONLY_IMPORTED, 11.25);

        sale.getSaleItems().add(new SaleItem(1, product1, 1));
        sale.getSaleItems().add(new SaleItem(2, product2, 1));
        sale.getSaleItems().add(new SaleItem(3, product3, 1));
        sale.getSaleItems().add(new SaleItem(4, product4, 1));
        
        database.getSaleList().add(sale);
    }
}