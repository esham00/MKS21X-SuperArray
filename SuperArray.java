public class SuperArray {
	private String[] data;
	private int size;
	public SuperArray (int s) {
		if (s > 10) {
			s = 10;
		}
		size = s;
		data = new String[size];
	}
	public SuperArray() {
		size = 10;
		data = new String[size];
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
		if (size == 0) {
			resize();
		}
		for(int i = 0; i < size; i++) {
			if (data[i] == null) {
				data[i] = element;
				return true;
			}
			if (data[size-1] != null) {
				resize();
				i = -1;
			}
		}
		return false;
	}
	public String toString() {
		String brandnew = "[";
		for(int i = 0; i < size; i++) {
			if (data[i] == null) {
				i++;
			}
			else if (i == 0) {
				brandnew += data[i];
			}
			else {
				brandnew += ", " + data[i];
			}
		}
		brandnew += "]";
		return brandnew;
	}
	public String toStringDebug() {
		String brandnew = "[";
		for(int i = 0; i < size; i++) {
			if (i == 0) {
				brandnew += data[i];
			}
			else {
				brandnew += ", " + data[i];
			}
		}
		brandnew += "]";
		return brandnew;
	}
	public String get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		return data[index];
	}
	public String set(int index, String element) {
		if (index < 0 || index >= size) {
			return null;
		}
		String oldElement = data[index];
		data[index] = element;
		return oldElement;
	}
	private void resize() {
		if (size == 0) {
			size = 1;
			data = new String[size];
		}
		size++;
		String[] original = new String[size-1];
		data = new String[size];
		for (int i = 0; i < size-1; i++) {
			data[i] = original[i];
		}
	}
}
