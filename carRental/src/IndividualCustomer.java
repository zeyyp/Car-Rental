import java.util.ArrayList;

public class IndividualCustomer implements ICustomer{
   private String adi;
   private String soyadi;
   private String tcNo;

   ArrayList<ICustomer> IndividualList = new ArrayList<ICustomer>();

   IndividualCustomer(String adi,String soyadi,String tcNo){
       this.adi=adi;
       this.soyadi=soyadi;
       this.tcNo=tcNo;

       IndividualList.add(this);
//       for(ICustomer cos : IndividualList){
//           System.out.println(cos);
//       }

   }



    @Override
    public String toString() {
        return "Adı Soyadı: " + adi + " " + soyadi + ", TC No: " + tcNo;
    }


}
