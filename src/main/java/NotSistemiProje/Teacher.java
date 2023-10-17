package NotSistemiProje;

public class Teacher {
    String name;
    String brans;
    public Teacher(){


    }


    public Teacher(String name,String brans) {
        this.name = name;
        this.brans=brans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
