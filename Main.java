public class Main {
    public static void main(String[] args) {


        Bicycle stels = new Bicycle("Велосипед", "Stels 4", 4);
        stels.printInfo();
        stels.updateTyre();

        Bicycle forward = new Bicycle("Велосипед", "Forward 4", 4);
        forward.printInfo();
        forward.updateTyre();


        Car audi = new Car("Car", "Audi 80", 4);
        audi.printInfo();
        audi.checkEngine();
        audi.updateTyre();

        Car bmw = new Car("Car", "BMW", 4);
        bmw.printInfo();
        bmw.checkEngine();
        bmw.updateTyre();

        Truck man = new Truck("Truck", "Man 19", 12);
        man.printInfo();
        man.checkTrailer();
        man.updateTyre();
        man.checkEngine();

        Truck kamaz = new Truck("Kamaz", "Kamaz 19", 12);
        kamaz.printInfo();
        kamaz.checkTrailer();
        kamaz.updateTyre();
        kamaz.checkEngine();

        ServiceStationC station = new ServiceStationC();
        station.check(audi, null, null);
        station.check(bmw, null, null);
        station.check(null, stels, null);
        station.check(null, forward, null);
        station.check(null, null, man);
        station.check(null, null,kamaz);


    }
}
