package kodlamaioNew.entities;

public class Category {
	int id;
	String typeName;

	public Category() {
	}

	public Category(int id, String typeName) {
		this.id = id;
		this.typeName = typeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
