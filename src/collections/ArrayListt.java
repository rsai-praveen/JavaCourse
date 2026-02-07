package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List alist =new ArrayList();
		System.out.println(alist.size()); // no data present so it returns 0
		alist.add(10000);
		alist.add("praveen");
		alist.add("c");
		alist.add(10000);
		alist.add("praveen");
		alist.add("c");
		alist.add(10000);
		alist.add("praveen");
		alist.add("c");
		alist.add(10000);
		alist.add("praveen");
		alist.add("c");
		System.out.println(alist.size());
		System.out.println(alist.contains("praveen"));
		System.out.println(alist.isEmpty());
		System.out.println("************");
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}

	}

}
