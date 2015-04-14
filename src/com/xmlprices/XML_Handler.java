
package com.xmlprices;

import com.price.list.ItemPrices;
import com.price.list.DailyPrice;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class XML_Handler extends DefaultHandler{ //Does the actual parsing work
    
    ItemPrices itemPrices;
    String url;
    
    public XML_Handler(ItemPrices itemPrices, String url) {
        this.itemPrices = itemPrices;
        this.url = url;
    }
    
    
    public void startDocument() throws SAXException {

    }

    public void endDocument() throws SAXException {

    }

    public void startElement(String uri, String localName,
        String qName, Attributes attributes)
    
        throws SAXException {
        if(qName == "row"){
            
            DailyPrice dailyPrice = new DailyPrice();
            
            dailyPrice.setDate(attributes.getValue("date"));
            dailyPrice.setLowPrice(Double.parseDouble(attributes.getValue("lowPrice")));
            dailyPrice.setHighPrice(Double.parseDouble(attributes.getValue("highPrice")));
            dailyPrice.setAvgPrice(Double.parseDouble(attributes.getValue("avgPrice")));
            dailyPrice.setVolume(Long.parseLong(attributes.getValue("volume")));
            dailyPrice.setOrders(Integer.parseInt(attributes.getValue("orders")));
            itemPrices.addPrices(dailyPrice);
            
        }
    }

    public void endElement(String uri, String localName, String qName)
    throws SAXException {

    }


    
}
