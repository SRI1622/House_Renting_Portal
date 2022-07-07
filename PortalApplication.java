package assignment5;

import java.util.*;

class PortalApplication {
	Scanner sc = new Scanner(System.in);
	static int Owner_Request_Accept=0;
	static int Owner_Request_Decline=0;
	static int Tenant_Request_Accept =0;
	static int Tenant_Request_Decline =0;
	static int List_Of_Rental =0;
	ArrayList<LandReg> li = new ArrayList<>();
//	HashMap<Integer,LandReg> hash = new HashMap<>();
	public void Admin_Menu() {
		ListOfHouse();
		System.out.println("List Of House Available....");
		ShowLand();
		System.out.println("NUmber of house rent : "+List_Of_Rental);
	}
	
	public int Approver_Menu(int q) {
		ListOfHouse();
		System.out.println("Request Message From Owner\n1.Accept the Land\n2.Decline the Land");
		int a=sc.nextInt();
		if(a==1) Owner_Request_Accept++;
		
		if(a==2) Owner_Request_Decline++;
		
		if(q==1) {
			System.out.println("You Want to see Number of accept/decline by approver : \n1.Yes \n2.No");
			int r=sc.nextInt();
			if(r==1){
				System.out.println("Number of request accept by approver : "+Owner_Request_Accept);
				System.out.println("Number of request decline by approver : "+Owner_Request_Decline);
			}
		}
		else {
		if(a==1) return 1;
		else return 2;
		}
		return 0;
		
	}
	

	public int Owner_Menu(int w) {
		int s=1;
		int r=0;
		if(w==1) {
			System.out.println("Request message send to Approver........");
			int d=Approver_Menu(2);
			if(d==1) {
				ListOfHouse();
				System.out.println("Enter The Location : ");
				String location = sc.next();
				System.out.println("Enter The City : ");
				String city = sc.next();
				System.out.println("Enter The Square Feet : ");
				int squareFeet = sc.nextInt();
				System.out.println("Enter The Type : ");
				String type = sc.next();
				System.out.println("Enter The Rent : ");
				String rent = sc.next();
				System.out.println("Enter The OwnerId : ");
				int ownerId = sc.nextInt();
		
				LandReg p = new LandReg(location,city,squareFeet,type,rent,ownerId);
				li.add(p);
				
			}
			
			else {
				System.out.println("Request has been decline by approver.");
			}
		
			System.out.println("Request Message From Tenant\n1.Accept the Land for Rent\n2.Decline the Land for Rent");
			s=sc.nextInt();
			if(s==1) Tenant_Request_Accept++;
			else Tenant_Request_Decline++;
			
			if(w==1) 
			{
				System.out.println("You Want to see Number of accept/decline by Owner : \n1.Yes \n2.No");
				r=sc.nextInt();
				if(r==1)
				{
					System.out.println("Number of request accept by owner : "+Tenant_Request_Accept);
					System.out.println("Number of request decline by owner : "+Tenant_Request_Decline);
					ShowLand();
				}
				else {
					ShowLand();
				}
			}
		}
		else 
		{
			
				if(s==1 || r==1) return 1;
				else return 2;
			
		}
		return 0;
		
	}

	
	public void Tenant_Menu() {
		ListOfHouse();
		
		ShowLand();
		System.out.println("Request Message Send to Owner for Renting....");
		int r=Owner_Menu(2);
		if(r==1) {
			List_Of_Rental++;
			System.out.println("Accept to renting.");
		}
		else System.out.println("Decline owner to renting.");
		
	}



	public void ShowLand() {
		for(LandReg l : li) {
			System.out.println(l);
			System.out.println("------------------------------------------------");

		}
	}
	public void ListOfHouse() {
		LandReg obj = new LandReg("Kodambakkam","Chennai",750,"2BHK","Rs. 6000 / Month",1);
		li.add(obj);
	}

}



