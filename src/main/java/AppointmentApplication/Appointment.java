package AppointmentApplication;
 /*5-Randevu:
         -id : otomatik üretilsin
         -hasta adı,Doktor,randevu tarihi

  */
public class Appointment {
    private static int counter=99;
    private int no;//randevu numarası otomatik olsun istiyoruz..bir tane sayac yapıyorduk(counter)
     private String name;
     private Doktor doctor;//tüm hepsini allaım diye doktor objesinden aldık...
     private String date;

     public Appointment(String name, Doktor doctor, String date) {
         counter++;
         this.no=counter;//parametreden almadık.kendimiz yaptık..//100,101,102
         this.name = name;
         this.doctor = doctor;
         this.date = date;
     }



     public int getNo() {
         return no;
     }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Doktor getDoctor() {
         return doctor;
     }

     public void setDoctor(Doktor doctor) {
         this.doctor = doctor;
     }

     public String getDate() {
         return date;
     }

     public void setDate(String date) {
         this.date = date;
     }



 }

