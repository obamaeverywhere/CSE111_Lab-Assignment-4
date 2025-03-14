// coding task 6

public class Teacher {
    public String name;
    public String initials;
    public String [] courses=new String[3];
    public int cnt;
    public Teacher(String n, String i){
        name = n;
        initials = i;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course c){
        if(cnt<3)
        courses[cnt++]=c.courseName;
    }
    public void printDetail() {
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initials);
        System.out.println("List of courses: ");
        for(int i=0;i<cnt;i++)
        System.out.println(courses[i]);
    }
}
