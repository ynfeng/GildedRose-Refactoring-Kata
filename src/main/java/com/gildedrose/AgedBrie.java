package com.gildedrose;

public class AgedBrie extends Item {
    protected AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void oneDayPassed() {
        increaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            increaseQuality();
        }
    }

}
