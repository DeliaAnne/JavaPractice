package superKeyWord;

public class SingleEventRegistration extends EventRegistration{
	public int participationNo;
	//constructors
	public SingleEventRegistration() {
		
	}
	
	public SingleEventRegistration(String name, String nameOfEvent, int participationNo) {
		super(name,nameOfEvent);
		this.participationNo = participationNo;
		if(nameOfEvent.equals("Actathon") ) {
			super.setRegistrationFee(0);
		}
	}
	//g and s

	public int getParticipationNo() {
		return participationNo;
	}

	public void setParticipationNo(int participationNo) {
		this.participationNo = participationNo;
	}
	//
	
	
	final public void registerEvent() {
		if(this.registrationFee==0) {
			
		}
	}
}
