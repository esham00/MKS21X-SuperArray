import java.util.NoSuchElementException;
public class SuperArray {
	private String[] data;
	private int size;
	/*public SuperArray(int startingCapacity) {
		if (startingCapacity == 0) {
			data = new String[1];
		}
		data = new String[startingCapacity];
	}*/
	public SuperArray(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Your array size cannot be lower than zero");
		}
		else if (initialCapacity == 0) {
			data = new String[1];
		}
		else {
			data = new String[initialCapacity];
		}
	}
	/*public SuperArray (int s) {
		if (s > 10) {
			s = 10;
		}
		size = 0;
		data = new String[s];
	}*/
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
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		else {
			return data[index];
		}
	}
	public String set(int index, String element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		else {
			String oldElement = data[index];
			data[index] = element;
			return oldElement;
		}
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
			if (data[i].equals(target)) {
				return true;
			}
		}
		return false;
	}
	public int indexOf(String target) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(String target) {
		int lastI = -1;
		for (int i = 0; i < size; i++) {
			if (data[i].equals(target)) {
				lastI = i;
			}
		}
		return lastI;
	}
	public void add(int index, String element) {
	    if (index != 0 && (index < 0 || index >= size )) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		String[] xin = new String[data.length+1];
		for (int i = 0; i < xin.length; i++) {
		    if (i == index) {
			xin[i] = (element);
		    }
		    if (i < index) {
			xin[i] = (data[i]);
		    }
		    if (i > index) {
			xin[i] = (data[i-1]);
		    }
		}
		data = xin;
		size++;
	}
	public String remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		String elementRemoved = data[index];
		String[] old = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			old [i] = data[i];
		}
		for (int i = 0; i < index; i++) {
			data[i] = old[i];
		}
		for (int i = index+1; i < size; i++) {
			data[i-1] = old [i];
		}
		size -= 1;
		return elementRemoved;
	}
    public boolean remove(String element) {
		int index = indexOf(element);
		if (index < 0) {
			return false;
		}
		String[] old = new String[data.length];
		for (int i = 0; i < size; i++) {
			old[i] = data[i];
		}
		for (int i = 0; i < index; i++) {
			data[i] = old[i];
		}
		for (int i = index+1; i < size; i++) {
			data[i-1] = old[i];
		}
		size -= 1;
		return true;
	}
}
