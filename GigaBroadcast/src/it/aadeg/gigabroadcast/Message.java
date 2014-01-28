package it.aadeg.gigabroadcast;

public class Message {
	
	private String msg;
	private int multipler;
	private boolean enabled;

	public Message(String msg, int multipler, boolean enabled) {
		this.msg = msg;
		this.multipler = (multipler > 0) ? multipler : 1;
		this.enabled = enabled;
	}
	
	public Message(String msg, int multipler) {
		this(msg, multipler, true);
	}
	
	public Message(String msg) {
		this(msg, 1, true);
	}

	
	public String getMsg() {
		return msg;
	}

	public int getMultipler() {
		return multipler;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	public void setMultipler(int multipler) {
		this.multipler = (multipler > 0) ? multipler : 1;
	}
	
	public void disable(){
		this.enabled = false;
	}
	
	public void enable(){
		this.enabled = true;
	}
		
}
