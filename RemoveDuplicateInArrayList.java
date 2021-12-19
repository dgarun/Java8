public class RemoveDuplicateInArrayList {
  
  public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<>();
        for(T element:list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }
    
    public static void main(String args[]) {
      
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One","Two","Two","Three","Three","Three"));
        
        System.out.println(list);
        list = removeDuplicates(list);
        System.out.println(list);
      
    }
  
}

