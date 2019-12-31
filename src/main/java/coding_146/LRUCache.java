package coding_146;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;


class CacheValue {

    public CacheValue(int key, int time, int value) {
        this.key = key;
        this.time = time;
        this.value = value;
    }

    private int key;

    private int time;

    private int value;


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CacheValue)) {
            return false;
        }
        CacheValue that = (CacheValue) o;
        return getKey() == that.getKey();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getKey());
    }
}

class LRUCache {

    PriorityQueue<CacheValue> priorityQueue = new PriorityQueue<>(
        new Comparator<CacheValue>() {
            @Override
            public int compare(CacheValue o1, CacheValue o2) {

                return  (o1.getTime() - o2.getTime());
            }
        }
    );


    private Map<Integer, CacheValue> cache;

    private int capacity = 0;

    private int timmer;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
        timmer = 0;
    }

    public int get(int key) {
        timmer++;
        CacheValue value = cache.get(key);

        if (null == value) {
            return -1;
        } else {

            priorityQueue.remove(value);
            value.setTime(timmer);
            priorityQueue.add(value);

            return value.getValue();
        }
    }

    public void put(int key, int value) {
        timmer++;

        if (cache.get(key) == null) { // 不包含

            if (cache.size() < capacity) {

                CacheValue cacheValue = new CacheValue(key, timmer, value);

                cache.put(key, cacheValue);
                priorityQueue.add(cacheValue);
            } else if (cache.size() == capacity){
                CacheValue cacheValue1 =  priorityQueue.poll();
                cache.remove(cacheValue1.getKey());

                CacheValue cacheValue = new CacheValue(key, timmer, value);

                cache.put(key, cacheValue);
                priorityQueue.add(cacheValue);
            }

        } else { // 更新
            CacheValue cacheValue = cache.get(key);

            priorityQueue.remove(cacheValue);
            cacheValue.setKey(key);
            cacheValue.setTime(timmer);
            cacheValue.setValue(value);

            cache.put(key, cacheValue);
            priorityQueue.add(cacheValue);
        }

    }
}
