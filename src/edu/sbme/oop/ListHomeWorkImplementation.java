package edu.sbme.oop;

public class ListHomeWorkImplementation implements ListHomeWorkInterface {

	int CURRENT_CAPACITY = 32;
	int currentIndex = 0;
	int[] elements = new int[32];

	@Override
	public void add(Integer element) {
		// COMPLETED Auto-generated method stub
		if (currentIndex == CURRENT_CAPACITY) {
			CURRENT_CAPACITY *= 2;
			int[] temp = elements;
			elements = new int[CURRENT_CAPACITY];
			for (int i = 0; i < currentIndex; i++)
				elements[i] = temp[i];
		}
		elements[currentIndex] = element;
		currentIndex++;
	}

	@Override
	public int get(int index) {
		// COMPLETED Auto-generated method stub
		if (index >= currentIndex) {
			throw new ArrayIndexOutOfBoundsException(index);
		} else {
			return elements[index];
		}
	}

	@Override
	public int size() {
		// COMPLETED Auto-generated method stub
		return currentIndex;
	}

}
