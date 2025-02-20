package az.edu.turing.module1.lesson03;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] weekPlanner = new String[7][2];
        fillTheMatrix(weekPlanner);
        while (true) {
            System.out.println("What do you want to do?");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.toLowerCase().startsWith("get")) {
                getDay(weekPlanner, input);
            } else if (input.toLowerCase().startsWith("schedule") || input.toLowerCase().startsWith("reschedule")) {
                scheduleDay(sc, weekPlanner, input);
            } else if (input.toLowerCase().startsWith("list")) {
                listTheWeek(weekPlanner);
            }
        }
    }

    public static void getDay(String[][] weekPlanner, String input) {
        String[] inputs = input.split(" ");
        String day = inputs[1];
        switch (day.trim().toLowerCase()) {
            case "monday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[0][1] + ".");
                break;
            case "tuesday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[1][1] + ".");
                break;
            case "wednesday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[2][1] + ".");
                break;
            case "thursday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[3][1] + ".");
                break;
            case "friday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[4][1] + ".");
                break;
            case "saturday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[5][1] + ".");
                break;
            case "sunday":
                System.out.println("Your plan for " + day.toLowerCase() + " is: " + weekPlanner[6][1] + ".");
                break;
            default:
                System.out.println("Sorry, i don't understand you");
                break;
        }
    }

    public static void scheduleDay(Scanner sc, String[][] weekPlanner, String input) {
        String[] inputs = input.split(" ");
        String day = inputs[1];
        System.out.println("What is your plan for " + day.toLowerCase() + "?");
        String task = sc.nextLine();
        switch (day.trim().toLowerCase()) {
            case "monday":
                weekPlanner[0][1] = task;
                break;
            case "tuesday":
                weekPlanner[1][1] = task;
                break;
            case "wednesday":
                weekPlanner[2][1] = task;
                break;
            case "thursday":
                weekPlanner[3][1] = task;
                break;
            case "friday":
                weekPlanner[4][1] = task;
                break;
            case "saturday":
                weekPlanner[5][1] = task;
                break;
            case "sunday":
                weekPlanner[6][1] = task;
                break;
            default:
                System.out.println("Sorry, i don't understand you");
                break;
        }
    }

    public static void listTheWeek(String[][] weekPlanner) {
        for (String[] strings : weekPlanner) {
            if (strings[1].equals("No plans")){
                System.out.println("You have no plans for " + strings[0].toLowerCase() + ".");
            }
            else{
                System.out.println("Plan for " + strings[0].toLowerCase() + " is: " + strings[1] + ".");
            }
        }
    }

    public static void fillTheMatrix(String[][] matrix) {
        matrix[0][0] = "Monday";
        matrix[1][0] = "Tuesday";
        matrix[2][0] = "Wednesday";
        matrix[3][0] = "Thursday";
        matrix[4][0] = "Friday";
        matrix[5][0] = "Saturday";
        matrix[6][0] = "Sunday";
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][1] = "No plans";
        }
    }

}