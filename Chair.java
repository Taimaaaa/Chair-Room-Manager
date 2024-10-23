/*Taymaa Nasser  1222640     Lab10 */

package Assignment;

import java.util.Date;

public class Chair {

// class properties.
	private double weight;
	private double distanceFromFrontWall;
	private String color;
	private Date dateManufactured;

// no args constructor calling the args constructor.
	public Chair() {
		this(0, 0, null, null);
	}

//args constructor initializing the properties.
	public Chair(double weight, double distanceFromFrontWall, String color, Date dateManufactured) {
		this.weight = weight;
		this.distanceFromFrontWall = distanceFromFrontWall;
		this.color = color;
		this.dateManufactured = dateManufactured;
	}

//setters and getters for all properties.
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getDistanceFromFrontWall() {
		return distanceFromFrontWall;
	}

	public void setDistanceFromFrontWall(double distanceFromFrontWall) {
		this.distanceFromFrontWall = distanceFromFrontWall;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateManufactured() {
		return dateManufactured;
	}

	public void setDateManufactured(Date dateManufactured) {
		this.dateManufactured = dateManufactured;
	}

//method to move chair one step towards the front wall of the room.
	public void moveChairForward(double distance) {
		distanceFromFrontWall -= distance;
	}

//method to move chair one step away from the front wall of the room.
	public void moveChairBackward(double distance) {
		distanceFromFrontWall += distance;
	}
	
}
