package OOP;

public abstract class People {
    //sadece child claslarım kullanabilir..
    //acses modifier:private,public,protected,default


  protected   String name;
   protected String isName;
  protected   int age;
  /*
    int maaş;
    void maasHesaplama(){

   */
    //abstract method kullandık..
   abstract int maasHesaplama();//body olmayacak...override yapmak zorundayız..
    //bu kısımda sözleşme bunu kim kullanacaksa overrride etmek zorunda..



}
