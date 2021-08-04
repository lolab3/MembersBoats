package model;

import java.util.LinkedList;

public class Member {

    LinkedList<Boat> m_boats;
    private String m_name;
    private int m_number;
    private int m_memberID;

    public Member(String a_name, int a_number, int a_memberID) {
        m_name = a_name;
        m_number = a_number;
        m_memberID = a_memberID;
        m_boats = new LinkedList<Boat>();
    }

    public String getName(){ return m_name; }
    public int getNumber(){ return m_number; }
    public int getMemberID(){ return m_memberID; }


    public Iterable<Boat> getBoat() { return m_boats; }

    public void getCompactBoats() {
        System.out.println("Number of Boats: " + m_boats.size());
    }

    public void getBoats() {
        if (m_boats.size() != 0) {
            System.out.println("Boats: ");
            for (Boat b : m_boats) {
                System.out.println(b.getNameB() + " " + b.getType() + " " + b.getSize());
            }
        }
    }

    public Boat AddBoat(Boat b) {
        m_boats.add(b);
        return b;
    }

    public void DeleteBoat(Boat a_boat) {
        for(Boat b : m_boats){
            if(a_boat.getNameB().equals(b.getNameB()))
                m_boats.removeIf(boat -> boat.getNameB().equalsIgnoreCase(a_boat.getNameB()));
        }

    }

    public Boat ChangeBoat(Boat a_boat, String a_newNameB, String a_newType, int a_newSize){
        DeleteBoat(a_boat);
        return AddBoat(new Boat(a_newNameB, a_newType, a_newSize));
    }


}
