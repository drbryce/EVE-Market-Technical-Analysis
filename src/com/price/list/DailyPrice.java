package com.price.list;

import java.io.Serializable;





public class DailyPrice implements Serializable{
    String date;
    double lowPrice;
    double highPrice;
    double avgPrice;
    double ema12;
    double ema26;
    double ema50;

    @Override
    public String toString() {
        return "DailyPrice{" + "date=" + date + ", lowPrice=" + lowPrice + ", highPrice=" + highPrice + ", avgPrice=" + avgPrice + ", volume=" + volume + ", orders=" + orders + '}';
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
    long volume;
    int orders;

}
