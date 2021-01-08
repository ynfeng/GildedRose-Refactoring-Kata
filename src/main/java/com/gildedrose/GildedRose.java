package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    private final Item[] items;

    GildedRose(Item[] items) {
        this.items = items.clone();
    }

    public void oneDayPassed() {
        Arrays.stream(items).forEach(Item::oneDayPassed);
    }

    public Item[] items() {
        return items.clone();
    }
}
