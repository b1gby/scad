package chain_of_responsibility;

public class Director extends Leader {
    public Director(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 3) {
	    System.out.println(
		    "����ʦ " + name + " Ϊ " + request.getLeaveName() + " ��ϴ���������� " + request.getLeaveDays() + " ��Ԫ��");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}