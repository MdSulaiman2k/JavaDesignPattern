package BuilderDesignPattern;

public class PhoneBuilder {
	String name ;
	String color ;
	int price ;
	
	
	
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this ;
	}



	public PhoneBuilder setColor(String color) {
		this.color = color;
		return this ;
	}



	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this ;
	}



	public Phone getPhone() {
		return new Phone(name , color , price);
		
	}

}
