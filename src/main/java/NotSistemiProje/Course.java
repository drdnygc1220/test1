package NotSistemiProje;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Course {

   public String name;
   private int code;
   public String prefix;
    private int note;
    public String teacher;


    public void Course(){



    }

    public Course(String name, int code, String prefix, int note, String teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.teacher = teacher;
    }

    public void addTeacher(){


    }
    public void printTeacher(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", prefix='" + prefix + '\'' +
                ", note=" + note +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}



