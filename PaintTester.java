class PaintTester {

   public static void main(String a[]){
   
   // initialization through setter method
       Paint.setPaintId(1122);
       Paint.setColor("Blue");
       Paint.setBrandName("Nerolac");
	  
	  //get the data through getter method 	 
	 System.out.println(Paint.getPaintId());
	 System.out.println(Paint.getColor());
	 System.out.println(Paint.getBrandName());
	  
	  }
	}