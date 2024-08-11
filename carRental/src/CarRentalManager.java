public class CarRentalManager {

    private int day;
    private ICars car;
    private ICustomer customer;


    public CarRentalManager(ICustomer customer,ICars car,int day) {
        this.customer = customer;
        this.car=car;
        this.day=day;
    }


    @Override
    public String toString() {

        return  customer.toString() +
                "\nAraba Id: " + car.toString() +
                "\nToplam Ücret: " + car.GetPrice(day);


    }


}
