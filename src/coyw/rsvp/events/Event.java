package coyw.rsvp.events;

import java.util.Date;
import java.util.List;

import coyw.rsvp.roles.EventHost;
import coyw.rsvp.venues.Venue;

public class Event {
	
	private String id;
	private Date startTime;
	private String duration;
	private List<String> participants;
	private Venue venue;
	private List<EventHost> eventHosts;
	private String cost;
	
	
	public Event (String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public List<EventHost> getEventHosts() {
		return eventHosts;
	}

	public void setEventHosts(List<EventHost> eventHosts) {
		this.eventHosts = eventHosts;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
