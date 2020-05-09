package prototype;

public class Email implements Cloneable {
    private String title = null;

    public Email(String title) {
	this.title = title;
    }

    @Override
    public Object clone() {
	Email clone = null;
	try {
	    clone = (Email) super.clone();
	} catch (CloneNotSupportedException e) {
	    System.out.println("Clone failure!");
	}
	return clone;
    }

    public void display() {
	System.out.println("Title:");
	System.out.println(this.title);
    }

    public String getTitle() {
	return this.title;
    }

}