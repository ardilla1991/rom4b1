package by.htp.stone.entity;

public abstract class Stone {
	
	private String name;
	private double weight;
	private double cost;
	private double transparency;
	
	public Stone(String name, double weight, double cost, double transparency) {
		this.name = name;
		this.weight = weight;
		this.cost = cost;
		this.transparency = transparency;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getTransparency() {
		return transparency;
	}
	
	public void setTransparency(double transparency) {
		this.transparency = transparency;
	}

	@Override
	public String toString() {
		return "Stone [name=" + name + ", weight=" + weight + ", cost=" + cost + ", transparency=" + transparency + "]\n";
	}
	
	
	
}
