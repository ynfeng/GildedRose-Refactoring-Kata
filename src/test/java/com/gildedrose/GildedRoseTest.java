package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void should_align_with_base_line() {
        CombinationApprovals.verifyAllCombinations(GildedRoseTest::itemOneDayPassed,
            new String[] {
                "foo",
                "Aged Brie",
                "Conjured",
                "Backstage passes to a TAFKAL80ETC concert",
                "Sulfuras, Hand of Ragnaros"},
            new Integer[] {0, -1, 4, 12, 9},
            new Integer[] {0, 3, 52, 47});
    }

    @Test
    public void conjured_should_decrease_quality_twice_than_of_ordinary_item() {
        Item item = ItemFactory.createItem("Conjured", 10, 15);

        item.oneDayPassed();

        assertEquals(item.sellIn(), 9);
        assertEquals(item.quality(), 13);
    }

    @Test
    public void conjured_should_decrease_quality_twice_than_of_ordinary_item_when_expire() {
        Item item = ItemFactory.createItem("Conjured", 0, 15);

        item.oneDayPassed();

        assertTrue(item.isExpired());
        assertEquals(item.quality(), 11);
    }

    private static String itemOneDayPassed(String name, int sellIn, int quality) {
        Item[] items = {ItemFactory.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.oneDayPassed();
        return app.items()[0].toString();
    }

}
