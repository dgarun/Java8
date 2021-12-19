import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListOper { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Benz");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    ArrayList<String> luxCars = new ArrayList<String>();
    luxCars.add("BMW");
    luxCars.add("Benz");
    luxCars.add("Ferrari");
    luxCars.add("Lamborghini");
    
    System.out.println(luxCars);
    
    List<String> commonCars = new ArrayList<>();
    
    for(String car:cars){
    	for(String luxCar:luxCars){
        	if(car == luxCar){
            	commonCars.add(car);
            }
        }
    }
    
    
    //luxCars.addAll(cars);
    
    System.out.println(commonCars);
    
    //System.out.println(cars.retainAll(luxCars));
    
    //System.out.println(cars);
    
    //cars.stream().filter(luxCars::contains).collect(Collectors.toList());
    
    System.out.println(luxCars.stream().filter(cars::contains).collect(Collectors.toList()));
    
    System.out.println(cars);
  } 
}
