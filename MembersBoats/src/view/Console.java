package view;

import model.Boat;

import java.util.Scanner;

public class Console {

    private int m_input;

    protected int getInputChar() {
        try {
            int c = System.in.read();
            while (c == '\r' || c =='\n') {
                c = System.in.read();
            }
            return c;
        } catch (java.io.IOException e) {
            System.out.println("" + e);
            return 0;
        }
    }


    public void Instructions(boolean start) {
        System.out.println("=======================================================");
        System.out.println("Welcome to the page of the boats club");
        if (start) {
            System.out.println("v to see the Compact List of members");
            System.out.println("s to see the Verbose List of members");
            System.out.println("m to see the info of a specific member");
            System.out.println("a to add a member");
            System.out.println("d to delete a member");
            System.out.println("c to change the info of a member");
            System.out.println("b to add a boat to a member");
            System.out.println("e to delete a boat to a member");
            System.out.println("f to change the info of a boat");
            System.out.println("q to quit");
        } else {
            System.out.println("q to quit");
        }
        System.out.println("-------------------------------------------------------");
    }

    public void collectEvents() {
        m_input = getInputChar();
    }

    public boolean wantsToSeeCompactListMembers() {
        return m_input == 'v';
    }

    public boolean wantsToSeeListMembers() {
        return m_input == 's';
    }

    public boolean wantsToSeeAMember() {
        return m_input == 'm';
    }

    public boolean wantsToAddMember() { return m_input == 'a';  }

    public boolean wantsToDeleteMember() {
        return m_input == 'd';
    }

    public boolean wantsToChangeInfoMember() {
        return m_input == 'c';
    }

    public boolean wantsToAddBoat() { return m_input == 'b'; }

    public boolean wantsToDeleteBoat() {
        return m_input == 'e';
    }

    public boolean wantsToChangeInfoBoat() { return m_input == 'f'; }

    public boolean wantsToQuit() {
        return m_input == 'q';
    }


    public String getName() {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Name of Member: ");
        String name = scanIn.next();
        String hello = name;
        return hello;
    }

    public int getNumberM() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Member: ");
        int number = scan.nextInt();
        return number;
    }

    public int getMemberID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID of Member: ");
        int memberID  = scanner.nextInt();
        return memberID;
    }

    /*public void printMembers(Iterable<Member> m) {
        System.out.println("" + m);
        System.out.println("\n");
    }*/


    public String getNameBoat() {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Name of Boat: ");
        String nameB = scanIn.next();
        return nameB;
    }

    public String getType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type of Boat: ");
        String type = scan.next();
        return type;
    }

    public int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Boat: ");
        int size  = scanner.nextInt();
        return size;
    }

}
