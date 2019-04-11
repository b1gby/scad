package abstract_factory;

public class HaierFactory implements EFactory
{
	public Television produceTelevision()
	{
		System.out.println("����������������...");
		return new HaierTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		System.out.println("�������������յ�...");
		return new HairAirConditioner();
	}
}