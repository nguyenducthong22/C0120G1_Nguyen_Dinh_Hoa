//import com.google.gson.Gson;
//public class Student {
//    private int id;
//    private String name;
//    public Student() {
//    }
//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public static void main(String[] args) {
//        //Download thư viện GJson tai: http://www.java2s.com/Code/Jar/g/Downloadgson222jar.htm
//        String str = "{'id':1;'name':'Hoa Gia'`}";
//        Gson gson = new Gson();
//        Student p = gson.fromJson(str, Student.class);
//        System.out.println(p.getId());
//        System.out.println(p.getName());
//    }
//}