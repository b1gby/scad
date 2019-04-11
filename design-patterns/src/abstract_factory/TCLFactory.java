package abstract_factory;

public class TCLFactory implements EFactory
{
	public Television produceTelevision()
	{
		System.out.println("��������TCL����...");
		return new TCLTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		System.out.println("��������TCL�յ�...");
		return new TCLAirConditioner();
	}
}