package net.local.liferay.desafio.util;

import java.util.ArrayList;
import java.util.List;

import net.local.liferay.desafio.model.Sale;

public class InMemoryData {
    
    private static InMemoryData instance;
    private List<Sale> saleList;

    private InMemoryData() {
        this.saleList = new ArrayList<Sale>();
    }

    public static synchronized InMemoryData getInstance() {
		if (instance == null)
			instance = new InMemoryData();
		return instance;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }
    
}
