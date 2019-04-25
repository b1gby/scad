package mediator;

public class DiamondMember extends Member {
    public DiamondMember(String name) {
	super(name);
    }

    public void sendText(String to, String message) {
	System.out.println("[��ʯ��Ա] " + name + " ������Ϣ�� " + to + "��\t" + message);
	chatroom.sendText(name, to, message);
    }

    public void receiveText(String from, String message) {
	System.out.println("[��ʯ��Ա] " + this.name + " �ѽ�����Ϣ��\t\t" + message);
    }
}