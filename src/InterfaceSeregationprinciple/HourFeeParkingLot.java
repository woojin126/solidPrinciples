package InterfaceSeregationprinciple;

public class HourFeeParkingLot implements ParkingFee, ParkingLot{
    @Override
    public double calculateFee(Car car) {
        return 10000;
    }

    @Override
    public void doPayment(Car car) {
        System.out.println("시간제 요금");
    }

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }
}
