package com.gildedrose;

public class OrdinaryItem extends Item {
    protected OrdinaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void oneDayPassed() {
        decreaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
        }
    }
}
