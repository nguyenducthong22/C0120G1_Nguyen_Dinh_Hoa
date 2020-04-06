package Bai_Test.UserException;

public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws UserException {
        String regexName = "^[A-Z][a-z]+$";
        if (!name.matches(regexName)) {
            throw new UserException("Ten khong hop le");
        } else {
            this.name = name;
        }
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UserException {
        if (age < 18) {
            throw new UserException("tuoi phai lon hon 18");
        } else {
            this.age = age;
        }
    }
}
