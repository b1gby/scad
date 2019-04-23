package chain_of_responsibility;

public abstract class Leader {
    protected String name;
    protected Leader successor;
    protected static Leader objDirector = new Director("Tony��ʦ");
    protected static Leader objManager = new Manager("Mary��ʦ");
    protected static Leader objGeneralManager = new GeneralManager("William��ʦ");
    protected static Leader objViceGeneralManager = new ViceGeneralManager("Grace��ʦ");

    public Leader(String name) {
	this.name = name;

    }

    public void setSuccessor(Leader successor) {
	this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest request);

    public static Leader connect() {
	objDirector.setSuccessor(objManager);
	objManager.setSuccessor(objViceGeneralManager);
	objViceGeneralManager.setSuccessor(objGeneralManager);
	return objDirector;
    }
}