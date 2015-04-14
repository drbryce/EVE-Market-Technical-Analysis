
package com.xmlprices;

import com.price.list.ItemPrices;
import java.io.IOException;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class XML_Controller { //Abstraction from main program
    
    ItemPrices itemPrices;
    String url;

    public XML_Controller(ItemPrices itemPrices, String charName, int region, int days) throws SAXException, IOException {
        this.itemPrices = itemPrices;
        this.url = "http://api.eve-marketdata.com/api/item_history2.xml?char_name=" + charName + "&region_ids=" + region + "&type_ids=" + itemPrices.getItemID() + "&days=" + days;
        XML_Handler xml_handler = new XML_Handler(itemPrices,url);
        XMLReader xml_reader = null;
        
        xml_reader = XMLReaderFactory.createXMLReader();
        xml_reader.setContentHandler(xml_handler);
        
        xml_reader.parse(new InputSource(new URL(url).openStream()));
        
        
    }

}
