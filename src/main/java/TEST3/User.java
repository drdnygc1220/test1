package TEST3;
/*
   1- filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
      olan User isimli bir class create ediniz.
   2- bütün fieldları parametre alan bir constructor tanımlayınız.
   4- UserMain isminde main için bir class create ediniz.
   5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
      active ve signedIn default olarak true, false atayabilirsiniz.
      id yi sistemde otomatik aliniz.,
   6- eğer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
      6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.
*/
public class User {
    private int ıd;
    private  String userName;
    private int password;
    private boolean active;
    private boolean signedIn;

    public User(int ıd, String userName, int password, boolean active, boolean signedIn) {
        this.ıd = ıd;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "ıd=" + ıd +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
