package BuilderDesignPattern;

public class Main {
  
 public static void main(String[]args) {
	 Phone p = new PhoneBuilder().setName("Iphone").setColor("Blue").setPrice(50000).getPhone() ;
	  System.out.println("Name : "+ p.getName() + "\nColor : " +p.getColor() + "\nPrice : " + p.getPrice())  ;
	  
	   
 }

}
