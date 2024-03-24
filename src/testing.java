import java.util.Optional;

public class testing {

  static int a =100 ; // is a class or static variable
  public int salary(){
      int mysalary = 10000+2000+15000;
      mysalary  =  mysalary+a; //we can use a because a is static variable
     // mysalary = mysalary +b; // we can't use b because be is instance variable
      return mysalary ; // mysalary variable is a local variable

  }
    public static void main (String []args){
      int b = 200; // b is instance variable
        System.out.println(a);
        System.out.println(b);

        // TO use local variable we have to create object
        testing obj = new testing ();
        System.out.println(obj.salary());
       // here i is local variable
        for (int i =1 ; i<=5;i++){
            System.out.println(i);
            System.out.println(b); // b is instance variable i can use here
        }

    }
}
