public class Campany implements ICustomer{

    private String campanyName;
    private String taxNo;
    private String telNo;

    Campany(String campanyName,String taxNo,String telNo){
        this.campanyName=campanyName;
        this.taxNo=taxNo;
        this.telNo=telNo;
    }


    @Override
    public String toString() {
        return "Sirket Adı: " + campanyName +  ", Vergi No: " + taxNo;
    }


}
