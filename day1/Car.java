package week1.day1;



public class Car {
	
	

	public void applyBreak()  {
		
		System.out.println("Break is applied");
	}
	public void applyGear() {
		
		System.out.println("Gear is applied");
	}
	public void switchOnAc()  {
		
		System.out.println("Switch On Ac");
	}
	public void applyAcclerate() {
		
		System.out.println("Acclerate is applied");
	}
	
	
	public static void main(String[] args) {
			//ClassName objectName=new ClassName();
			
			Car obj=new Car();
			//objectName.MethodName(related)
			
			obj.applyBreak();
			obj.applyGear();
			obj.switchOnAc();
			obj.applyAcclerate();
			
			
			
		}
		
		
		 
		 
				
}