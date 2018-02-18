package coyw.rsvp.roles;

import java.util.Date;

public class Member {

	private String id;
	private String name;
	private Date dateJoined;
	private int level;
	private String email;
	private String phoneNumber;
	private int visited;
	private int noShows;
	private boolean isHost;
	private boolean isAdmin;
	
	protected Member (String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}

	public int getNoShows() {
		return noShows;
	}

	public void setNoShows(int noShows) {
		this.noShows = noShows;
	}

	public boolean isHost() {
		return isHost;
	}

	public void setHost(boolean isHost) {
		this.isHost = isHost;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public void rsvp (String eventId) {
		
	}
	
	public void cancelRsvp(String eventId) {
		
	}
	
}
