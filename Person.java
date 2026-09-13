public class Person {
   private String name;
   private int age;
   private String email;
    
public Person(){
    
}
    
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

    public void displayInfo(){
    System.out.println("Person Information");
    System.out.println("--------------------");
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Email: "+email);
    System.out.println();

    }

}
