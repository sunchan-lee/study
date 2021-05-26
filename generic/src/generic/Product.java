package generic;

//멀티타입 파라미터 콤마, 구분해서 넣으면 된다..
public class Product <K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	

}
