public class InvTweaksItem {

	private String name;
	private int id;
	private int damage;
	private int order;
	
	/**
	 * @param name The item name
	 * @param id The item ID
	 * @param damage The item variant or -1
	 * @param order The item order while sorting
	 */
	public InvTweaksItem(String name, int id, int damage, int order) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.order = order;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public int getDamage() {
		return damage;
	}

	public int getOrder() {
		return order;
	}
	
	/**
	 * Warning: the item equality is not reflective.
	 * They are equal if "o" matches the item constraints (the opposite can be false). 
	 */
	public boolean equals(Object o) {
		if (o == null || !(o instanceof InvTweaksItem))
			return false;
		InvTweaksItem item = (InvTweaksItem) o;
		return id == item.getId() &&
			(damage == -1 || damage == item.getDamage());
	}
	
	public String toString() {
		return name;
	}

}
