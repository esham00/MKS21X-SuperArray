public class SuperArray {
	private String[] data;
	private int size;
	public SuperArray (int s) {
		if (s > 10) {
			s = 10;
		}
		data = new String[s];
	}
	public void clear() {
		size = 0;
		data = new String[size];
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if (size == 0) {return true;}
		else {return false;}
	}
	public boolean add(String element) {
		for(int i = 0; i < size; i++) {
			if (data[i] == null) {
				data[i] = element;
				return true;
			}
		}
	}
	public String toString() {
		System.out.print("\"[");
		for(int i = 0; i < size; i++) {
			if (i = 0) {
				System.out.print(data[i])
			}
			else {
				System.out.print("," + data[i]);
			}
		}
		System.out.print("]\""
	}
	public String get(int index) {
		if (index < 0 || index >= size()) {
			return null;
		}
		return data[index];
	}
	public String set(int index, String element) {
		if (index < 0 || index >= size()) {
			return null;
		}
		oldElement = data[index];
		data[index] = element;
		return oldElement;
	}

