package chain_of_responsibility;

public class ViceGeneralManager extends Leader {
    public ViceGeneralManager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 20) {
	    System.out.println(
		    "���ܼ� " + name + " Ϊ " + request.getLeaveName() + " ������ƣ����� " + request.getLeaveDays() + " ��Ԫ��");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}