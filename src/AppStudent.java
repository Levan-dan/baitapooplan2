public class AppStudent {
    public static void main(String[] args) {
        String file_Path = "student.dat";
        String file = "ledoituong.dat";

        Student student = new Student(2300487, "Dan", "8/8/2005", 9.5);
        Student student4 = new Student(2300487, "Quynh", "8/8/2005", 9.5);
        Student student2 = new Student(2300489, "Khang", "8/12/2005", 5);
        Student student3 = new Student(2300486, "Huy", "9/8/2005", 8);
        Person student1 = new Student(2300488, "Dat", "2/9/2000", 9);

        //hien thi thong tin sinh vien
        System.out.println(student.toString());
        System.out.println(student1.toString());

//        them doi tương vao file và dọc du lieu tu file
        CRUDRectangle crudRectangle = new CRUDRectangle();
        crudRectangle.addStudentToFile(student4, file);
        System.out.println("du lieu trong file la:");
        System.out.println(crudRectangle.getStudentFromFile("student.dat"));

//them doi tượng vào mảng và hiẻn thị du lieu tu mang
        crudRectangle.addStudent(student);
       crudRectangle.addStudent(student3);
        crudRectangle.addStudent(student2);
        crudRectangle.addStudent(student4);
        crudRectangle.showList();

//thêm mang đôi tượng vào file
      crudRectangle.addStudentListToFile(crudRectangle.students, file_Path);

//doc mang doi tuong tu file
        System.out.println("doi tuong trong file la: ");
        Student[] students1 = crudRectangle.getAllStudentFromFile(file_Path);
        for(Student i : students1){
            if(i != null){
                System.out.println(i);
            }

        }
    }
}
