package superKeyWord;

public class EventRegistration {
	String name;
	String nameOfEvent;
	double registrationFee;
	//Constructors
	public EventRegistration(){
	
	}
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
		setRegFee();		
	}
	//setters &getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	//Other methods
	public void registerEvent() {
		if(this.registrationFee == 0) {
			System.out.println("Please choose a valid event.");
		}else {
			System.out.println("Your registration fee is "+this.registrationFee);
		}
	}
	
	public void setRegFee() {
		if(nameOfEvent.equals("ShakeALeg")) {
			this.registrationFee = 100;
		}else if(nameOfEvent.equals("Sing&Win")) {
			this.registrationFee = 150;
		}else if(nameOfEvent.equals("Actathon")) {
			this.registrationFee = 70;
		}else if(nameOfEvent.equals("PlayAway")) {
			this.registrationFee = 130;
		}else {
			this.registrationFee = 0;
		}
	}
	
	/**/
	public static void main(String[] args) {
		EventRegistration r1 = new EventRegistration("_1","ShakeALeg");
		EventRegistration r2 = new EventRegistration("_2","ShakeALe");
		EventRegistration r3 = new EventRegistration("_3","Sing&Win");
		EventRegistration r4 = new EventRegistration("_4","Actathon");
		EventRegistration r5 = new EventRegistration("_5","PlayAway");
		r1.registerEvent();
		r2.registerEvent();
		r3.registerEvent();
		r4.registerEvent();
		r5.registerEvent();
	}
	
}
