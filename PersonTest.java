public class PersonTest {

    public static void main(String [] args){
        Person peep1 = new Person();
        Person peep2 = new Person();

    peep1.setAge(24);
    peep1.setEmail("emily123@gmail.com");
    peep1.setName("Emily");
    
    peep2.setAge(19);
    peep2.setEmail("Sofiathefirst@gmail.com");
    peep2.setName("Sofia"); 

    System.out.println("Name retrieved: "+peep1.getName());
    peep1.displayInfo();
    peep2.displayInfo();
    
    




    }
    
}
