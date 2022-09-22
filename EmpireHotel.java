class EmpireHotel {

	public static void main(String a[]){
  
		String type = "5 star hotel";
		String address = "Basavangudi";
		String[] managerNames =
		{"Ramesh","Sathish","shivraj","Tejas","Mahesh"};
		int noOfManagers = 5;
		String foodMenu[] = {"idli vade","dose","rise bath","rotti","chapathi","ice cream","coffe","tea","parotta","full mils","neerdose","biriyani","kabab",
		"chilli chiken","veg biriyani"};
	
			System.out.println("Welcome to EmpireHotel");
			System.out.println("Destinstion : "+ address);
			System.out.println("Name of List of Managers ");
	
				for(int c = 0 ; c < managerNames.length ; c++){
				System.out.println(managerNames[c]);}
	   
				System.out.println("******foodMenu*******");
	   
				for(int i = 0 ; i < foodMenu.length ; i++){
				System.out.println(foodMenu[i]);}
	   
	
	}
	}