package mediator;

public class CommonMember extends Member {
    public CommonMember(String name) {
	super(name);
    }

    public void sendText(String to, String message) {
	System.out.println("[��ͨ��Ա] " + name + " ������Ϣ�� " + to + "��\t" + message);
	chatroom.sendText(name, to, message);
    }

    public void receiveText(String from, String message) {
	System.out.println("[��ͨ��Ա] " + this.name + " �ѽ�����Ϣ��\t\t" + message);
    }
}