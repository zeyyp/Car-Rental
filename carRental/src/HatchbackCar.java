
import java.util.ArrayList;
import java.util.HashMap;

public class HatchbackCar extends Cars implements ICars, IDailyRental , IMonthlyRental {

     float dailyRentalRate=1300;
    public String monthlyRentalRate;

    ArrayList<Cars> hatchbackList = new ArrayList<Cars>();


    HashMap<String, Double> hatchbackSegmentKatsayi;


    HatchbackCar( String id,String brand, String model, String segment, String luggageCapacity,
                 String vitesTipi, String color, int age) {

        super();
        this.id=id;
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.luggageCapacity = luggageCapacity;
        this.vitesTipi = vitesTipi;
        this.color = color;
        this.age = age;
        this.dailyRentalRate = dailyRentalRate;
        hatchbackList.add(this);

        hatchbackSegmentKatsayi = new HashMap<String, Double>();
        hatchbackSegmentKatsayi.put("A",7.5);
        hatchbackSegmentKatsayi.put("B",8.5);
        hatchbackSegmentKatsayi.put("C",9.5);

    }


    @Override
    public double monthlyRental(String segment) {
       double hesap=0;
        switch (segment.toUpperCase()){
            case "A":
                hesap= hatchbackSegmentKatsayi.get("A")*dailyRentalRate;
                break;
            case "B":
                hesap= hatchbackSegmentKatsayi.get("B")*dailyRentalRate;
                break;
            case "C":
                hesap= hatchbackSegmentKatsayi.get("C")*dailyRentalRate;
                break;
            default:   System.out.println("Girilen bilgileri kontrol ediniz");
        }
        return hesap;
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
        return  id;
    }
}