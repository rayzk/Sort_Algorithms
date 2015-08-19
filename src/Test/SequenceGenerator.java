package Test;

import java.util.ArrayList;

public class SequenceGenerator {

	final static int ONE = 1;

	public static Element[] getAllOnesSeq(int size, Element[] a) {
		ArrayList<Element> array = new ArrayList<Element>();
		for (int i = 0; i < size; i++) {
			array.add(new Element(ONE));
		}
		return array.toArray(a);
	}

	public static getShuffledSeq(int size){
		
	}

	public static Element[] getAscendingSeq(int size, Element[] a) {
		ArrayList<Element> array = new ArrayList<Element>();
		for (int i = 0; i < size; i++) {
			array.add(new Element(i));
		}
		return array.toArray(a);
	}

	public static Element[] getDescendingSeq(int size, Element[] a) {
		ArrayList<Element> array = new ArrayList<Element>();
		for (int i = 0; i < size; i++) {
			array.add(new Element(size - i));
		}
		return array.toArray(a);
	}

}
