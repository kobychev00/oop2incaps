public class Truck extends Car {

    public Truck(String type, String modelName, int wheelsCount) {
        super(type, modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}