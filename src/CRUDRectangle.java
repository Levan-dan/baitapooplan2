import java.io.*;

public class CRUDRectangle {
    Student[] students;
    private static int numberOfStudent;

    public CRUDRectangle() {
        students = new Student[100];
        numberOfStudent = 0;
    }

    public boolean addStudent(Student student) {
        if (numberOfStudent < students.length) {
            students[numberOfStudent] = student;
            numberOfStudent++;
            return true;
        } else {
            return false;
        }
    }

    public void showList() {
        for (Student i : students) {
            if (i != null) {
                System.out.println(i);
            }

        }
    }

    public boolean addStudentToFile(Student objStudent, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objStudent);
            objectOutputStream.flush();
            System.out.println("ghi doi tuong thanh cong");
            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Student getStudentFromFile(String filename) {
        Student object = null;  // Khởi tạo giá trị ban đầu cho object
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            object = (Student) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + filename, e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading the file: " + filename, e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class Student not found", e);
        }
        return object;
    }


    public boolean addStudentListToFile(Student[] listStudent, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listStudent);
            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Student[] getAllStudentFromFile(String filename) {
        Student[] student = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student[]) objectInputStream.readObject();
            return student;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

