public class Person {
   private String name;
   private int age;
   private String email;

    
   public void setName(String n){
    name = n;
   }

   public String getName(){
    return name;
   }
    
    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }
  
    public void setEmail(String e){
        email = e;
    }

    public String getEmail(){
        return email;
    }

    public static void displayInfo(){
    System.out.println("The Animal is "+peep1.getAnimal());
    System.out.println("The Age is "+peep1.getAge());
    System.out.println("The Name is "+peep1.getName());
    System.out.println("The Animal is "+peep2.getAnimal());
    System.out.println("The Age is "+peep2.getAge());
    System.out.println("The Name is "+peep2.getName());

    }

}
