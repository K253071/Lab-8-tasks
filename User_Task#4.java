package Lab08Task04;

interface User {
    void login();
   // void uploadCourse();
}

class Student implements User {
    @Override
    public void login(){
        System.out.println("Student logged in successfully.");
    }
}

class Instructor implements User {
    @Override
    public void login (){
        System.out.println("Instructor logged in successfully.");
    }

    public void uploadCourse (){
        System.out.println("Course uploaded by the instructor.");
    }
}

class Main {
    public static void main(String[] args){
        User s = new Student();
        s.login();

        User i = new Instructor();
        i.login();
        ((Instructor)i).uploadCourse();
    }
}