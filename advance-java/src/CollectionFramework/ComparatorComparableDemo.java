package CollectionFramework;

import java.util.*;

class Student {
    public int age;
    public int marks;
    public String name;

    public Student(int age, int marks, String name){
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorComparableDemo {
    public static void main(String[] args) {
        // Integer Comparator for second digit comparison
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10) return 1;
                else return -1;
            }
        };

        // Student Comparator for age
        Comparator<Student> studentComparator = new Comparator<>() {
            public int compare(Student s1, Student s2){
                if(s1.age > s2.age) return 1;
                else return -1;
            }
        };

        // Using Integer comparator
        List<Integer> list1 = new ArrayList<>();
        list1.add(99);
        list1.add(23);
        list1.add(92);
        list1.add(45);
        System.out.println(list1);
        Collections.sort(list1, comparator);
        System.out.println(list1);

        // Using Object Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 59, "Nitin"));
        students.add(new Student(44, 89, "Omkar"));
        students.add(new Student(35, 98, "Pooja"));
        students.add(new Student(21, 99, "Harshali"));

        System.out.println(students);
        Collections.sort(students, studentComparator);
        System.out.println(students);
    }
}
