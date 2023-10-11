package abstraction;

public class OutEdge extends Edge{
	public Place place;
	
	
	public OutEdge(int value, String id, Place place) {
		super(value, id);
		// TODO Auto-generated constructor stub
		this.place = place;
	}
	
	public String toString() {
		return super.toString() +" Place : " + this.place.toString();
	}
	
}
