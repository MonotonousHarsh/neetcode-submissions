class LRUCache {
    
    public int size;
    private final LinkedHashSet<Integer> cache = new LinkedHashSet<>(); 

    HashMap<Integer,Integer>map = new HashMap<>(size);

    public LRUCache(int capacity) {
        this.size = capacity;        
    }
    
    public int get(int key) {    
       if(!map.containsKey(key)){
        return -1;
       } 
       cache.remove(key);
       cache.add(key);     

    return map.get(key);
       
    }
    
    public void put(int key, int value) {       
        if(map.containsKey(key)){
            cache.remove(key);
        }else if(map.size() >= size){
            int oldestKey = cache.iterator().next();
            cache.remove(oldestKey);
            map.remove(oldestKey);
        }
        cache.add(key);
        map.put(key,value);
       }      
      
        
    }







