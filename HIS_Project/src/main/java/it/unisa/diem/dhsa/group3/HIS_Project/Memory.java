package it.unisa.diem.dhsa.group3.HIS_Project;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.hl7.fhir.r4.model.Resource;

//Class necessary to keep the memory of the operations performed in the application
public class Memory implements Map<Class<? extends BaseResource>, Map<String, Resource>>{
	
	static private Memory mem = null;
	private Map<Class<? extends BaseResource>, Map<String, Resource>> resources;
	
	private Memory() {
		resources = new HashMap<>();
	}
	
	public static Memory getMemory() {
		if(mem == null)
			mem = new Memory();
		return mem;
	}

	@Override
	public int size() {
		return resources.size();
	}

	@Override
	public boolean isEmpty() {
		return resources.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return resources.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return resources.containsValue(value);
	}

	@Override
	public Map<String, Resource> get(Object key) {
		return resources.get(key);
	}

	@Override
	public Map<String, Resource> put(Class<? extends BaseResource> key, Map<String, Resource> value) {
		return resources.put(key, value);				
	}

	@Override
	public Map<String, Resource> remove(Object key) {
		return resources.remove(key);
	}

	@Override
	public void putAll(Map<? extends Class<? extends BaseResource>, ? extends Map<String, Resource>> m) {
		resources.putAll(m);
		
	}

	@Override
	public void clear() {
		resources.clear();		
	}

	@Override
	public Set<Class<? extends BaseResource>> keySet() {
		return resources.keySet();
	}

	@Override
	public Collection<Map<String, Resource>> values() {
		return resources.values();
	}

	@Override
	public Set<Entry<Class<? extends BaseResource>, Map<String, Resource>>> entrySet() {
		return resources.entrySet();
	}
	
	
}
