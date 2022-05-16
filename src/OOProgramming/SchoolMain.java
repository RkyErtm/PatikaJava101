package OOProgramming;

public class SchoolMain {
    /*
    Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
     */
    public static void main(String[] args) {
        Teacher t1=new Teacher("Rky","TRH","0536");
        Teacher t2=new Teacher("mlk","FZK","0555");
        Teacher t3=new Teacher("Sum","BIO","0009");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("inek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,80,70,50,50,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","234","4",fizik,tarih,biyo);
        s2.addBulkExamNote(100,34,78,80,90,90);
        s2.isPass();
    }
}
