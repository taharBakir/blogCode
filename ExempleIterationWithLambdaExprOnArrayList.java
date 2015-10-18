import java.util.ArrayList;
import java.util.Iterator;

public class ExempleIterationWithLambdaExprOnArrayList {
  public static void main(String args[]) {
    ArrayList<String> list =  new ArrayList<String>() ;
    list.add("this");
    list.add("is");
    list.add("a");
    list.add("lambda");
    list.add("bitch");
    list.iterator().forEachRemaining(e -> System.out.print(e+" "));
  }
}
