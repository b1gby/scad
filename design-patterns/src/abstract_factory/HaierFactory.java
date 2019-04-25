package abstract_factory;

public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
	System.out.println("����������������...");
	return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
	System.out.println("�������������յ�...");
	return new HairAirConditioner();
    }
}