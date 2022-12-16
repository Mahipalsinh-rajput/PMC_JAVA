/*
*
* Inner Class
* Member Class
* Anonymous Class
*
*
*/

/*
 *  Inner Class
 */

// class Outer{

//     int a;
//     public void show() {
//         System.out.println("Outer class here....")
//     }

//     class Inner{
//         public void display(){
//             System.out.println("Inner class here....")
//         }
//     }
// }

// public class InnerDemo{
//     public static void main(String[] args) {
        
//         Outer obj = new Outer();
//         obj.show();

//         Outer.Inner obj1 = obj.new Inner();
//         obj1.display();
//     }
// }





/*
 *  Member Classs
 */

//  class Outer{

//     static int a;
//     public static void show() {
//         System.out.println("Outer class here....")
//     }

//     static class Inner{
//         public void display(){
//             System.out.println("Inner class here....")
//         }
//     }
// }

// public class InnerDemo{
//     public static void main(String[] args) {
        
//         Outer obj = new Outer();
//         obj.show();

//         Outer.Inner obj1 = new Outer.Inner();
//         obj1.display();
//     }
// }





/*
 *  Annonymous Inner Class
 */

// class A{
//     public void show(){
//         System.out.println("in A...");
//     }
// }

// public class AnnonymousEx{
//     public static void main(String[] args) {
        
//         A obj = new A()
//         {
//             public void show(){
//                 System.out.println("in B...");      // Annonymous Class.....
//             }
//         };
//         obj.show();
//     }
// }