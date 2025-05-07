package giris;

public class byte {
    public static void main(String[] args) {
      byte vByte = 100; // 1 byte = 8 bit = -128 to 127 
      short vShort = 1000; // 2 byte = 16 bit = -32768 to 32767
        int vInt = 100000; // 4 byte = 32 bit = -2147483648 to 2147483647
        long vLong = 100000L; // 8 byte = 64 bit = -9223372036854775808 to 9223372036854775807
        float vFloat = 10.5f; // 4 byte = 32 bit = 1.4E-45 to 3.4E+38
        double vDouble = 10.5; // 8 byte = 64 bit = 4.9E-324 to 1.7E+308
        char vChar = 'A'; // 2 byte = 16 bit = 0 to 65535
        boolean vBoolean = true; // 1 byte = 8 bit = true or false
        String vString = "Hello World"; // 2 byte = 16 bit = 0 to 65535
        // String is not a primitive data type, it is a reference data type
        // String is a class in Java, it is used to store a sequence of characters
      System.out.println("vByte = " + vByte);
}
