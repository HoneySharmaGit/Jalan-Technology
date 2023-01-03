package org.jalan.program;

import java.util.*;

abstract class Car{
	public abstract void BasicServicing();
	public abstract void EngineFixing();
	public abstract void ClutchFixing();
	public abstract void BrakeFixing();
	public abstract void GearFixing();
}	
	
class Hatchback extends Car{

	@Override
	public void BasicServicing() {
		int bs=2000;
		System.out.println("Charges for Basic Servicing- Rs."+bs);
	}

	@Override
	public void EngineFixing() {
		int ef=5000;
		System.out.println("Charges for Engine Fixing- Rs."+ef);
}

	@Override
	public void ClutchFixing() {
		int cf=2000;
		System.out.println("Charges for Clutch Fixing- Rs."+cf);
	}

	@Override
	public void BrakeFixing() {
		int bf=1000;
		System.out.println("Charges for Brake Fixing- Rs."+bf);
	}

	@Override
	public void GearFixing() {
		int gf=3000;
		System.out.println("Charges for Gear Fixing- Rs."+gf);
	}
	
}

class Sedan extends Car{

	@Override
	public void BasicServicing() {
		int bs=4000;
		System.out.println("Charges for Basic Servicing- Rs."+bs);
	}

	@Override
	public void EngineFixing() {
		int ef=8000;
		System.out.println("Charges for Engine Fixing- Rs."+ef);
}

	@Override
	public void ClutchFixing() {
		int cf=4000;
		System.out.println("Charges for Clutch Fixing- Rs."+cf);
	}

	@Override
	public void BrakeFixing() {
		int bf=1500;
		System.out.println("Charges for Brake Fixing- Rs."+bf);
	}

	@Override
	public void GearFixing() {
		int gf=6000;
		System.out.println("Charges for Gear Fixing- Rs."+gf);
	}
	
}

class SUV extends Car{

	@Override
	public void BasicServicing() {
		int bs=5000;
		System.out.println("Charges for Gear Fixing- Rs."+bs);
	}

	@Override
	public void EngineFixing() {
		int ef=10000;
		System.out.println("Charges for Gear Fixing- Rs."+ef);
}

	@Override
	public void ClutchFixing() {
		int cf=6000;
		System.out.println("Charges for Clutch Fixing- Rs."+cf);
	}

	@Override
	public void BrakeFixing() {
		int bf=2500;
		System.out.println("Charges for Brake Fixing- Rs."+bf);
	}

	@Override
	public void GearFixing() {
		int gf=8000;
		System.out.println("Charges for Gear Fixing- Rs."+gf);
	}
	
}

class Factory {
	public static void CarFactory(String type, String arr[]) {
		if(type.equalsIgnoreCase("Hatchback")) {
			Hatchback hb=new Hatchback();
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("BS01")) {
					hb.BasicServicing();
					sum=sum+2000;
				}
				else if(arr[i].equals("EF01")) {
					hb.EngineFixing();
					sum=sum+5000;
				}
				else if(arr[i].equals("CF01")) {
					hb.ClutchFixing();
					sum=sum+2000;
				}
				else if(arr[i].equals("BF01")) {
					hb.BrakeFixing();
					sum=sum+1000;
				}
				else if(arr[i].equals("GF01")){
					hb.GearFixing();
					sum=sum+3000;
				}
				else {
				    System.out.println("There is no Service associated with the given code.");
				}
			}
			if(sum>10000) {
				System.out.println("[FREE] Complimentary cleaning.");
			}
			System.out.println("Total Bill- Rs."+sum);
		}
		else if(type.equalsIgnoreCase("Sedan")) {
			Sedan sn=new Sedan();
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("BS01")) {
					sn.BasicServicing();
					sum=sum+4000;
				}
				else if(arr[i].equals("EF01")) {
					sn.EngineFixing();
					sum=sum+8000;
				}
				else if(arr[i].equals("CF01")) {
					sn.ClutchFixing();
					sum=sum+4000;
				}
				else if(arr[i].equals("BF01")) {
					sn.BrakeFixing();
					sum=sum+1500;
				}
				else if(arr[i].equals("GF01")) {
					sn.GearFixing();
					sum=sum+6000;
				}
				else{
				    System.out.println("There is no Service associated with the given code.");
				}
			}
			if(sum>10000) {
				System.out.println("[FREE] Complimentary cleaning.");
			}
			System.out.println("Total Bill- Rs."+sum);
		}
		else if(type.equalsIgnoreCase("SUV")) {
			SUV sv=new SUV();
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("BS01")) {
					sv.BasicServicing();
					sum=sum+5000;
				}
				else if(arr[i].equals("EF01")) {
					sv.EngineFixing();
					sum=sum+10000;
				}
				else if(arr[i].equals("CF01")) {
					sv.ClutchFixing();
					sum=sum+6000;
				}
				else if(arr[i].equals("BF01")) {
					sv.BrakeFixing();
					sum=sum+2500;
				}
				else if(arr[i].equals("GF01")) {
					sv.GearFixing();
					sum=sum+8000;
				}
				else{
				    System.out.println("There is no Service associated with the given code.");
				}
			}
			if(sum>10000) {
				System.out.println("[FREE] Complimentary cleaning.");
			}
			System.out.println("Total Bill- Rs."+sum);
		}
		else {
			System.out.println("We don't do that here!");
		}
	}
	
}

class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type of Car- ");
		String type=sc.next();
		System.out.println("number of services you've taken- ");
		int n=sc.nextInt();
		System.out.println("enter the services- ");
		sc.close();
		String arr[]=new String[n];
		for(int i=0; i<n; i++) {
			String service=sc.next().toUpperCase();
			arr[i]=service;
		}
		Factory.CarFactory(type, arr);
	}

}
