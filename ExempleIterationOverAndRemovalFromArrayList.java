import java.util.ArrayList;
import java.util.Iterator;

public class ExempleIterationOverAndRemovalFromArrayList {
  public static void main(String args[]) {
    ArrayList<String> list =  new ArrayList<String>() ;
    list.add("this");
    list.add("is");
    list.add("a");
    list.add("simple");
    list.add("test");
    Iterator<String> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      if("simple".equals(listIterator.next()))
        listIterator.remove();
    }
    Iterator<String> secondListIterator = list.iterator();
    while (secondListIterator.hasNext()) {
      System.out.print(secondListIterator.next()+" ");
    }
  }
}
