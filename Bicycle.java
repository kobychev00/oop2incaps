public class Bicycle extends Transport {

        public Bicycle(String type, String modelName, int wheelsCount) {
            super(type, modelName, wheelsCount);
        }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

}
