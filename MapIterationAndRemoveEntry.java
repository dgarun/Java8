import java.util.*;

public class MapIterationAndRemoveEntry  {
    
    public static void main(String args[]) {
      
      HashMap<Integer,String> map = new HashMap<>();
      map.put(1,"One");
      map.put(2,"Two");
      map.put(3,"Three");
      map.put(4,"Four");
      
      System.out.println(map);
      
      Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
      
      while(iterator.hasNext()){
          
          Map.Entry<Integer,String> entry = iterator.next();
          
          if(entry.getValue() == "One")
            iterator.remove();
          
          System.out.println(entry.getKey() + " | " + entry.getValue());
          
      }
      
      System.out.println(map);
      
      //Java 8 - Lamda Expression
      map.entrySet().removeIf(entry -> entry.getValue().equals("Two"));
      
      System.out.println(map);
    
    }
}
