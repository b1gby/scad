package chain_of_responsibility;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
	super(name);
    }

    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 30) {
	    System.out.println(
		    "首席 " + name + " 审批员工 " + request.getLeaveName() + " 的请假条，请假天数为 " + request.getLeaveDays() + " 天。");
	} else {
	    System.out.println("莫非" + request.getLeaveName() + "想辞职，居然请假" + request.getLeaveDays() + "天。");
	}
    }
}