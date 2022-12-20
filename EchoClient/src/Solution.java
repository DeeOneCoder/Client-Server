import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double x) {
        this.cgpa = x;
    }
}

//Complete the code
public class Solution {
    public static void main(String[] args) {

        int count = 0;
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        ArrayList<Student> finalList = Solution.sortStudents(studentList);

//1000
    }

    public static ArrayList<Student> sortStudents(List<Student> list) {
        ArrayList<Student> sortedList = new ArrayList<Student>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            Student start = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                Student inner = list.get(j);

                if (start.getCgpa() > inner.getCgpa()) {
                    if(list.indexOf(start) < list.indexOf(inner)){
                        continue;
                    }

                }
                if (start.getCgpa() == inner.getCgpa()) {
                    if((list.indexOf(start)+1) < list.indexOf(inner) ) {
                        if (sortedList.contains(inner) && start.getCgpa() == 0.00) {
                            sortedList.add(start);
                            break;
                        }
                    }



                }

                if (start.getCgpa() < inner.getCgpa()) {
                    start = inner;
                }

            }
            if(!sortedList.contains(start)){
                sortedList.add(start);
                start.setCgpa(0.00);
                System.out.println(++count + ": " + start.getFname() + " " + start.getCgpa());
            }


        }

        return sortedList;

    }
}






//import java.util.*;
//
//class Student {
//    private int id;
//    private String fname;
//    private double cgpa;
//
//    public Student(int id, String fname, double cgpa) {
//        super();
//        this.id = id;
//        this.fname = fname;
//        this.cgpa = cgpa;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public double getCgpa() {
//        return cgpa;
//    }
//
//    public void setCgpa(double x) {
//        this.cgpa = x;
//    }
//}
//
////Complete the code
//public class Solution {
//    public static void main(String[] args) {
//
//        int count = 0;
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<Student>();
//        while (testCases > 0) {
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
//
//        ArrayList<Student> finalList = Solution.sortStudents(studentList);
//
////        for (Student st : finalList) {
////            System.out.println( st.getFname());
////        }
//    }
//
//    public static ArrayList<Student> sortStudents(List<Student> list) {
//        ArrayList<Student> sortedList = new ArrayList<Student>();
//
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Student start = list.get(i);
//
//            for (int j = 0; j < list.size(); j++) {
//                Student inner = list.get(j);
//
//                if (start.getCgpa() > inner.getCgpa()) {
//
//                }
//                if (start.getCgpa() == inner.getCgpa()) {
//                    if((list.indexOf(start)+1) < list.indexOf(inner) ){
//                        if(start.getCgpa() == 0.00 )
//                        {
//                            sortedList.add(start);
//                            break;
//                        }
//                        start = inner;
//
//                    }
//
//
//
//                }
//
//                if (start.getCgpa() < inner.getCgpa()) {
//
//                    start = inner;
//                }
//                if (list.size() - j == 1) {
//
//
//
//                }
//            }
//            if(!sortedList.contains(start)){
//                sortedList.add(start);
//                start.setCgpa(0.00);
//                System.out.println(++count + ": " + start.getFname() + " " + start.getCgpa());
//            }
//
//
//        }
//
//        return sortedList;
//
//    }
//}
//
//
