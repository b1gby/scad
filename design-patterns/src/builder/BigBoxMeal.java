package builder;

public class BigBoxMeal extends MealBuilder {
    @Override
    public void buildFood() {
	meal.setFood("1�����ȱ�+2���°¶�������+1��������+1ֻ��ʽ��̢");
    }

    @Override
    public void buildDrink() {
	meal.setDrink("1�������");
    }
}