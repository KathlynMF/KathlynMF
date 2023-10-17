class Main {
  
  public static void main(String[] args) {

   // 0 1 1 23581324
  //  System.out.println(e);

 int age = 12;
    if(age < 16){
      try {
       throw new Exception("Too young to drive");
      } catch (Exception e) {
      System.out.println("Caught an exception: " + e.getMessage());
    }
      
    }
    System.out.println("Lets issue your driver license");
  }
  
}