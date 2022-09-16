class IdentityTester {

   public static void main(String a[]){
      Identity.name= "kiran";
	  Identity.email= "kirankumarbj310@gmail.com";
	  Identity.mobile= 8150983933L;
	  Identity.age= 22;
	  Identity.address="Basavapatna ,arkalgud taluk hassan district";
	  Identity.gender= 'M';
	  Identity.working= "softwear developer";
	  Identity.shirtSize= 's';
	  Identity.pantSize= 30;
	  Identity.weight= "53kg";
	  Identity.height= "5.7ft";

  System.out.println("Name"+Identity.name );
  System.out.println("NameAndEmail"+Identity.name+ Identity.email);
  System.out.println("NameAndMobile"+Identity.name+Identity.mobile);
  System.out.println("NameAndAge"+Identity.name+Identity.age);
  System.out.println("NameAndAddress"+Identity.name+Identity.address);
  System.out.println("NameAndEmailAndAddressAndAge"+Identity.name+ Identity.email+Identity.address+Identity.age);
  System.out.println("NameAndGender"+Identity.name+Identity.gender);
  System.out.println("NameAndWorking"+Identity.name+Identity.working);
  System.out.println("NameAndShirtSize"+Identity.name+Identity.shirtSize);
  System.out.println("NameAndPantSize"+Identity.name+Identity.pantSize); 
  System.out.println("NameAndWeightAndHight"+Identity.name+Identity.weight+Identity.height);
  
  
   }
   
}

