package pl.sdacademy.list;

import java.util.Arrays;

public class IntList {
    // pole bedzie sluzylo do przechowywania elementow listy
    private int[] elements;

    // pusty konstruktor, jesli chcemy zaczac od pustej listy
    public IntList() {
        // przypiszemy zmiennej elements pusta list
        elements = new int[0];
    }

    public void add(int element) {
        int[] newElements = new int[elements.length + 1];
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public void removeAt(int index) {
        int[] newElements = new int[elements.length - 1];

        for(int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        for(int i = index + 1; i < elements.length; i++) {
            newElements[i - 1] = elements[i];
        }
        elements = newElements;
    }

    public void removeAll(int element) {
        int elementOccurrenceCount = 0;
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == element) {
                elementOccurrenceCount++;
            }
        }

        int newElementsLength = elements.length - elementOccurrenceCount;
        int[] newElements = new int[newElementsLength];

        int indexShift = 0;
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == element) {
                indexShift++;
            } else {
                newElements[i - indexShift] = elements[i];
            }
        }
        elements = newElements;
    }

    public int get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return "IntList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
