public class Car extends Bicycle {

    public Car(String type, String modelName, int wheelsCount) {
        super(type, modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем шину авто");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }
}