package OOP;

public class Runner {
    public static void main(String[] args) {

        Worker worker=new Worker();
        Secretary secretary=new Secretary();
        Manager maneger=new Manager();
        /*
        People people=new People();bunu yazmaması gerekiyor 3 OBBJE GEREKLİ ÇÜNKÜ abstract yapalım ki obje oluşturmasın
         */
        Calculator calculator=new Calculator();
        //calculator.giveMeResult(worker);//workerdan aldı
        calculator.giveMeResult(secretary);

        //Constructor obje yapmak için vardır..
        Worker secretary1=new Secretary();//(Worker:Data type(tipi)..secratry1:isim..new:(keyword)yeni bir obje oluşturmanın emri..Secretary:Constructor)
        calculator.giveMeResult(secretary1);//secretary gelir..constructora bakar çünkü..

        System.out.println(((Secretary) secretary1).giveMeDepartman()); //sekretere dönüştürdük..
       // System.out.println(((Secretary) worker).giveMeDepartman());//workerı sekretere cevirdik..//sekreter gelir normlade
        //fakat workerde giveDepartman diye bir method yok exception alırız..
        if(worker instanceof Secretary){//exception almak istemiyoruz..worker sekreter ınstanceysa calıştır diyoruz aslında..
            System.out.println(((Secretary) worker).giveMeDepartman());//objeler farklı türde kullanılır.polymorphism yaptık.
        }


    }
}
