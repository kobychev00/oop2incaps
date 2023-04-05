public class ServiceStationC implements ServiceStation {


    @Override
    public void check(Car Car, Bicycle Bicycle, Truck Truck) {
        if (Car != null) {
            System.out.println("Обслуживаем " + Car.getModelName());
            for (int i = 0; i < Car.getWheelsCount(); i++) {
                Car.updateTyre();
            }
            Car.checkEngine();
        } else if (Truck != null) {
            System.out.println("Обслуживаем " + Truck.getModelName());
            for (int i = 0; i < Truck.getWheelsCount(); i++) {
                Truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
        } else if (Bicycle != null) {
            System.out.println("Обслуживаем " + Bicycle.getModelName());
            for (int i = 0; i < Bicycle.getWheelsCount(); i++) {
                Bicycle.updateTyre();
            }
        }
    }
}