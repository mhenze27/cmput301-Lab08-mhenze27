package com.example.lab08;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will initially fail because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
}
