import java.util.*;

public class generateUnsortedList {

	public static void main(String[] args){
		int size = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList elements = new ArrayList();

		while (scanner.hasNext()){
			size = Integer.parseInt(scanner.next());
		}

		for (int i = 0; i < size; i++){
			elements.add(i + "");
		}
		ArrayList result = generate (elements);

		for (int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}

	public static ArrayList generate (ArrayList elementSet){
		ArrayList temp = new ArrayList();

		for (int i = 0; i < elementSet.size(); i++){
			temp.addAll(generate (elementSet.get(i), elementSet.remove(i)));
		}

		return temp;
	}

	private ArrayList generate (String key, ArrayList elementSet){
		ArrayList temp = new ArrayList();

		if (elementSet.size() = 1) {
			temp.add(elementSet.get(0));
			return temp;
		}

		for (int i = 0; i < elementSet.size(); i++){
			ArrayList tempList = generate (elementSet.get(i), elementSet.remove(i));
			for (int j = 0; j < tempList.size(); j++){
				tempList.get(i).concat(key);
			}
			temp.addAll(tempList);
		}
		return temp;
	}

}