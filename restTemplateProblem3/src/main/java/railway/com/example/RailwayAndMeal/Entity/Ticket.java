package railway.com.example.RailwayAndMeal.Entity;


import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Ticket {
	
	@Min(1)
	private long pnr;
	@Size(min=3,max=20)
	private String name;
	private long age;
	private String birth;
	private Meal meal;
	
	public Ticket() {
		
	}
	
	public Ticket(long pnr, String name, long age, String birth) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	
	
	public Ticket(@Min(1) long pnr, @Size(min = 3, max = 20) String name, long age, String birth, Meal meal) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.meal = meal;
	}



	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

}
