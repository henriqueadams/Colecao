package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
	private String name;
	private Date year;
	
	public Item(String name, Date year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String toString() {
		return    getName()
				+ ", "
				+ sdf.format(getYear());
	}
}
