package namoosori.elephant.datastructure.list.list;

public class MyStringLinkedHashMap<K, V> {
	
	private int capacity = 16;
	private Node[] array;
	
	static class Node<K, V>{
		
		Node<K, V> next;
		K key;
		V value;
		
		Node(K key, V value, Node<K, V> next){
			
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		public K getKey() {
			
			return key;
		}
		
		public V getValue() {
			
			return value;
		}
		
		public V setValue(V newValue) {
			
			V oldValue = value;
			value = newValue;
			
			return oldValue;
		}
	}
	
	public MyStringLinkedHashMap() {
		
		array = new Node[capacity];
	}
	
	int hash(K key) {
		
		int hash = 0;
		
		for(int i = 0; i < key.toString().length(); ++i) {
			
			char c = key.toString().charAt(i);
			hash += (int) c;
		}
		
		return hash % capacity;
	}
	
	public V put(K key, V value) {
		
		return putVal(key, value, hash(key));
	}
	
	public V putVal(K key, V value, int hash) {
		
		Node<K, V> node = getNode(hash, key);
		
		if(node!=null) {
			return node.setValue(value);
		} else {
			if(array[hash] == null) {
				array[hash] = new Node(key, value, null);
			} else {
				node = array[hash];
				
				while(node.next != null) {
					node = node.next;
				}
				node.next = new Node(key, value, null);
			}
		}
		print();
		return null;
	}
	
	public V get(K key)
    {
        Node<K, V> node = getNode(hash(key), key);
        
        return node == null? null: node.getValue();
    }
    
    // 배열 내에 키 값이 존재하지는 확인 후 존재하면 해당 키가 있는 Node 리턴
    public Node<K, V> getNode(int hash, K key)
    {
        Node<K, V> node = array[hash];
        
        while( node != null && node.next != null )
        {
            if( node.getKey().equals(key) )
            {
                return node;
            }
            
            node = node.next;
        }
        return null;
    }
    
    public V replace(K key, V value)
    {
        Node<K, V> node = getNode(hash(key), key);
        
        if( node != null )
            return node.setValue(value);
        
        return null;
    }
    
    public V remove(K key)
    {
        return removeNode(hash(key), key);
    }
    
    public V removeNode(int hash, K key)
    {
        Node<K, V> node = array[hash];
        Node<K, V> preNode = null;
        V oldValue = null;
        
        while( node != null )
        {
            if( node.getKey().equals(key) )
            {
                oldValue = node.getValue();
                
                if( preNode == null )
                    array[hash] = node.next;
                else
                    preNode.next = node.next;
                
                node = null;
                break;
            }
            
            preNode = node;
            node = node.next;
        }
        
        print();
        return oldValue;
    }
    
    // 배열 요소를 출력하기 위한 메소드
    void print()
    {
        for( int i = 0; i < array.length; ++i )
            System.out.println(array[i] == null? null: array[i].toString());
        System.out.println("--------------------------------------------------------------------");
    }
}




























