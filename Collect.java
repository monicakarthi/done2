package pratice.com;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Collect {
	public static void main(String[] args) {
		Set<Integer> a1 = new LinkedHashSet<Integer>();
		a1.add(10);
		a1.add(0);
		a1.add(20);
		a1.add(null);
		a1.add(null);
		System.out.println("a1" + a1);
		Set<Integer> a2 = new LinkedHashSet<Integer>();
		a2.add(40);
		a2.add(50);
		a2.add(60);
		System.out.println("a2" + a2);
		System.out.println("addall to a1"+ a1.addAll(a2));
		System.out.println("after adding a1" + a1);
	    a2.clear();
	    System.out.println("clearing a2 "+ a2 );
	    System.out.println("Does the Set contains '10'?" + a1.contains(10));   
        System.out.println("Does the Set contains 'null'? " + a1.contains(null));  
        System.out.println("Does the Set contains '20'? " + a1.contains(20));  
		System.out.println("contains all " +a1.containsAll(a2));
		System.out.println("hashcode:" + a1.hashCode());
		System.out.println("a1 empty: " +a1.isEmpty());
		Iterator newData = a1.iterator();  
        System.out.println("The ITERTORNewa1 values are: ");   
        while (newData.hasNext()) {   
            System.out.println(newData.next());
            
            
            
           
        }  
	}

}
