package abstract_factory;

public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
	System.out.println("��������TCL����...");
	return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
	System.out.println("��������TCL�յ�...");
	return new TCLAirConditioner();
    }
}