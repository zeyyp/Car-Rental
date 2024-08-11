import java.util.ArrayList;

public class SuvCar extends Cars implements ICars, IDailyRental{

    float dailyRentalRate=950;

    ArrayList<Cars> suvList = new ArrayList<Cars>();

    SuvCar(String id, String brand, String model,String segment,String luggageCapacity,
             String vitesTipi,String color,int age){

        super();
        this.id= id;
        this.brand= brand;
        this.model= model;
        this.segment= segment;
        this.luggageCapacity= luggageCapacity;
        this.vitesTipi= vitesTipi;
        this.color= color;
        this.age= age;

        suvList.add(this);

    }


    @Override
    public float dailyRental(int day) {
        return day*dailyRentalRate;
    }


    @Override
    public float GetPrice(int day) {

        return dailyRental(day) ;
    }

    @Override
    public String toString() {
        return  id;
    }
}
