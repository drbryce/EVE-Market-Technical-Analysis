
import com.helpers.SerializeObject;
import com.price.list.*;
import com.xmlprices.*;
import java.io.IOException;
import org.xml.sax.SAXException;



public class test {

    public static void main (String args[]) throws SAXException, IOException, ClassNotFoundException{
        
     
        ItemPrices itemPrices = (ItemPrices)  SerializeObject.readFile(34);

        itemPrices.printValues();
    }
    
    public void downloadTrit() throws SAXException, IOException{
    
        ItemPrices eveItem = new ItemPrices(34);
        XML_Controller xml_controller = new XML_Controller(eveItem,"demo",10000002,30);
        
        SerializeObject.writeToFile(eveItem);
               
    }
    
}
