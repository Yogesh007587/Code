import java.util.*;

class yogi1
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add elemets
        list.add(9);
		list.add(16);
		list.add(2);

        //System.out.println(list);

        //get elements
        //System.out.println(list.get(0));

        //add elements in between
        list.add(1, 1);
        //System.out.println(list);

        //set elements
        list.set(0, 5);
        //System.out.println(list);

        //remove elements
        list.remove(0);
        //System.out.println(list);

        //size
        int size = list.size();
        //System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
           // System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
	}
}
