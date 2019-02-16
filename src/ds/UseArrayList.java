package ds;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(20);
		list.add(25);
		list.add(295);
		
		for(Integer data:list) {
			System.out.println(data);
		}

	}

}
