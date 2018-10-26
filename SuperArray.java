public class SuperArray {
	private String[] data;
	private int size;
	public SuperArray (int s) {
		if (s > 10) {
			s = 10;
		}
		size = 0;
		data = new String[s];
	}
	public SuperArray() {
		size = 0;
		data = new String[10];
	}
	public void clear() {
		size = 0;
		data = new String[1];
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if (size == 0) {return true;}
		else {return false;}
	}
	public boolean add(String element) {
		if (data.length == 0) {
			resize();
		}
		for(int i = 0; i < data.length; i++) {
			if (data[i] == null) {
				data[i] = element;
				size++;
				return true;
			}
			else if (data[data.length-1] != null) {
				resize();
				i = 0;
			}
		}
		return false;
	}
	public String toString() {
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
	public String toStringDebug() {
		String brandnew = "[";
		for(int i = 0; i < data.length; i++) {
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
		String[] original = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			original[i] = data[i];
		}
		data = new String[data.length+10];
		for (int i = 0; i < original.length; i++) {
			data[i] = original[i];
		}
	}
	public boolean contains(String target) {
		for (int i = 0; i < size; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false;
	}
	public int indexOf(String target) {
		for (int i = 0; i < size; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(String target) {
		int lastI = -1;
		for (int i = 0; i < size; i++) {
			if (data[i] == target) {
				lastI = i;
			}
		}
		return lastI;
	}
	public void add(int index, String element) {
		if (index < 0 || index >= size) {
			System.out.println("error"); //replace w better error message
		}
		if (data.length == 1 || index == data.length || data[data.length-1] != null) {
			resize();
		}
		String[] old = new String[data.length];
		for (int i = 0; i < size; i++) {
			old[i] = data[i];
		}
		size++;
		for (int i = 0; i < size-1; i++) {
			if (i >= index) {
				data[i+1] = old[i];
			}
			else if (i < index) {
				data[i] = old [i];
			}
			if (i == index) {
				data[i] = element;
			}
		}
	}
	public String remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		String elementRemoved = data[index];
		String[] old = new String[data.length];
		for (int i = 0; i < size-1; i++) {
			if (i < index) {
				data[i] = old [i];
			}
			if (i >= index) {
				data[i-1] = old[i];
			}
		}
		size -= 1;
		return elementRemoved;
	}
}
