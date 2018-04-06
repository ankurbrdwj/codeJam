package com.ankur.practice.extreme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
/*
Sort these hotels codes on basis of their average scores for eg input
6
1000 8
2000 9
1000 10
3000 7
2000 8
3000 8

Output :
3000
2000
1000/
 */
public class Triplet implements Comparable {
    private int sum;
    private int count;
    private int value;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "sum=" + sum +
                ", count=" + count +
                ", value=" + value +
                '}';
    }

    public Triplet(int sum, int count, int value) {
        this.sum = sum;
        this.count = count;
        this.value = value;
    }

    public Triplet() {
    }

    public Map<Integer, Triplet> getInput() {
        Scanner scan = null;
        Map<Integer, Triplet> map = new HashMap<Integer, Triplet>();
        try {
            scan = new Scanner(new FileInputStream("src/main/resources/Triplet/input.txt"));
            int num = Integer.parseInt(scan.nextLine());


            for (int i = 0; i < num; i++) {
                String[] line = scan.nextLine().split(" ");
                int key = Integer.parseInt(line[0]);
                int val = Integer.parseInt(line[1]);
                if (map.containsKey(key)) {
                    int times = map.get(key).getCount() + 1;
                    int total = map.get(key).getSum() + val;

                    map.put(key, new Triplet(total, times, val));
                } else {
                    map.put(key, new Triplet(val, 1, val));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
        return map;
    }

    public Map<Integer, Triplet> sortByValue(Map<Integer, Triplet> triplets) {
        List<Map.Entry<Integer, Triplet>> list = new ArrayList(triplets.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<Integer, Triplet> result = new LinkedHashMap<Integer, Triplet>();
        for (Map.Entry<Integer, Triplet> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    //Note: this class has a natural ordering that is inconsistent with equals."
    @Override
    public int compareTo(Object o) {
        Triplet t1 = (Triplet) o;
        Double avg1 = new Double(this.getSum() / this.getCount());
        Double avg2 = new Double(t1.getSum() / t1.getCount());
        if (avg1 >= avg2) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triplet triplet = (Triplet) o;
        return sum == triplet.sum &&
                count == triplet.count &&
                value == triplet.value;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sum, count, value);
    }
}
