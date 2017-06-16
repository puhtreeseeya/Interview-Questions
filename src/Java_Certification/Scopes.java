package Java_Certification;

/*
 * The point of this exercise is to exemplify scope.
 * In line 13 result is a instance variables basically comes into
 * existence when the class is instantiated.
 *
 * line 14, result is a local variables for the method shed
 * line 17, result has the scope of the if block.
* */

public class Scopes {
    //String result = "done";
    public void shed(boolean time) {
        String result = "done";
        if(time) {
            result = "done1";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scopes sc = new Scopes();
        sc.shed(true);
    }
}
