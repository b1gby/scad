package observer;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList<MyObserver> observers = new ArrayList<MyObserver>();

    // ע�᷽��
    public void attach(MyObserver observer) {
	observers.add(observer);
    }

    // ע������
    public void detach(MyObserver observer) {
	observers.remove(observer);
    }

    public abstract void cry(); // ����֪ͨ����
}