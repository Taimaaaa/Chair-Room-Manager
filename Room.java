/*Taymaa Nasser  1222640     Lab10 */

package Assignment;

public class Room {

// class properties.
	private int number;
	private double length;
	private double width;
	private Chair[] chairs = new Chair[0];

//no args constructor.
	public Room() {

	}

//args constructor initializing the properties.
	public Room(int number, double length, double width, Chair[] chairs) {
		this.number = number;
		this.length = length;
		this.width = width;
		this.chairs = chairs;
	}

//setters and getters for all properties.
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Chair[] getChairs() {
		return chairs;
	}

	public void setChairs(Chair[] chair) {
		this.chairs = chair;
	}

//method that returns the number of red chairs in one room.
	public int redChair(Chair[] chair) {
		int countRed = 0;
		for (int i = 0; i < chair.length; i++) {
			if (chair[i].getColor().equals("red"))
				countRed++;
		}
		return countRed;
	}

//method that returns the number of yellow chairs in one room.
	public int yellowChair(Chair[] chair) {
		int countYellow = 0;
		for (int i = 0; i < chair.length; i++) {
			if (chair[i].getColor().equals("yellow"))
				countYellow++;
		}
		return countYellow;
	}

//method that returns the number of white chairs in one room.
	public int whiteChair(Chair[] chair) {
		int countWhite = 0;
		for (int i = 0; i < chair.length; i++) {
			if (chair[i].getColor().equals("white"))
				countWhite++;
		}
		return countWhite;

	}

// method that returns the number of all chairs in one room.
	public int allChair(int red, int yellow, int white) {
		int countAll = red + yellow + white;
		return countAll;

	}

//method that prints out all room information and properties.
	public void displayRoomInfo() {
		// printing room number.
		System.out.print(number + "    ");
		// printing room length and width only to 2 decimal places.
		System.out.format("%.2f  ", length);
		System.out.format("%.2f   ", width);
		// printing all chairs in room then red, yellow and white chairs separately.
		System.out.println(+allChair(redChair(chairs), yellowChair(chairs), whiteChair(chairs)) + "   "
				+ redChair(chairs) + "   " + yellowChair(chairs) + "    " + whiteChair(chairs));

	}
}
