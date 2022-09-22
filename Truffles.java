class Truffles {

	public static void main(String a[]){
  
		String type = "Restaurent";
		String address = "koramangala";
		String[] managerNames =
		{"sanjay","Venkatesh","chirag","Gagan","Suresh"};
		int noOfManagers = 5;
		String foodMenu[] = {"rocky road paneer","all burger","French toast","america","the hott","pesto fri","tex mex","tandoori","fish fill","prawn","tons o","veg b","pasta salad",
		"chilli chiken","russian salad"};
	
			System.out.println("Welcome to Truffles");
			System.out.println("Destinstion : "+ address);
			System.out.println("Name of List of Managers ");
	
			for(int c = 0 ; c < managerNames.length ; c++){
			System.out.println(managerNames[c]);}
	   
			System.out.println("******foodMenu*******");
	   
			for(int i = 0 ; i < foodMenu.length ; i++){
			System.out.println(foodMenu[i]);}
	 
	
	}
	}