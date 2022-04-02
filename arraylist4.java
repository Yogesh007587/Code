import java.util.*;

class yogi1
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add elemets
        list.add(0);
		list.add(1);
		list.add(2);

        //System.out.println(list);

        //get elements
        //System.out.println(list.get(0));

        //add elements in between
        list.add(1, 1);
        System.out.println(list);

        //set elements
        list.set(0, 5);
        System.out.println(list);
	}
}
