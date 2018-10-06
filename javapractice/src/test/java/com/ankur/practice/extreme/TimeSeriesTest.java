package com.ankur.practice.extreme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TimeSeriesTest {

    @Test
    public void testSeriesSort() {
        TimeSeries ts = new TimeSeries();
        List<Pair> list = ts.getInput();
        List<Pair>finalList=ts.mergeList( list );
        Assertions.assertNotNull(finalList);
        System.out.println(finalList.size());
        for(Pair p:finalList)
            System.out.println(p.getKey() +" "+p.getValue());
    }
}
