class SoapTester{
   
   public static void main(String a[]){
   //purpose of object is to create a multiple copy of a class
   
	// object is a instence of class
	// create a multiple copy of Soap
	
	// object 
	//className ref = new className() ;
	Soap soap = new Soap() ;
	
	soap.shape = "Oval";
	soap.color = "cream";
	soap.name = "Mysore Sandal Soap";
	soap.toGetFresh() ;
	
	System.out.println(soap.shape +"  "+soap.color +"  "+soap.name);
	
	Soap soap1 = new Soap();
	soap1.shape = "Rectangle";
	soap1.color = "White";
	soap1.name = "Fiama";
	System.out.println(soap1.shape +"  "+soap1.color);
   }
}