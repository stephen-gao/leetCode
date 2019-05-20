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

    private CacheNode[] cache;
    private CacheNode head;
    private CacheNode tail;
    int count;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new CacheNode[2];
        this.count = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {
        CacheNode node = new CacheNode(key,value);
        if(this.count < this.capacity){
            int i = key % capacity;
            if(null == cache){
                node.post = head;
                node.pre = tail;
                tail = head.pre;
                head = node;
            }
            if(null !=cache[i]){
                if(cache[i].key == key){
                    node.post = head;
                    node.pre = tail;
                    cache[i].post.pre = node;
                }
            }
        }
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
}
