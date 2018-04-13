package com.ankur.practice.extreme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/*
/2) you have time series data , out by combining overlapping ranges for eg
4 //number of lines
2 3
6 9
9 11
3 5
should out put
2// number of lines
2 5
6 11
 */
public class TimeSeries {
    public TimeSeries() {
    }

    public List<Pair> getInput() {
        Scanner scan = null;
        List<Pair> list = new ArrayList<Pair>();
        Map<Integer, Triplet> map = new HashMap<Integer, Triplet>();
        try {
            scan = new Scanner( new FileInputStream( "src/main/resources/TimeSeries/input.txt" ) );
            int num = Integer.parseInt( scan.nextLine() );
            for (int i = 0; i < num; i++) {
                String[] line = scan.nextLine().split( " " );
                Integer begin = Integer.parseInt( line[0] );
                Integer end = Integer.parseInt( line[1] );
                Pair pair = new Pair( begin, end );
                list.add( pair );
            }
            Collections.sort( list );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }

        return list;
    }


    public List<Pair> mergeList(List<Pair> list) {

        List<Pair> newList = new ArrayList<Pair>();
        for (int i = 1; i < list.size(); i++) {
            Pair p1 = list.get( i - 1 );
            Pair p2 = list.get( i );
            if (Integer.valueOf( (int) p1.getValue() ) >= Integer.valueOf( (int) p2.getKey() )) {
                p1.setValue( p2.getValue() );
                newList.add( p1 );
            }
        }
    return newList;
}
}
