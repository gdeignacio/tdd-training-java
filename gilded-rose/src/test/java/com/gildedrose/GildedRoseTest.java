package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void shouldBeSellableInDate() {

        Item[] items = new Item[]{new Item("foo", 1, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].sellIn);

    }

    @Test
    public void shouldNotBeSellableOutOfDate() {

        Item[] items = new Item[]{new Item("foo", 0, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();
        
        assertEquals(-1, app.items[0].sellIn);

    }

    @Test
    public void shouldBeValuableToday() {

        Item[] items = new Item[]{new Item("foo", 1, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);

    }

    @Test
    public void shouldBeValuableTomorrow() {

        Item[] items = new Item[]{new Item("foo", 1, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();
        app.updateQuality();
        assertEquals(0, app.items[0].quality);

    }

    @Test
    public void shouldBeLessValuableIfOutOfDate() {

        Item[] items = new Item[]{new Item("foo", 0, 4)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();
        assertEquals(2, app.items[0].quality);

    }

    @Test
    public void shouldBeAgedBrieMoreValuable() {

        Item[] items = new Item[]{new Item("Aged Brie", 1, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(2, app.items[0].quality);

    }

    @Test
    public void shouldBeAgedBrieValueLessThan50() {

        Item[] items = new Item[]{new Item("Aged Brie", 1, 50)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, app.items[0].quality);

    }
    
    
    @Test
    public void shouldBeBackstageValueLessThan50() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, app.items[0].quality);

    }

    @Test
    public void shouldSulfurasNotOnSale() {

        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 20, 20)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(20, app.items[0].quality);
        assertEquals(20, app.items[0].sellIn);
    }

    @Test
    public void shouldBPMoreValuable() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 20, 20)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, app.items[0].quality);
        assertEquals(19, app.items[0].sellIn);
    }

    @Test
    public void shouldBPEvenMoreValuable() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(12, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void shouldBPOnFire() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(12, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }
    
    
    @Test
    public void shouldBPAboutOnFire() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(11, app.items[0].quality);
    }
    
    @Test
    public void shouldBPBurning() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(13, app.items[0].quality);
       
    }
    
    @Test
    public void shouldBPAboutBurning() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(12, app.items[0].quality);
       
    }
    

    @Test
    public void shouldBeTooLateToSell() {

        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

}
