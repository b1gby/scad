package adapter;

public class BirdAdapter extends Bird implements Robot {
    @Override
    public void cry() {
	System.out.print("������ģ�£�");
	super.tweedle();
    }

    @Override
    public void move() {
	System.out.print("������ģ�£�");
	super.fly();
    }
}