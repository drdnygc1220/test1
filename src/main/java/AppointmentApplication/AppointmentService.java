package AppointmentApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//10--randevu ile ilgili işlemler..
public class AppointmentService {
    public Scanner input=new Scanner(System.in);
    //11-oluşan randevuları listede tutalım,çünkü daha sonra görüntüleyecegiz...
    public List<Appointment> appointments=new ArrayList<>();
    //12--randevu oluşturma,birşey döndürmeyecek
    public void createAppointment(DoctorService doctorService){
        //13-doktor listesini gösterelim..
        doctorService.printDoctors();//doktorservice de vardı parametrenin içine obje oluşturup oradan cagırdık
        System.out.println("Randevu almak istediğiniz doktoru seciniz (no): ");
        int selectDr=input.nextInt();//secimimizi yapıyoruz..
        input.nextLine();

       Doktor doctor =doctorService.findDoctorById(selectDr);
       if(doctor!=null){//yani 1,2,3, girmişse
           //14-tarih secmek:takvimde randevu için müsait bir tarih varmı
           if(doctor.getDates().isEmpty()){//eger liste boş ise
               System.out.println(doctor.getIsim()+"un bu hafta tüm randevuları dolmuştur,daha sonra tekrar deneyiniz.");

           }else{
               //randevu oluşturmaya devam
               System.out.println("lütfen isminizi giriniz:");
               String name=input.nextLine();
               System.out.println("sayın"+name+"randevu alabileceginiz tarihler: ");
              for(int i=1;i<=doctor.getDates().size();i++){

                  System.out.println(i+"-"+doctor.getDates().get(i-1));//1-2023-09-26,,,2-2023-09-27
              }
               System.out.println("randevu almak istediğiniz tarihin numarasını giriniz:");
              int dateNo=input.nextInt();
              input.nextLine();
              //15--1,2 dışında tarih girmişse yani gecerli bir tarih girildi mi
               if(dateNo>0 && dateNo<=doctor.getDates().size()){
                   //randevu oluşturulabilir
                   Appointment appointment=new Appointment(name,doctor,doctor.getDates().get(dateNo-1));
                   //randevu tarihinin doktorun takviminden silinmesi gerekir..
                   doctor.getDates().remove(dateNo-1);
                   //randevuyu kaydetme,listeye ekleyecgiz..
                   this.appointments.add(appointment);
                   System.out.println("sayın "+name+" randevunuz başarılı bir şekilde oluşturuldu.");
                   System.out.println("randevu no: "+appointment.getNo()+" ile randevu bilhileriniz görüntüleyebilirsiniz.");
               }else {//negatif deger girmişse
                   System.out.println("hatalı giriş tekrar deneyiniz.");
               }

           }


       }else{
           System.out.println("doktor bulunamadı,tekrar deneyiniz.");
       }

    }
    //16-nosu verilen mevcut randevularımızı görüntüleme
    public void displayAppointment(){
        boolean isFound=false;//default degeri false olsun
        System.out.println("randevu no giriniz: ");
        int no=input.nextInt();
        input.nextLine();
        for(Appointment app:this.appointments){
            if(app.getNo()==no){//randevu numarası eşleşti..
                isFound=true;
                System.out.println("-----------------------------------");
                System.out.println(no+"'lu Randevu Bilgileri");
                System.out.println("hasta adı:"+app.getName());//hasta adı=name
                System.out.println("branş:"+app.getDoctor().getBrans());
                System.out.println("doktor:"+app.getDoctor().getIsim());//doktor adı=isim
                System.out.println("randevu tarihi:"+app.getDate());
                System.out.println("-----------------------------------");
                break;//isFoundun true kalması için döngüyü kırıyoeum

            }
        }
        if(!isFound){
            System.out.println("randevu bulunamadı..");
        }
    }

}
