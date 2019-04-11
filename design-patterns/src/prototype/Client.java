package prototype;

public class Client
{
	public static void main(String a[])
	{
		Email email,copyEmail;
		
		email=new Email("����QQ����Ľ����ʺ�");
		
		copyEmail=(Email)email.clone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getTitle()==copyEmail.getTitle()?"); 
		System.out.println(email.getTitle()==copyEmail.getTitle());
	}
}