public class Main {
    public static void main(String[] args) {
        demo4();
    }

    public static void demo(){
        Person p1 = new Person();

        p1.setFirstName("Peter");
        p1.setLastName("Parker");
        p1.setNickName("Spidy");
        p1.setGender("M");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getNickName());
        System.out.println(p1.getGender());

    }

    public static void demo2() {
        Person p2 = new Person("peTer","parKER","spidy","m");
        System.out.print(p2.getFirstName()+ " " + p2.getLastName());
        //System.out.print(p2.getLastName());
    }
    public static void demo3(){
        Person p3 = new Person("peTer","spidy");
        System.out.println(p3.getFirstName());
    }
    public static void demo4(){
//        Person p4 = new Person();
        Patient p5 = new Patient("Peter","Parker","spidy","M",170f,70f);
//        System.out.println(p5.getFirstName()+ " " + p5.getLastName() + "\n"+ "Height= "+
//                p5.getHeight() + "\n"+"Weight= " + p5.getWeight());
        System.out.println(p5.toString());
    }
}
