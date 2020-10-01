package net.local.liferay.desafio;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import net.local.liferay.desafio.model.Product;
import net.local.liferay.desafio.model.ProductType;
import net.local.liferay.desafio.model.Sale;
import net.local.liferay.desafio.model.SaleItem;
import net.local.liferay.desafio.util.InMemoryData;

public class DesafioLiferayTest {

	private static InMemoryData database;

	@Test
	public void testSalesQuantity() {
		assertEquals(database.getSaleList().size(), 3);
	}
	
	@Before
	public void incitialize() {
		setup();
		System.out.println("Iniciando os testes.");
	}
	
	@After
	public void finish() {
		System.out.println("Finalizando os testes.");
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
