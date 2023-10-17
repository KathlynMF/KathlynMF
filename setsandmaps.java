import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Main {

  
  public static void main(String[] args) {
   // 0 1 1 23581324
  //  System.out.println(e);

HashMap <String, String> usernamesEmails = new HashMap<>();

 usernamesEmails.put("1","kat@testpro.io");
usernamesEmails.put("2","khaled@testpro.io");
usernamesEmails.put("3","chris@testpro.io");
usernamesEmails.put("4","nalani@testpro.io");
usernamesEmails.put("5","mark@testpro.io");

//usernamesEmails.remove("kathlynmiller");
   
   //System.out.println(usernamesEmails.get(5));


    Set<Integer> nums = new HashSet<>();
    for(int i = 1; i <= 10; i++){
      nums.add(i);
      
    }
       System.out.println(nums);

    Set<String> duplicatedSet = new HashSet<>();
       duplicatedSet.add("value2");
       duplicatedSet.add("value28");
       duplicatedSet.add("value2");
       duplicatedSet.add("valaue28");
       duplicatedSet.add("value1");

        System.out.println(duplicatedSet);

    
  }
    
} 
//}