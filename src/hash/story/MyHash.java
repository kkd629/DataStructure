package namoosori.elephant.datastructure.hash.story;

import java.util.Collection;
import java.util.Set;

import namoosori.elephant.datastructure.hash.facade.MyStringHash;
import namoosori.elephant.datastructure.hash.linknode.HashNode;

public class MyHash implements MyStringHash{

	HashNode hash = new HashNode();
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return hash.size();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return hash.empty();
	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		for(String k : hash.keys()) {
			if(k.equals(key)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void put(String key, Object value) {
		// TODO Auto-generated method stub
		hash.add(key, value);
	}

	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
		return hash.get(key);
	}

	@Override
	public void remove(String key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Collection<String> keySet() {
		// TODO Auto-generated method stub
		return hash.keys();
	}

	@Override
	public Collection<Object> values() {
		// TODO Auto-generated method stub
		return hash.values();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		hash.clear();
	}

}
