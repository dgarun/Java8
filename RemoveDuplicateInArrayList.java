import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateInArrayList  {
    
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<>();
        for(T element:list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }
    
    public <T> ArrayList<T> removeDuplicatesByHashSet(ArrayList<T> list){
        Set<T> set = new LinkedHashSet<T>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
        
    }
    
    public static void main(String args[]) {
      
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One","Two","Two","Three","Three","Three"));
        
        System.out.println(list);
        list = removeDuplicates(list);
        System.out.println(list);
        
        list = new ArrayList<>(Arrays.asList("One","Two","Two","Three","Three","Three"));
        System.out.println(list);
        RemoveDuplicateInArrayList remDup = new RemoveDuplicateInArrayList();
        list = remDup.removeDuplicatesByHashSet(list);
        System.out.println(list);
        
        list = new ArrayList<>(Arrays.asList("One","Two","Two","Three","Three","Three"));
        System.out.println("List with Duplicates : "+list);
        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicates removed by Stream : "+newList);
      
    }
}

