/**
 This is a placeholder file. Copy Player.java from Assignment 3 and overwrite this file.
 Make the following chsanges to it before you begin work on the assignment:
  - Change its package statement to match the current package (cs520.hw4)
  - Remove the computeScoringAverage() method
  - Remove any import statements that are no longer needed (optional)
*/

package cs520.hw4;

public class Player { 
private int number;
private String name;
private String position;
private String year;

public Player( String name) {
	name=this.name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}


@Override
public String toString() {
	//return "# %d: %s (%s, %s)", number,name, position, year;
	return String.format ("#"+number+": "+name+ "("+position +","+year+ ")");
}
}

