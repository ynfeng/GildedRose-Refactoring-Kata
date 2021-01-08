package com.gildedrose;

public class HandOfRagnaros extends Item {
    protected HandOfRagnaros(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void oneDayPassed() {
    }
}
