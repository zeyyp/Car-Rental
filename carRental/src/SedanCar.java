import java.util.ArrayList;

public class SedanCar extends Cars implements ICars, IMonthlyRental ,IDailyRental{

   private float dailyRentalRate=800;
    int sale=7;

    ArrayList<Cars> sedanList = new ArrayList<Cars>();

    SedanCar(String id,String brand, String model,String segment,String luggageCapacity,
     String vitesTipi,String color,int age){

        super();
        this.id=id;
        this.brand= brand;
        this.model= model;
        this.segment= segment;
        this.luggageCapacity= luggageCapacity;
        this.vitesTipi= vitesTipi;
        this.color= color;
        this.age= age;

        sedanList.add(this);

    }



    @Override
    public double monthlyRental(String segment) {
        return (dailyRentalRate*30)*(100-sale)/100;
    }

    @Override
    public float dailyRental(int day) {
        return day*dailyRentalRate;
    }

    @Override
    public float GetPrice(int day) {
        float price=0;

        if(day>=30){
         price= (float) monthlyRental(segment);
        }
        else{
          price= dailyRental(day);
        }
        return price ;
    }

    @Override
    public String toString() {
        return id;
    }
}
