//                        ----------------------------------------------Polymorphism in java------------------------------------------- 
//                                                        ---------------------------- Type 2------------------------------ 
//                                                  polymorphism type2---------its -------------method overridding --------its run time polymorphism


class student{
    void a(){
        System.out.println("Good");
    }
}
class teacher extends student{
     void a(){
        System.out.println("Morning");
    }
}
class sir extends student{
     void a(){
        System.out.println("Sir");
    }
}
class Main{
    public static void main(String[] args){
        
        student z=new student();
        z.a();
        student xe=new teacher();
        xe.a();
        student aw=new sir();
        aw.a();
        
        
        
    }
}