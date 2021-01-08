package com.gildedrose;

public abstract class Item {

    private final String name;

    private int sellIn;

    private int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }

    abstract void oneDayPassed();

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void decreaseSellIn() {
        sellIn -= 1;
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }

    protected void makeItWorthless() {
        quality = 0;
    }

    protected boolean willExpireIn(int days) {
        return sellIn < days;
    }

    public int sellIn() {
        return sellIn;
    }

    public int quality() {
        return quality;
    }
}
