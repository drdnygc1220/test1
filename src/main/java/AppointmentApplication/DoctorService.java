package AppointmentApplication;

import java.util.ArrayList;
import java.util.List;

//6-doktorlar sistemde kayıtlı olsun ve gösterilsin..
public class DoctorService {
    public List<Doktor> doctorList=new ArrayList<>();

    //7--service objesi oluşunca,sistem başlayınca listede doktorlar olsun


    public DoctorService() {//parametresiz constructor oluşturuyorum listeye eklensin...
        Doktor doctor1=new Doktor(11,"Dr.Leonardo","KBB");
        Doktor doctor2=new Doktor(22,"Dr.Raphael","Göz");
        Doktor doctor3=new Doktor(33,"Dr.Donatello","Genel Cerrahi");
        this.doctorList.add(doctor1);
        this.doctorList.add(doctor2);
        this.doctorList.add(doctor3);


    }
    //8-doktor listesini yazdırma,tarihler alt alta listelensin..
    public void printDoctors(){//geriye bir deger döndürmüyoruz yazdıracagız sadece void yaptık o yüzden
        System.out.println("-----------------DOKTORLARIMIZ-----------");
        //bu clasdaki doktor listesini gezelim
        for(Doktor dr:this.doctorList){
            System.out.println("No:" +dr.getId()+"Adı:"+dr.getIsim()+"Branşı:"+dr.getBrans());
            //tarihleri alt alta yazdırmak için foreach kullandım
            for(String date: dr.getDates()){
                System.out.println(date);
            }

        }
        System.out.println("---------------------------------------------");
    }
    //9-id si verilen doktoru listeden bulma
    public Doktor findDoctorById(int id){//bana doktor döndürecek
        //listedeki doktorlar listesini gez her bir doktorun ıd kontrol edecegim..
        for(Doktor dr:this.doctorList){
            // parametrede vermiş oldugumuz ıd eşit ise return et yani geriye döndür..
            if(dr.getId()==id){
                return dr;//methodu sonlandırır bu yüzden else ye gerek kalmadı.

            }
        }
        return null;//for içerinde gecerli bir deger döndürmemişsen null döndür.

    }
}

