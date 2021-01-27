abstract class F1Abstract_Top3 {//abstraction

	abstract void setName();//Abstract method
	abstract String getName();//Abstract method
}

class Liverpool extends F1Abstract_Top3{//Abstraction
	private String name;//Encapsulation
	Liverpool(){//Constructor
		this.name = "Mercedes";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class ManU extends F1Abstract_Top3{
	private String name;//Encapsulation
	ManU(){//Constructor
		this.name = "Red Bull";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class Leicester extends F1Abstract_Top3{
	private String name;//Encapsulation
	Leicester(){//Constructor
		this.name = "McLarren";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
