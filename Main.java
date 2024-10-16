package TSA2;

import java.util.Scanner;

public class Main {
    private GeneralServices[] genServ;
    private Regular[] regular;
    private int genServCount = 0, regularCount = 0;

    // Setting the overall Employee array size of the program
    public void InitializeArrays(int size) {
        genServ = new GeneralServices[size];
        regular = new Regular[size];
    }

    // Add an Employee Method
    public void AddEmployee() {
        Scanner input = new Scanner(System.in);
        int id, choice;
        String firstName, middleName, lastName, gender, birthday, department, status, role;

        System.out.println("What type of employee do you want to add?");
        System.out.print("[1] General Service || [2] Regular: ");
        choice = input.nextInt();
        input.nextLine(); 

        switch (choice) {
            // General Service Employee
            case 1:
                if (genServCount < genServ.length) { // Checks the array size based on the user's inputted 
                                                     // size before adding
                    System.out.println();
                    System.out.print("Enter ID of General Service Employee: ");
                    id = input.nextInt();
                    input.nextLine(); 

                    // Check for duplicate IDs among General Services Employees
                    for (int i = 0; i < genServCount; i++) {
                        if (genServ[i].id == id) {
                            System.out.println("Employee ID already exists please try again.");
                            return;
                        }
                    }

                    System.out.print("Enter First Name: ");
                    firstName = input.nextLine();
                    System.out.print("Enter Middle Name: ");
                    middleName = input.nextLine();
                    System.out.print("Enter Last Name: ");
                    lastName = input.nextLine();
                    System.out.print("Enter Gender: ");
                    gender = input.nextLine();
                    System.out.print("Enter Birthday: ");
                    birthday = input.nextLine();
                    System.out.print("Enter Department: ");
                    department = input.nextLine();
                    System.out.print("Enter Status (Contractual or Job Order): ");
                    status = input.nextLine();

                    genServ[genServCount] = new GeneralServices();
                    genServ[genServCount].id = id;
                    genServ[genServCount].setFirstName(firstName);
                    genServ[genServCount].setMiddleName(middleName);
                    genServ[genServCount].setLastName(lastName);
                    genServ[genServCount].setGender(gender);
                    genServ[genServCount].setBirthday(birthday);
                    genServ[genServCount].setDepartment(department);
                    genServ[genServCount].setStatus(status);
                    genServCount++;
                } else {
                    System.out.println("No space to add more Employees");
                }
                break;

            // Regular Employee
            case 2:
                if (regularCount < regular.length) { // Checks the array size based on the user's inputted 
                                                     // size before adding
                    System.out.println();
                    System.out.print("Enter ID of Regular Employee: ");
                    id = input.nextInt();
                    input.nextLine(); 
                    
                    // Check for duplicate IDs among Regular Employees
                    for (int i = 0; i < regularCount; i++) {
                        if (regular[i].id == id) {
                            System.out.println("Employee ID already exists please try again.");
                            return;
                        }
                    }

                    System.out.print("Enter First Name: ");
                    firstName = input.nextLine();
                    System.out.print("Enter Middle Name: ");
                    middleName = input.nextLine();
                    System.out.print("Enter Last Name: ");
                    lastName = input.nextLine();
                    System.out.print("Enter Gender: ");
                    gender = input.nextLine();
                    System.out.print("Enter Birthday: ");
                    birthday = input.nextLine();
                    System.out.print("Enter Department: ");
                    department = input.nextLine();
                    System.out.print("Enter Status (Regular or Contractual): ");
                    status = input.nextLine();
                    System.out.print("Enter Role (Managerial, Rank or File): ");
                    role = input.nextLine();

                    regular[regularCount] = new Regular();
                    regular[regularCount].id = id;
                    regular[regularCount].setFirstName(firstName);
                    regular[regularCount].setMiddleName(middleName);
                    regular[regularCount].setLastName(lastName);
                    regular[regularCount].setGender(gender);
                    regular[regularCount].setBirthday(birthday);
                    regular[regularCount].setDepartment(department);
                    regular[regularCount].setStatus(status);
                    regular[regularCount].setRole(role);
                    regularCount++;
                } else {
                    System.out.println("No space to add more Employees");
                }
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    
    // Edit Employee Record Method
    public void EditEmployeeRecord() {
        Scanner input = new Scanner(System.in);
        int searchId, type, choice;
        String firstName, middleName, lastName, gender, birthday, department, status, role;
        
        // Asks the type of employee that will be edited
        System.out.println("Enter the type of Employee that you want to edit");
        System.out.print("[1] General Service || [2] Regular: ");
        type = input.nextInt();
        System.out.print("Enter the Employee's ID you want to edit: ");
        searchId = input.nextInt();
        input.nextLine(); 

        switch (type) {
            case 1:
                for (int i = 0; i < genServCount; i++) {
                    if (genServ[i].id == searchId) {
                        // Used to ask the user what part of the record information will be edited
                        while (true) {
                            System.out.println();
                            System.out.println("Editing Employee ID " + genServ[i].id + ":");
                            System.out.println("Select the Part to edit:");
                            System.out.println("[1] First Name");
                            System.out.println("[2] Middle Name");
                            System.out.println("[3] Last Name");
                            System.out.println("[4] Gender");
                            System.out.println("[5] Birthday");
                            System.out.println("[6] Department");
                            System.out.println("[7] Status");
                            System.out.println("[0] Exit Editing");
                            choice = input.nextInt();
                            input.nextLine(); 
    
                            switch (choice) {
                                case 1:
                                    System.out.print("Enter New First Name: ");
                                    firstName = input.nextLine();
                                    genServ[i].setFirstName(firstName);
                                    break;
                                case 2:
                                    System.out.print("Enter New Middle Name: ");
                                    middleName = input.nextLine();
                                    genServ[i].setMiddleName(middleName);
                                    break;
                                case 3:
                                    System.out.print("Enter New Last Name: ");
                                    lastName = input.nextLine();
                                    genServ[i].setLastName(lastName);
                                    break;
                                case 4:
                                    System.out.print("Enter New Gender: ");
                                    gender = input.nextLine();
                                    genServ[i].setGender(gender);
                                    break;
                                case 5:
                                    System.out.print("Enter New Birthday: ");
                                    birthday = input.nextLine();
                                    genServ[i].setBirthday(birthday);
                                    break;
                                case 6:
                                    System.out.print("Enter New Department: ");
                                    department = input.nextLine();
                                    genServ[i].setDepartment(department);
                                    break;
                                case 7:
                                    System.out.print("Enter New Status (Regular or Contractual): ");
                                    status = input.nextLine();
                                    genServ[i].setStatus(status);
                                    break;
                                case 0:
                                    System.out.println("Exiting edit mode");
                                    return; 
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                            }
                            System.out.println("Employee record updated");
                        }
                    }
                }
                System.out.println("Employee with ID " + searchId + " not found.");
                break;
    
            case 2:
                for (int i = 0; i < regularCount; i++) {
                    if (regular[i].id == searchId) {
                        // Used to ask the user what part of the record information will be edited
                        while (true) {
                            System.out.println();
                            System.out.println("Editing Employee ID " + regular[i].id + ":");
                            System.out.println("Select the Part to edit:");
                            System.out.println("[1] First Name");
                            System.out.println("[2] Middle Name");
                            System.out.println("[3] Last Name");
                            System.out.println("[4] Gender");
                            System.out.println("[5] Birthday");
                            System.out.println("[6] Department");
                            System.out.println("[7] Status");
                            System.out.println("[8] Role");
                            System.out.println("[0] Exit Editing");
                            choice = input.nextInt();
                            input.nextLine(); 
    
                            switch (choice) {
                                case 1:
                                    System.out.print("Enter New First Name: ");
                                    firstName = input.nextLine();
                                    regular[i].setFirstName(firstName);
                                    break;
                                case 2:
                                    System.out.print("Enter New Middle Name: ");
                                    middleName = input.nextLine();
                                    regular[i].setMiddleName(middleName);
                                    break;
                                case 3:
                                    System.out.print("Enter New Last Name: ");
                                    lastName = input.nextLine();
                                    regular[i].setLastName(lastName);
                                    break;
                                case 4:
                                    System.out.print("Enter New Gender: ");
                                    gender = input.nextLine();
                                    regular[i].setGender(gender);
                                    break;
                                case 5:
                                    System.out.print("Enter New Birthday: ");
                                    birthday = input.nextLine();
                                    regular[i].setBirthday(birthday);
                                    break;
                                case 6:
                                    System.out.print("Enter New Department: ");
                                    department = input.nextLine();
                                    regular[i].setDepartment(department);
                                    break;
                                case 7:
                                    System.out.print("Enter New Status (Regular or Contractual): ");
                                    status = input.nextLine();
                                    regular[i].setStatus(status);
                                    break;
                                case 8:
                                    System.out.print("Enter New Role (Managerial, Rank or File): ");
                                    role = input.nextLine();
                                    regular[i].setRole(role);
                                    break;
                                case 0:
                                    System.out.println("Exiting edit mode");
                                    return; 
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                            }
                            System.out.println("Employee record updated");
                        }
                    }
                }
                System.out.println("Employee with ID " + searchId + " not found.");
                break;
    
            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }

    // Delete an Employee Record
    public void DeleteEmployeeRecord() {
        Scanner input = new Scanner(System.in);
        int searchId, type;

        System.out.println();
        System.out.println("Enter the type of Employee that you want to delete");
        System.out.print("[1] General Service || [2] Regular: ");
        type = input.nextInt();
        System.out.print("Enter the Employee's ID you want to delete: ");
        searchId = input.nextInt();

        switch (type) {
            case 1:
                for (int i = 0; i < genServCount; i++) {
                    if (genServ[i].id == searchId) {
                        // Shift records to the left to remove the employee record based on ID
                        for (int j = i; j < genServCount - 1; j++) {
                            genServ[j] = genServ[j + 1];
                        }
                        genServ[genServCount - 1] = null; // Removes the record once it goes to the end of the array
                        genServCount--;
                        System.out.println("General Service Employee with ID " + searchId + " has been deleted.");
                        return;
                    }
                }
                System.out.println("Employee with ID " + searchId + " not found in General Services.");
                break;

            case 2:
                for (int i = 0; i < regularCount; i++) {
                    if (regular[i].id == searchId) {
                         // Shift records to the left to remove the employee record based on ID
                        for (int j = i; j < regularCount - 1; j++) {
                            regular[j] = regular[j + 1];
                        }
                        regular[regularCount - 1] = null; // Removes the record once it goes to the end of the array
                        regularCount--;
                        System.out.println("Regular Employee with ID " + searchId + " has been deleted.");
                        return;
                    }
                }
                System.out.println("Employee with ID " + searchId + " not found in Regular Employees.");
                break;

            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }

    // View an Employee Record
    public void ViewEmployeeRecord() {
        Scanner input = new Scanner(System.in);
        int searchId, type;

        System.out.println();
        System.out.println("Enter the type of Employee that you are looking for ");
        System.out.print("[1] General Service || [2] Regular: ");
        type = input.nextInt();
        System.out.print("Enter the Employee's ID you want to view the record of: ");
        searchId = input.nextInt();

        switch (type) {

            // Looks at General Services Record if the user wants to look for a General Service Employee
            case 1:
                for(int i = 0; i < genServCount; i++) {
                    if(searchId == genServ[i].id) {
                    System.out.println();
                    System.out.println("General Service Employee of ID " + genServ[i].id + ":");
                    System.out.println("Name: " + genServ[i].getFullName());
                    System.out.println("Gender: " + genServ[i].getGender());
                    System.out.println("Birthday: " + genServ[i].getBirthday());
                    System.out.println("Department: " + genServ[i].getDepartment());
                    System.out.println("Status: " + genServ[i].getStatus());
                    }
                }
                break;

            // Looks at Regulars Record if the user wants to look for a Regular Employee
            case 2:
                for(int i = 0; i < regularCount; i++) {
                    if(searchId == regular[i].id) {
                    System.out.println();
                    System.out.println("General Service Employee of ID " + regular[i].id + ":");
                    System.out.println("Name: " + regular[i].getFullName());
                    System.out.println("Gender: " + regular[i].getGender());
                    System.out.println("Birthday: " + regular[i].getBirthday());
                    System.out.println("Department: " + regular[i].getDepartment());
                    System.out.println("Status: " + regular[i].getStatus());
                    System.out.println("Role: " + regular[i].getRole());
                    }
                }
                break;
            default:
            System.out.println("Invalid Input. Please try again.");
                break;
        }

    }

    // Display all Employee Records Method
    public void DisplayAllEmployee() {
        System.out.println();
        System.out.println("--------- All Employee Records ---------");
        for (int i = 0; i < genServCount; i++) {
            System.out.println();
            System.out.println("General Services Employee #" + (i + 1) + ": ");
            System.out.println("ID: " + genServ[i].id);
            System.out.println("Name: " + genServ[i].getFullName());
            System.out.println("Gender: " + genServ[i].getGender());
            System.out.println("Birthday: " + genServ[i].getBirthday());
            System.out.println("Department: " + genServ[i].getDepartment());
            System.out.println("Status: " + genServ[i].getStatus());
        }
        for (int i = 0; i < regularCount; i++) {
            System.out.println();
            System.out.println("Regular Employee #" + (i + 1) + ": ");
            System.out.println("ID: " + regular[i].id);
            System.out.println("Name: " + regular[i].getFullName());
            System.out.println("Gender: " + regular[i].getGender());
            System.out.println("Birthday: " + regular[i].getBirthday());
            System.out.println("Department: " + regular[i].getDepartment());
            System.out.println("Status: " + regular[i].getStatus());
            System.out.println("Role: " + regular[i].getRole());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int choice, size;

        // Input the total amount of records the system can hold for both General Service and Regular
        System.out.print("How many Employee Records can the System hold? ");
        size = input.nextInt();
        main.InitializeArrays(size); 

        do {
            // Menu for the system
            System.out.println();
            System.out.println("--------- Human Resources Management System ---------");
            System.out.println("[1] Add a New Employee");
            System.out.println("[2] Edit an Employee Record");
            System.out.println("[3] Delete an Employee Record");
            System.out.println("[4] View an Employee Record");
            System.out.println("[5] Display All Employee");
            System.out.print(":: ");
            choice = input.nextInt();

            // Switch statement to handle operations
            switch (choice) {
                case 1:
                    main.AddEmployee(); 
                    break;
                case 2:
                    main.EditEmployeeRecord();
                    break;
                case 3:
                    main.DeleteEmployeeRecord();
                    break;
                case 4:
                    main.ViewEmployeeRecord();
                    break;
                case 5:
                    main.DisplayAllEmployee();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (true);
    }
}
