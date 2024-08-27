package org.july_24.map;

import java.util.ArrayList;
import java.util.List;

public class MyMap {
    private static List<List<Entry>> map;

    MyMap() {
        map = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            map.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        int hash = key % map.size();
        List<Entry> bucket = map.get(hash);

        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry(key, value));
    }

    public Integer get(int key) {
        int hash = key % map.size();
        List<Entry> bucket = map.get(hash);

        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }
    public void remove(int key) {
        int hash = key%10;
        List<Entry> bucket = map.get(hash);

        for(int i=0; i<bucket.size(); i++){
            Entry entry = bucket.get(i);
            if(entry.key == key){
                bucket.remove(i);
                return;
            }
        }
    }

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }


}
