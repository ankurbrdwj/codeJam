package com.ankur.practice.extreme;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class TripletTest {
    @Test
    public void testTripletSort() {
        Triplet tt = new Triplet();
        Map<Integer, Triplet> triplets = tt.getInput();
        Map<Integer, Triplet> map = tt.sortByValue(triplets);
        assertNotNull(map);
        assertTrue(map.containsKey(1000));
        for (Map.Entry<Integer, Triplet> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " :: " + entry.getKey());
        }

    }
}
