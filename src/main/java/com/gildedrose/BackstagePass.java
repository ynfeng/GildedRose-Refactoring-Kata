package com.gildedrose;

public class BackstagePass extends Item {
    protected BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void oneDayPassed() {
        increaseQuality();
        if (willExpireIn(11)) {
            increaseQuality();
        }
        if (willExpireIn(6)) {
            increaseQuality();
        }
        decreaseSellIn();
        if (isExpired()) {
            makeItWorthless();
        }
    }

}
