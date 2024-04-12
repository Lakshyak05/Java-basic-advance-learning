// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] obj1 = new Student[5];
        Student Lakshya = new Student(38, "Lakshya Khandelwal", 32.4f);

//        Lakshya.rno = 13;
//        Lakshya.name = "lakshya";
//        Lakshya.marks = 88.5f;

//        Lakshya.changeName("LK");
//        Lakshya.greeting();


//        System.out.println(Lakshya);
        System.out.println(Lakshya.rno);
        System.out.println(Lakshya.name);
        System.out.println(Lakshya.marks);

        Student random = new Student(Lakshya);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.rno);
        System.out.println(random2.marks  );

        Student one = new Student();
        Student two = one;

        one.name = "wsjkdfne";
        System.out.println(two.name );

    }


}
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    // Below is the constructor of class Student
    // We need one word to access every object inside the class
    // Whenever new object is created it go inside constructor
    Student( Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student () {
//       This is how u call constructor from another constructor
        //internally its something like: new Student();
        this(16, "awjkdhaj",82.77f);
    }

    //below are two different ways to pass arguements
    Student(int rno, String name, float marks){    // Since this constructor has no parameters it directly go inside the constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks ;
    }
                            // OR

//    Student(int roll, String naam, float num){
//        rno = roll;
//        name = naam;
//        marks = num;
//    }
}
