package chain_of_responsibility;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 30) {
	    System.out.println(
		    "��ϯ " + name + " Ϊ " + request.getLeaveName() + " ��ͷ���������� " + request.getLeaveDays() + " ��Ԫ��");
	} else {
	    System.out.println("Ī��" + request.getLeaveName() + "���ְ����Ȼ���" + request.getLeaveDays() + "�졣");
	}
    }
}