
package com.helpers;

import com.price.list.ItemPrices;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializeObject implements Serializable {
    
    
    public static void writeToFile(ItemPrices itemPrices) throws IOException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(itemPrices.getItemID() + ".dat"));
        objectOutputStream.writeObject(itemPrices);
    }
    
    public static Object readFile(int itemID) throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(itemID + ".dat"));
        
        ItemPrices itemPrices = (ItemPrices) objectInputStream.readObject();
        //itemPrices.printValues();
        return itemPrices;
        
    }


}
