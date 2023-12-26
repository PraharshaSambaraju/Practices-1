public class OuterClass {
    
    private int outerVariable = 10;

    // Inner class
    public class InnerClass {
        
        public void displayInner() {
            System.out.println("Inner class method called");
            System.out.println("Outer variable from inner class: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObj = new OuterClass();
        
        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        
        // Calling the inner class method
        innerObj.displayInner();
    }
}