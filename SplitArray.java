import java.util.*;

public class SplitArray  {
    
    public static void pprint(int[] arr){
        for(int a : arr){
            System.out.println(a);
        }
    }
    
    public static void main(String args[]) {
      
      try{
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        System.out.println("pos:"+pos);
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int length = arr.length;
        
        
        if(pos > 0 && pos < length){
            
            int[] b = new int[pos];
            int[] c = new int[length - pos];
            
            for(int i=0;i<length;i++){
             
             if(i < pos)
                b[i] = arr[i];
            else
                c[i-pos] = arr[i];
                
            }
            
            pprint(b);
            System.out.println("-----------------------------");
            pprint(c);
        }
        
        
        
      }catch(InputMismatchException e){
          System.out.println("InputMismatchException ==>"+e);
          e.printStackTrace();
      }
      //finally{
        //  System.out.println("finally block");
      //}
      
      
    
    }
}
