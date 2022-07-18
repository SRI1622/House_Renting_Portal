package assignment5;

import java.util.*;


class PortalApplication {
	Scanner sc = new Scanner(System.in);
	static int Owner_Request_Accept=0;
	static int Owner_Request_Decline=0;
	static int Tenant_Request_Accept =0;
	static int Tenant_Request_Decline =0;
	static int List_Of_Rental =0;
	ArrayList<LandReg> list = new ArrayList<>();
//	HashMap<Integer,LandReg> hash = new HashMap<>();
	ArrayList<Integer> approver = new ArrayList<>();
	ArrayList<Integer> tenant = new ArrayList<>();
	
	//Admin method
	public void Admin_Menu() {
		ListOfHouse();
		System.out.println("List Of House Available....");
		ShowLand();
		System.out.println("Number of house rent : "+List_Of_Rental);
		System.out.println("app : "+approver);
		System.out.println("tent : "+tenant);
	}
	
	//Approver Method
	public void Approver_Menu() {
		
		System.out.println("Request Message From Owner\n1.Accept the Land\n2.Decline the Land");
		int Number=sc.nextInt();
		
		if(Number==1) {
			Owner_Request_Accept++;
			addInteger(Number);
		}
		
		if(Number==2) {
			Owner_Request_Decline++;
			addInteger(Number);
		}
		
		System.out.println("You Want to see Number of accept/decline : \n1.Yes \n2.No");
		int option=sc.nextInt();
		if(option==1){
			System.out.println("Number of request accept by approver : "+Owner_Request_Accept);
			System.out.println("Number of request decline by approver : "+Owner_Request_Decline);
			System.out.println("----------------------------------------------------------------");
		}
		
		
		System.out.println(approver.get(0));
		
	}
	
	//Owner Method
	public void Owner_Menu() {
		
		
			System.out.println("Request message send to Approver........");
			approver.add(1);
			System.out.println(" 0 th posi "+approver.get(0));
			if(approver.get(0)==1) {
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
				addData(p);
				approver.remove(0);
				
			}
			
		
			System.out.println("Request Message From Tenant\n1.Accept the Land for Rent\n2.Decline the Land for Rent");
			int ForTenant=sc.nextInt();
			if(ForTenant == 1) {
				Tenant_Request_Accept++;
				tenant.add(ForTenant);
			}
			else{
				Tenant_Request_Decline++;
				tenant.add(ForTenant);
			}
			
			
			System.out.println("You Want to see Number of accept/decline : \n1.Yes \n2.No");
			int Option=sc.nextInt();
			if(Option==1)
			{
				System.out.println("Number of request accept by owner : "+Tenant_Request_Accept);
				System.out.println("Number of request decline by owner : "+Tenant_Request_Decline);
				System.out.println("-----------------------------------------------------------------");
				
			}
			
	}

	//Tenant Method
	public void Tenant_Menu() {
		ListOfHouse();
		
		ShowLand();
		System.out.println("Request Message Send to Owner for Renting....");
		tenant.add(0);
		if(tenant.get(0) == 1) {
			List_Of_Rental++;
			System.out.println("Accept to renting.");
			tenant.remove(0);
		}
		
		
	}

	//Default House....Method
	public void ListOfHouse() {
		LandReg obj = new LandReg("Kodambakkam","Chennai",750,"2BHK","Rs. 6000 / Month",1);
		addData(obj);
		LandReg obj1 = new LandReg("Goripalayam","Madurai",560,"1BHK","Rs. 5500 / Month",1);
		addData(obj1);
		LandReg obj2 = new LandReg("Anna Nagar","Chennai",1200,"3BHK","Rs. 15000 / Month",2);
		addData(obj2);
	}
	
	public void addData(LandReg m) {
		list.add(m);
	}
	public void addInteger(int a) {
		approver.add(a);
	}
	
	//Display Lands.. Method
	public void ShowLand() {
		for(LandReg l : list) {
			System.out.println(l.toString());
			System.out.println("------------------------------------------------");

		}
	}

}



