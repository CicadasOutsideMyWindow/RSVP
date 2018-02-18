package coyw.rsvp.roles;

public class Owner extends EventHost{

	public Owner(String id) {
		super(id);
	}

	public void createVenue() {
		
	}
	
	public void editVenue(String id) {
		
	}
	
	public void createEvent() {
		
	}
	
	public void editEvent(String eventId) {
		
	}
	
	public void setEventHost(String id) {
		Member member = new Member(id);
		if(!member.isHost()) {
			member.setHost(true);
		}
	}
	
	public void revokeEventHost(String id) {
		EventHost eh = new EventHost(id);
		if(eh.isHost()) {
			eh.setHost(false);
		}
	}
	
	public void setOwner(String id) {
		Member member = new Member(id);
		if(!member.isAdmin()) {
			member.setAdmin(true);
		}
	}
	
	public void revokeOwner(String id) {
		Owner owner = new Owner(id);
		if(owner.isAdmin()) {
			owner.setAdmin(false);
		}
	}
	
}
