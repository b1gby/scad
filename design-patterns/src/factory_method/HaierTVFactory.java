package factory_method;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
	System.out.println("�������ӻ����������������ӻ���");
	return new HaierTV();
    }
}