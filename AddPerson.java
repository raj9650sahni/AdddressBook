package assignment;

class AddPerson {

	public void show(String first_name,String last_name,String Phone,String address,String zip,String state,String city,String email) {
		
		Details d = new Details();
		d.details(first_name, last_name, Phone, address, zip, state, city, email);
		
	}

}

class Details {



	public void details(String first_name,String last_name,String Phone,String address,String zip,String state,String city,String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.Phone = Phone;
        this.address= address;
        this.zip = zip;
        this.state = state;
        this.city = city;
        this.email =  email;
        this.email = email;
        
        
        System.out.println(first_name + " " + last_name);
		System.out.println("phone no is :" + Phone);
		System.out.println(" address is : "+  address);
		System.out.println("postal code is :" + zip);
		System.out.println(" state is :" + state);
		System.out.println("city is :" + city);
		System.out.println("email id is :" + email);
	
	

    }
	
   public String first_name;
   public String last_name;
   public String Phone;
   public String address;
   public String zip;
   public String state;
   public String city;
   public String email;
 
 
}
	