package pl.edu;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        GenerateNullPointer gen = new GenerateNullPointer();
        Scanner scanner = new Scanner(System.in);

        /* Task with generating NullPointer Exception */
//        try {
//            gen.generateNullPointer();
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException!");
//            e.printStackTrace();
//            System.out.println(e.toString());
//        }

        /* Task with generating NotEnoughMoneyException */
//        Account account = new Account("Jan Kowalski", 1000, "123456789");
//
//        try {
//            account.transfer(1500);
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("Exception:" + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception:" + e.getMessage());
//        } finally {
//            System.out.println("Your balance is:" + account.getBalance());
//        }

        /* Task with opening files and saving something */
//        File newFile = new File("newFile.txt");
//        Scanner fileReader = new Scanner(newFile);
//        PrintWriter writer = new PrintWriter(newFile);
//
//        writer.println("Lorem ipsum odor amet, consectetuer adipiscing elit.");
//        writer.println("Lorem ipsum dolor sit amet.");
//        writer.println("Hello Vistula");
//        writer.close();
//
//        while (fileReader.hasNextLine()) {
//            String line = fileReader.nextLine();
//            System.out.println(line);
//        }

        /* Task with bank accounts */
//                System.out.print("Enter the first three digits of the account number: ");
//                String userInput = scanner.nextLine().trim();
//
//                if (!userInput.matches("\\d{3}")) {
//                    System.out.println("Error: The input must consist of exactly three digits.");
//                    return;
//                }
//
//                try {
//                    String fileUrl = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
//
//
//                    HttpURLConnection connection = (HttpURLConnection) new URL(fileUrl).openConnection();
//                    connection.setRequestMethod("GET");
//
//                    if (connection.getResponseCode() != 200) {
//                        System.out.println("Error: Failed to fetch the file with bank data.");
//                        return;
//                    }
//
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                    String line;
//                    boolean found = false;
//
//
//                    while ((line = reader.readLine()) != null) {
//                        String[] parts = line.split("\t");
//
//                        if (parts.length > 1 && parts[0].trim().contains(userInput)) {
//                            System.out.println("Bank short number: " + parts[0].trim());
//                            System.out.println("Bank name: " + parts[1].trim());
//                            found = true;
//                            break;
//                        }
//                    }
//                    reader.close();
//                    if (!found) {
//                        System.out.println("No bank found for the entered digits.");
//                    }
//
//                } catch (Exception e) {
//                    System.out.println("An error occurred: " + e.getMessage());
//                    e.printStackTrace();
//                } finally {
//                    scanner.close();
//                }
            }
        }


