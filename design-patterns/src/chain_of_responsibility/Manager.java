package chain_of_responsibility;

public class Manager extends Leader {
    public Manager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 10) {
	    System.out.println(
		    "�ܼ� " + name + " Ϊ " + request.getLeaveName() + " ��������ƣ����� " + request.getLeaveDays() + " ��Ԫ��");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}