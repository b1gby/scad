package chain_of_responsibility;

public class Client {
    public static void main(String args[]) {

	Leader objDirector = Leader.connect();

	LeaveRequest lr1 = new LeaveRequest("��Сǫ", 2);
	objDirector.handleRequest(lr1);

	LeaveRequest lr2 = new LeaveRequest("ŷ������", 5);
	objDirector.handleRequest(lr2);

	LeaveRequest lr3 = new LeaveRequest("�ְ���", 15);
	objDirector.handleRequest(lr3);

	LeaveRequest lr4 = new LeaveRequest("������", 25);
	objDirector.handleRequest(lr4);
    }
}