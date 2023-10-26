package java_generic;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class GenericPrac {
	public static void main(String[] args) {
		Pair<String, Integer> a = new Pair<>("One", 1);
		Pair<Integer, String> b = new Pair<>(2, "Two");

		System.out.println("Key : " + a.getKey() + ", Value : " + a.getValue());
		System.out.println("Key : " + b.getKey() + ", Value : " + b.getValue());
	}
}
