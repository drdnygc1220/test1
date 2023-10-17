package OOP;

public class Calculator {//gönderdiğimiz adamın bilgilerini bize yazdıracak..

   /*
   //kod tekrarı cok fazla oldugu için abstrcat method kullandık ve bu kadar işlemi tek satırda hallettik..asagıda
    void giveMeResult(Worker worker){//sonucları bana ver
        worker.maasHesaplama();

    }  void giveMeResult(Secretary secretary){//sonucları bana ver
        secretary.maasHesaplama();

    }  void giveMeResult(Manager manager){//sonucları bana ver
        manager.maasHesaplama();

    }
    */
    void giveMeResult(People people){//giveMeResult methodu ne iş yaptıgını bilmiyoe sadece içine ne yazarsan onu cagırıyor.
        System.out.println(people.maasHesaplama());

    }

}
