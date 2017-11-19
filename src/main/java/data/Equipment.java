package data;

import java.time.LocalDate;

public class Equipment {
	
	private int id;
	private String name;
	private String type;
	private String description;
	private double replacement_cost;
	private int ownerId;
	private int userId;
	private LocalDate dateBorrowed;
	private LocalDate dueDate;
	
	public Equipment() {}

	public Equipment(int id, String name, String type, String description, double replacement_cost, int ownerId,
			int userId, LocalDate dateBorrowed, LocalDate dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.replacement_cost = replacement_cost;
		this.ownerId = ownerId;
		this.userId = userId;
		this.dateBorrowed = dateBorrowed;
		this.dueDate = dueDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(double replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getDateBorrowed() {
		return dateBorrowed;
	}

	public void setDateBorrowed(LocalDate dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
