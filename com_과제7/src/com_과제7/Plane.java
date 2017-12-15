package com_°úÁ¦7;

public class Plane {
	private String pruducer;
	private String model;
	private int maxpassenger;
	private static int numberofplanes = 0;
	
	public String getpruducer() {
		return pruducer;
	}
	public void setpruducer(String p) {
		pruducer = p;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String m) {
		model = m;
	}
	public int getmaxpassenger() {
		return maxpassenger;
	}
	public void setmaxpassenger(int mp) {
		maxpassenger = mp;
	}
	public Plane(String p,String m,int mp) {
		this.pruducer = p;
		this.model = m;
		this.maxpassenger = mp;
		numberofplanes ++;
	}
	public Plane() {
		numberofplanes++;
	}
	
	public static int getnumberofplanes() {
		return numberofplanes;
	}
	
}
