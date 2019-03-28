public class Person {
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name="+name+",address="+address+"]";
    }
}

class testPerson{
    public static void main(String[] args) {
        //Create test subjects
        Student student1 = new Student("Krister","Somestreet 7","Front End & Mobile Development", 1, 44000.00);
        Student student2 = new Student("Ingrid","Otherstreet 2", "Interactive Design", 1, 44000.00);
        Student student3 = new Student( "Marcin", "Laststreet 11", "Front End & Mobile Development",1, 44000.00);

        Staff staff1 = new Staff("Michael","Javastreet 8", "Høyskolen Kristiania", 1000000.00);
        Staff staff2 = new Staff("Bengt","Hackstreet 404", "Høyskolen Kristiania", 1101011.00);

        //Test methods
        System.out.println(student1.getName());
        System.out.println(staff1.getAddress());

        System.out.println(student1.getFee());
        System.out.println(student2.getProgram());
        System.out.println(student3.getYear());

        student1.setFee(10.00);
        student2.setProgram("Front End & Mobile Development");
        student3.setYear(2);

        System.out.println(student1.getFee());
        System.out.println(student2.getProgram());
        System.out.println(student3.getYear());


        System.out.println(staff1.getSchool());
        System.out.println(staff2.getPay());

        staff1.setSchool("Not Høyskolen Kristiania");
        staff2.setPay(7.00);

        System.out.println(staff1.getSchool());
        System.out.println(staff2.getPay());

        //Compare toStrings
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());

    }
}