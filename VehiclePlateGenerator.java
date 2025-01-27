// Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number.

import java.util.Random;
public class VehiclePlateGenerator {
    public static String generatePlateNumber() {
        Random random = new Random();
        StringBuilder plateNumber = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            plateNumber.append(letter);
        }       
        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            plateNumber.append(digit);
        }       
        return plateNumber.toString();
    }
    public static void main(String[] args) {
        String plateNumber = generatePlateNumber();
        System.out.println("Generated Plate Number: " + plateNumber);
    }
}
