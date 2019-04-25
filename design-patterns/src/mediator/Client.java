package mediator;

public class Client {
    public static void main(String args[]) {
	AbstractChatroom titanicChatRoom = new ChatRoom();
	Member member1, member2, member3, member4, member5;
	member1 = new DiamondMember("�ܿ�");
	member2 = new DiamondMember("��˿");
	member3 = new CommonMember("����");
	member4 = new CommonMember("���»�����");
	member5 = new CommonMember("�������ʿ");

	titanicChatRoom.register(member1);
	titanicChatRoom.register(member2);
	titanicChatRoom.register(member3);
	titanicChatRoom.register(member4);
	titanicChatRoom.register(member5);

	member1.sendText("��˿", "��˿����ã�");
	member2.sendText("�ܿ�", "�ܿˣ���ã�");
	member1.sendText("��˿", "������ǲ�����һ�������ʲô���壿����˽���ɡ�");
	member2.sendText("�ܿ�", "�ҵĴ��պ�����707�ţ���������һ�������");
	member3.sendText("��˿", "�������ˣ������Ҹ�����ĺ���֮�ģ�����ŷǳ�Ư����");
	member4.sendText("�������ʿ", "����������ѣ��һ������һ���û��");
	member5.sendText("���»�����", "���Ѿ�׼�����ˣ������ûҲҪ�����ʿ������");
    }
}