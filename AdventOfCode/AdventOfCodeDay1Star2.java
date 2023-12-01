// package AdventOfCode;

// import java.util.ArrayList;
// import java.io.File;
// import java.util.Scanner;

// public class AdventOfCodeDay1Star2 {
//     public static void main(String[] args) throws Exception{
//         File day1Star1File = new File("AdventOfCodeDay1Star1.txt");
//         System.out.println(day1Star1File.exists());
//         Scanner sc = new Scanner(day1Star1File);

//         ArrayList<String> arrStrings = new ArrayList<String>();
//         String[] numNames = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         String[] numNames2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}



//         while(sc.hasNextLine()) {
//             String current = sc.nextLine();
//             arrStrings.add(current);
//         }


//         int finalSum = 0;

//         int amOfCycle = 0;

//         for (int i = 0; i < arrStrings.size(); i++) {
//             String currentNum = "";
//             String current = arrStrings.get(i);
//             ArrayList<String> currentArrNames = new ArrayList<>();

//             amOfCycle ++;


//             //First int
//             for (int x = 0; x < current.length(); x++) {
//                 String smallestInt = "";
//                 int indexOfSmallest = 0;

//                 if (current.indexOf(numNames[x]) != -1) {

//                 }
                
//                 if (Character.isDigit(current.charAt(x))) {
//                     currentNum += current.charAt(x);
//                     break;
//                 }
//             }

//             for (int x = current.length() - 1; x > -1; x--) {
//                 if (Character.isDigit(current.charAt(x))) {
//                     currentNum += current.charAt(x);
//                     break;
//                 }
//             }

//             // System.out.println(currentNum);

//             finalSum += Integer.parseInt(currentNum);
//             System.out.println(finalSum);
            

//         }
//         System.out.println(amOfCycle);

//     }
// }
