import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ICars sedan1 = new SedanCar("1","BMW", "320d Sport Line ", "A", "80","Otomatik", "Beyaz", 8);
        ICars sedan2 = new SedanCar("2","BMW", "316i M Sport", "C", "100","Otomatik", "Kırmızı", 11);
        ICars sedan3 = new SedanCar("3","BMW", "316i Standart", "B", "100", "Otomatik", "Siyah", 14);


        ICars hatchback1 = new HatchbackCar("6","Opel", "1.6 TDI ", "B", "80","Otomatik", "Beyaz", 8);
        ICars hatchback2 = new HatchbackCar("7","Opel", "1.3 CDTI Essentia", "C", "100","Otomatik", "Kırmızı", 11);
        ICars hatchback3 = new HatchbackCar("8","Volkswagen", "316i ", "B", "100", "Otomatik", "Siyah", 14);
        ICars hatchback4 = new HatchbackCar("9","Volkswagen", "1.6 Comfort", "A", "50","Otomatik", "Gri", 18);
        ICars hatchback5 = new HatchbackCar("10","Ford", "2.0 T8MCBNX", "B", "100","Otomatik", "Siyah", 24);

        ICars suv1 = new SuvCar("11","Hyundai", "1.6 CRDI Style ", "B", "80","Otomatik", "Beyaz", 18);
        ICars suv2 = new SuvCar("12","Mitsubishi", "L 200", "C", "100","Manuel", "Gri", 9);
        ICars suv3 = new SuvCar("13","Audi", "Q5 ", "B", "100", "Otomatik", "Siyah", 14);






        ICustomer customer1 = new IndividualCustomer("Ece","Tekir","12345678912");
        ICustomer customer2 = new Campany("ABC","1234","5432347899");

        CarRentalManager rent1 = new CarRentalManager(customer1,sedan1,4);
        CarRentalManager rent2 = new CarRentalManager(customer2,hatchback1,30);

        System.out.println(rent1);
        System.out.println("-------------------");
        System.out.println(rent2);




    }
}