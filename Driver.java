/*Taymaa Nasser  1222640     Lab10 */

package Assignment;

import java.util.Random;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
//initializing a constant seed value for use in random generations.
		final long SEEDVALUE = 589652443;

//random object created for use in all random generations.
		Random random = new Random(SEEDVALUE);

//initializing a constant date value that all chairs in all rooms have. (date of program run)
		final Date dateManufactured = new Date();

//initializing a constant weight value that all chairs in all rooms have.
		final double weight = 10.0f;

//creating an array of room objects of size 3.
		Room[] rooms = new Room[3];

//initializing a counter for room numbers.
		int numberCounter = 201;

		for (int i = 0; i < rooms.length; i++) {

//generating a random double value for each room length. (30.0 --> 50.0)
			double length = random.nextDouble(20.01) + 30.0;

//generating a random double value for each room width. (20.0 --> 30.0)
			double width = random.nextDouble(10.01) + 20.0;

//generating a random integer value for number of chairs in each room. (20 --> 50)
			int chairsNumber = random.nextInt(31) + 20;

//creating an array of chair objects of randomly generated size.
			Chair[] chairs = new Chair[chairsNumber];
			for (int j = 0; j < chairs.length; j++) {

//generating a random integer value to assign each chair in each room a random color. (0 --> 2)
				int colourGeneration = random.nextInt(3);

//initializing a string value for chair colors.			
				String Colours = " ";
				if (colourGeneration == 0) {
					Colours = "red";
				} else if (colourGeneration == 1) {
					Colours = "yellow";
				} else {
					Colours = "white";
				}

//generating a random double value for distance of every chair from the front wall of its room. (does not exceed room length)
				double Distance = random.nextDouble(length + 0.1);

//filling all chairs in all rooms with their constant and/or random properties.
				chairs[j] = new Chair(weight, Distance, Colours, dateManufactured);

			}

//filling all rooms with their random properties.
			rooms[i] = new Room(numberCounter, length, width, chairs);

//incrementing room number counter once.			
			numberCounter++;
		}

//calling method that displays room properties for the 3 rooms.	
		displayRooms(rooms);

	}

//method that displays room properties for the 3 rooms.
	public static void displayRooms(Room[] rooms) {
		System.out.println("Number Length Width Total Red Yellow White");
		for (int i = 0; i < rooms.length; i++) {
			rooms[i].displayRoomInfo();
		}

	}

}
