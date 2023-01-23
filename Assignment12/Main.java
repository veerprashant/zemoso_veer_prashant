package Assignment12;

import java.util.*;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        ArrayList<Student> ar=new ArrayList<Student>();
        ar.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        ar.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        ar.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        ar.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        ar.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        ar.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        ar.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        ar.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        ar.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        ar.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        ar.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        ar.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        ar.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        ar.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        ar.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        ar.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        ar.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));



        System.out.println("------------------------------Print the name of all departments in the college-----------------------------------------------------------------------");

           ar.stream().map(s->s.engDepartment).sorted().distinct().forEach(s->System.out.println(s));


        System.out.println("------------------------------Get the names of all students who have enrolled after 2018-----------------------------------------------------------------------");
ar.stream().filter(s->s.yearOfEnrollment>2018).map(n->n.name).forEach(n->System.out.println(n));

        System.out.println("------------------------------Get the details of all male student in the computer sci department-----------------------------------------------------------------------");

        ar.stream().filter(s->s.engDepartment.equals("Computer Science") && s.gender.equals("Male")).map(n->n.id+"|"+n.name+"|"+n.age+"|"+n.gender+"|"+n.engDepartment+"|"+n.yearOfEnrollment+"|"+n.perTillDate).forEach(n->System.out.println(n));

        System.out.println("------------------------------How many male and female student are there-----------------------------------------------------------------------");

        long c1=ar.stream().filter(s->s.gender.equals("Male")).count();
        System.out.println("Male Count: "+c1);

        long c2=ar.stream().filter(s->s.gender.equals("Female")).count();
        System.out.println("Female Count: "+c2);

        System.out.println("------------------------------What is the average age of male and female students-----------------------------------------------------------------------");

        Double avgMaleAge = ar.stream().filter(s->s.gender.equals("Male")).collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Avg Age of male : "+avgMaleAge);

        Double avgFemaleAge=ar.stream().filter(s->s.gender.equals("Female")).collect(Collectors.averagingDouble(s->s.age));
        System.out.println("Avg Age of Female : "+avgFemaleAge);

        System.out.println("------------------------------Get the details of highest student having highest percentage-----------------------------------------------------------------------");

        Optional<String> student = ar.stream().filter(s ->s.engDepartment.equals("Electronic")).max(Comparator.comparing(s->s.perTillDate)).map(n -> n.id + "|" + n.name + "|" + n.age + "|" + n.gender + "|" + n.engDepartment + "|" + n.yearOfEnrollment + "|" + n.perTillDate);

        System.out.println("Student : "+student);


        OptionalInt minAge = ar.stream().mapToInt(s -> s.age).min();

        System.out.println("Min age from Age column : "+minAge);


        System.out.println("------------------------------Count the number of students in each department-----------------------------------------------------------------------");
        Map<String, Long> groupCount = ar.stream().collect(Collectors.groupingBy(s -> s.engDepartment, Collectors.counting()));
        System.out.println(groupCount);

        System.out.println("------------------------------What is the average percentage achieved in each department-----------------------------------------------------------------------");
        Map<String, Double> avgPercent = ar.stream().collect(Collectors.groupingBy(s -> s.engDepartment, Collectors.averagingDouble(s -> s.perTillDate)));
        System.out.println(avgPercent);

        System.out.println("------------------------------Get the details of youngest male student in the Electronic department-----------------------------------------------------------------------");

        Optional<String> youngMale = ar.stream().filter(s -> s.gender.equals("Male") && s.engDepartment.equals("Electronic")).max(Comparator.comparing(s -> s.age)).map(n -> n.id + "|" + n.name + "|" + n.age + "|" + n.gender + "|" + n.engDepartment + "|" + n.yearOfEnrollment + "|" + n.perTillDate);
        System.out.println(youngMale);
        System.out.println("------------------------------ How many male and female students are there in the computer science department-----------------------------------------------------------------------");

        Map<String, Long> Count = ar.stream().collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()));

        System.out.println("Count of Male And Female : "+Count);
        
    }
}
