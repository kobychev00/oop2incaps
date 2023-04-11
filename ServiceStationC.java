public class ServiceStationC{

    public void check(Car Car) {
            System.out.println("Обслуживаем " + Car.getModelName());
            for (int i = 0; i < Car.getWheelsCount(); i++) {
                Car.updateTyre();
            }
            Car.checkEngine();
        }

    public void check(Bicycle Bicycle) {
            System.out.println("Обслуживаем " + Bicycle.getModelName());
            for (int i = 0; i < Bicycle.getWheelsCount(); i++) {
                Bicycle.updateTyre();
            }
        }

    public void check(Truck Truck) {
            System.out.println("Обслуживаем " + Truck.getModelName());
            for (int i = 0; i < Truck.getWheelsCount(); i++) {
                Truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
    }
}

