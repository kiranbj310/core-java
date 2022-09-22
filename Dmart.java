class Dmart{
      
	static String perfumes[]= {"foge","wild stone","Ks","set wet"};
    static String vegatables[]= {"Ladys Finger","tomato","Heere kai","Cauliflower"};
	  
	    public static void main(String a[]){
		System.out.println("welcome to Dmart");
		 System.out.println("List of perfumes");
    	System.out.println(perfumes[0]+ "\n"+perfumes[1]+ "\n"+perfumes[2]+ "\n"+perfumes[3]);
		
	// length is the property of array 
    // index = length-1	
 	for (int z = 0; z < perfumes.length;z++){
	System.out.println(perfumes[z] + " ");}
		
		 System.out.println("List of  vegatables");
	   System.out.println(vegatables[0]+ "\n"+vegatables[1]+ "\n"+ vegatables[2]+ "\n"+ vegatables[3]);
	   
	   for (int v = 0; v < vegatables.length;v++){
	   System.out.println(vegatables[v] + " ");}
		
		
		
	   }		
	
	}