package Test;

public class Element implements Comparable<Element> {

	final int EQUAL = 0;
	final int BEFORE = -1;
	final int AFTER = 1;

	private int CompaCount;
	private int Value;
	
	public Element() {
		CompaCount = 0;
		Value = 1;
	}
	
	public Element(int newValue){
		CompaCount = 0;
		Value = newValue;
	}
	
	public void setValue(int newValue) {
		this.Value = newValue;
	}

	public int getValue() {
		return Value;
	}

	public void addCount() {
		this.CompaCount++;
	}
	
	public int getCount(){
		return this.CompaCount;
	}

	@Override
	public int compareTo(Element that) {
		// TODO Auto-generated method stub
		addCount();
		
		if (this == that)
			return EQUAL;
		if (this.getValue() > that.getValue())
			return AFTER;
		if (this.getValue() < that.getValue())
			return BEFORE;
		return EQUAL;
	}

	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (!(that instanceof Element))
			return false;

		Element aThat = (Element) that;
		if (this.getValue() == aThat.getValue())
			return true;

		return false;
	}

}
