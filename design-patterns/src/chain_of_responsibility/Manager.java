package chain_of_responsibility;

public class Manager extends Leader {
    public Manager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 10) {
	    System.out.println(
		    "�ܼ� " + name + " ����Ա�� " + request.getLeaveName() + " ����������������Ϊ " + request.getLeaveDays() + " �졣");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}