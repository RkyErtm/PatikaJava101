package OOProgramming;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    double avernote;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3)
    {
      this.name=name;
      this.stuNo=stuNo;
      this.classes=classes;
      this.c1=c1;
      this.c2=c2;
      this.c3=c3;
      this.average=0.0;
      this.isPass=false;
      this.avernote=0.0;
    }

    void addBulkExamNote(int note1,int note2,int note3,int soz1,int soz2,int soz3){
        if (note1>=0&&note1<=100){
            this.c1.note=note1;
        }
        if (note2>=0&&note2<=100){
            this.c2.note=note2;
        }
        if (note3>=0&&note3<=100){
            this.c3.note=note3;
        }
        if (soz1>=0&&soz1<=100){
            this.c1.sozlu=soz1;
        }
        if (soz2>=0&&soz2<=100){
            this.c2.sozlu=soz2;
        }
        if (soz3>=0&&soz3<=100){
            this.c3.sozlu=soz3;
        }
    }

    void isPass(){
        this.c1.avernote=((this.c1.note*0.8)+(this.c1.sozlu*0.2));
        this.c2.avernote=((this.c2.note*0.8)+(this.c2.sozlu*0.2));
        this.c3.avernote=((this.c3.note*0.8)+(this.c3.sozlu*0.2));
        this.average=(this.c1.avernote+this.c2.avernote+this.c3.avernote)/3.0;

        if (this.average>55){
            System.out.println("Tebrikler sınıfı geçtiniz.");
            this.isPass=true;
        }
        else{
            System.out.println("Sınıfta KALDINIZ");
            this.isPass=false;
        }
        printNote();
    }

    void printNote(){

        System.out.println(this.c1.name+" notu:"+this.c1.note);
        System.out.println(this.c2.name+" notu:"+this.c2.note);
        System.out.println(this.c3.name+" notu:"+this.c3.note);
        System.out.println(this.c1.name+" Sözlü notu:"+this.c1.sozlu);
        System.out.println(this.c2.name+" Sözlü notu:"+this.c2.sozlu);
        System.out.println(this.c3.name+" Sözlü notu:"+this.c3.sozlu);
        System.out.println("ortalamanız: "+this.average);
        System.out.println("------------------------");
    }
}
