package factory_method;

public class FakeTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("�������ӻ����������������ӻ���");
    	return new FakeTV();
    }
}