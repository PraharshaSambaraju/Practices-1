public class StringConversionExample {
    public static void main(String[] args) {
        
        String originalString = "My Strings";

        // Converting String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Converting String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Displaying the results
        System.out.println("Original String: " + originalString);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}