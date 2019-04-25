package builder;

public class KidsMeal extends MealBuilder {
    @Override
    public void buildFood() {
	meal.setFood("һ�������");
    }

    @Override
    public void buildDrink() {
	meal.setDrink("һ����֭");
    }
}