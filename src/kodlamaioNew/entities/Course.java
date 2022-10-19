package kodlamaioNew.entities;

public class Course extends Instructor {
	private int id;
	private String Name ;
	private double unitPrice;

	public Course() {
	}

	public Course(int id, String name, double unitPrice) {
		this.id = id;
		Name = name;
		this.unitPrice = unitPrice;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
