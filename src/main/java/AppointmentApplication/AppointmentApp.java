package AppointmentApplication;

import java.util.Scanner;

/*
Proje: Randevu oluşturma uygulaması geliştiriniz.

       1-Ana menüde kullanıcıya randevu alma veya görüntülemek için iki seçenek sunulur.
       2-Randevu alma/oluşturma
            -Kullanıcıya mevcut doktorlar ve uygun oldukları tarihler gösterilir.
            -Kullanıcıdan no ile doktor seçmesi istenir.
            -Seçilen doktorun takvimi gösterilir.
            -Randevu alınmak istenen tarihin seçilmesi istenir.
            -en yakın 7 günlük takvim dolmuşsa daha sonra denenmesi istenir.
            -Geçerli bir tarih seçilmişse randevu oluşturulur ve bu tarih doktorun takviminden silinir.

       3-Randevu görüntüleme:
            -Kullanıcıya randevu no sorulur,
             randevu listesinde girilen no ile eşleşen randevu bilgileri yazdırılır.

       4-Doktor:
            -id, isim, branş, takvim
            -takvim: sistemin kullanıldığı günden 1 gün sonra başlamak üzere
                     7 günlük uygun randevu tarihleri

       5-Randevu:
            -id : otomatik üretilsin
            -hasta adı,Doktor,randevu tarihi

       6-Sistemde doktorlar kayıtlı olsun.

 */
public class AppointmentApp {
    public static void main(String[] args) {
        start();

    }
    //1- Ana menüyü oluştur
    //2-doctor,appomintment classları oluşturalım
    private static void start() {
        Scanner input=new Scanner(System.in);
        AppointmentService appointmentService=new AppointmentService();//objemi oluşturdum
        DoctorService doctorService=new DoctorService();
        int select=0;
        do{
            System.out.println("merhaba,randevu sistemine hoş geldniz..");
            System.out.println("1-randevu alma");
            System.out.println("2-randevu görüntülüme");
            System.out.println("0-çıkış");
            System.out.print("seçiminiz");
            select=input.nextInt();
            switch(select){
                case 1:
                    appointmentService.createAppointment(doctorService);//appointmentservicen appointment methodunu cagırıyorum .
                    // parametre olarak benden istediği doktor servis objesini cagırıyorum.
                    break;
                case 2:
                    appointmentService.displayAppointment();
                    break;
                case 0:
                    System.out.println("saglıklı günler dileriz...");
                    break;
                default:
                    System.out.println("hatalı giriş");
                    break;
            }

        }while (select!=0);
    }

}
