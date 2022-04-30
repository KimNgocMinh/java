package lesson5;

public class Activity5_2 {
    public static void main(String[] args) {
        Student students1 = new Student("Minh", 2);
        Student students2 = new Student("Cuong", 1.5);
        Student students3 = new Student("Dung", 1.4);
        StudentManagement quanLySinhVien = new StudentManagement(students1,students2,students3);
        quanLySinhVien.sinhVienGpaCaoNhat();
        quanLySinhVien.sinhVienGpaThapNhat();
        System.out.println("Tong so sinh vien do la: " + quanLySinhVien.tongSoSinhVienDo());
        System.out.print("Tong so sinh vien truot la: " + quanLySinhVien.tongSoSinhVienTruot());
    }
}

    class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa){
            this.name = name;
            this.gpa = gpa;
    }
    public void setName(String name){
            this.name = name;
    }
    public String getName(){
         return name;
    }
    public void setGpa(double gpa){
            this.gpa = gpa;
    }
    public double getGpa(){
            return gpa;
    }
    public void checkGpa(){
            if(gpa >= 1.5)
                System.out.println("Passed");
            else System.out.println("Missed");
    }
    public void printName(){
            System.out.print("Name is: " + getName());
    }
    public void printGpa(){
            System.out.print("Gpa is: " + getGpa());
    }
    }

    class StudentManagement{
        public Student[] students = new Student[3];

        public StudentManagement(Student s1, Student s2, Student s3){
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;
        }
        public int tongSoSinhVienDo() {
            int soSinhVienDo = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getGpa() >= 1.5)
                    soSinhVienDo++;
            }
            return soSinhVienDo;
        }

        public int tongSoSinhVienTruot() {
            int soSinhVienTruot = 0;
            for (int i = 0; i < students.length ; i++){
                if(students[i].getGpa() < 1.5)
                    soSinhVienTruot++;
            }
            return soSinhVienTruot;
        }

        public void sinhVienGpaCaoNhat() {
            double max = students[0].getGpa();
            int maxIndex = 0;
            for (int i = 1; i < students.length; i++){
                if (max < students[i].getGpa()){
                    maxIndex = i;
                    max = students[i].getGpa();
                }
        }
            System.out.println("Sinh vien co Gpa cao nhat la: " + students[maxIndex].getName() + " voi Gpa la: " + max);
        }

        public void sinhVienGpaThapNhat() {
            double min = students[0].getGpa();
            int minIndex = 0;
            for (int i = 1; i < students.length; i++){
                if (min > students[i].getGpa()){
                    min = students[i].getGpa();
                    minIndex = i;
                }
            }
            System.out.println("sinh vien co Gpa thap nhat la: " + students[minIndex] + " voi Gpa la: " + min);
        }
}

