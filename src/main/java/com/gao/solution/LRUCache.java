package com.gao.solution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author gs
 * @Date created time 2019/5/20 18:14
 * @Description
 */
public class LRUCache {

    private Map<Integer,CacheNode> cache;
    private CacheNode head;
    private CacheNode tail;
    int count;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new HashMap();
        this.count = 0;
        this.capacity = capacity;
        head = new CacheNode();
        tail = new CacheNode();
    }

    public int get(int key) {
        CacheNode node = cache.get(key);
        node.pre.post = node.post;
        node.post.pre = node.pre;
        node.pre = tail;
        node.post = head;
        head.pre = node;
        tail = node.pre;
        head = node;
        return node.value;
    }
    public void put(int key, int value) {
        CacheNode node = new CacheNode(key,value);
        if(cache.isEmpty()){
            head.post = node;
            tail.pre = node;
            node.pre = head;
            node.post = tail;
            cache.put(key,node);
            this.count++;
            return;
        }
        CacheNode old = cache.get(key);
        if(null != old){
            old.pre.post = old.post;
            old.post.pre = old.pre;
            node.pre = head;
            node.post = head.post;
            head.post = node;
            tail = node;
            cache.put(key,node);
            return;
        }
        if(this.count == this.capacity){
            int rmk = tail.key;
            tail.pre.post = tail.post;
            tail.post.pre = tail.pre;
            cache.remove(rmk);
        }
        node.pre = head.pre;
        node.post = head;
        head.pre = node;
        head = node;
        cache.put(key,node);
        this.count++;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(3,3);
        cache.put(4,4);
    }

}
class CacheNode{
    int key;
    int value;
    CacheNode pre;
    CacheNode post;

    public CacheNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public CacheNode() {

    }
}
