
package com.calculations;

import java.util.Arrays;



public class TICalc {
    
    private static double calcSMA(double[] prices){
        
        int x;
        double total=0;
        
        for(x=0; x<prices.length; x++){
            total += prices[x];
        }
        
        return total/prices.length;
    }
    
    public static double calcEMA(double[] prices, int periods){
        
        int x;
        double ema;
        double[] smaArray= new double[periods];
        
        
        
        //Create an array for calculating the SMA
        for( x=0; x<smaArray.length; x++){
            smaArray[x] = prices[x];
        }
        ema = calcSMA(smaArray);
        
        double[] emaArray= Arrays.copyOf(smaArray,prices.length);
        emaArray[periods-1]=ema; //Set first EMA value to the SMA
        float k=2.0f/(periods + 1);
        
        for(x=periods; x<emaArray.length; x++){  //Loop through prices array creating EMA for each day
            
            ema = prices[x] * k + emaArray[x-1] * (1-k);
            emaArray[x] = ema;
        System.out.println(emaArray[x] + " : " + k);
        
        }
        
        
        
        return 0;
        
    }
    

}
