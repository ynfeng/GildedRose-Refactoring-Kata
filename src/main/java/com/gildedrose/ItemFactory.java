package com.gildedrose;

public class ItemFactory {
    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new HandOfRagnaros(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(sellIn, quality);
            case "Conjured":
                return new Conjured(sellIn,quality);
            default:
                return new OrdinaryItem(name, sellIn, quality);
        }
    }
}
