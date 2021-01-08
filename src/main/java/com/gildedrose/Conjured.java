package com.gildedrose;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    void oneDayPassed() {
        decreaseQuality();
        decreaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
            decreaseQuality();
        }
    }
}
