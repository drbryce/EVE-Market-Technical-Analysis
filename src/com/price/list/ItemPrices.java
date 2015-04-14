package com.price.list;




import java.io.Serializable;
import java.util.ArrayList;



public class ItemPrices implements Serializable {
    
    int itemID;
    ArrayList<DailyPrice> prices = new ArrayList<DailyPrice>();

    public ItemPrices(int itemID) {
        this.itemID = itemID;
    }
    
    public void addPrices(DailyPrice dailyPrice){
        prices.add(dailyPrice);
    }

    @Override
    public String toString() {
        return "ItemPrices{" + "itemID=" + itemID + ", prices=" + prices + '}';
    }

    public void printValues(){
        for(int index = 0; index < prices.size() ; index++){
            System.out.println(prices.get(index).toString());
        }
        
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public ArrayList<DailyPrice> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<DailyPrice> prices) {
        this.prices = prices;
    }
}
