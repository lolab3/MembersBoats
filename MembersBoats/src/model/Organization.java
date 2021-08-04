package model;

import java.util.ArrayList;
import java.util.Random;

public class Organization {
    ArrayList<Member> m_members = new ArrayList<>();

    public int RandomID() {
        Random rand = new Random();
        int random = rand.nextInt((9999 - 1) + 1) + 1;
        return random;
    }

    public Member addNewMember(String a_name, int a_personalNumber, int a_memberID){
        Member m  = new Member(a_name, a_personalNumber, a_memberID);
        m_members.add(m);
        return m;
    }

    public void getCompactMembers() {
        for(Member m : m_members){
            System.out.println("-------------------------------------------------------");
            System.out.println(m.getName() + " " + m.getMemberID());
            m.getCompactBoats();
        }
    }

    public void getMembers() {
        for(Member m : m_members){
            System.out.println("-------------------------------------------------------");
            System.out.println(m.getName() + " " + m.getNumber() + " " + m.getMemberID());
            m.getBoats();
        }
    }
    public void getAMember(int a_ID) {
        for(Member m : m_members){
            Integer val1 = m.getMemberID();
            Integer val2 = a_ID;
            if(val1.equals(val2))
                System.out.println("-------------------------------------------------------");
                System.out.println(m.getName() + " " + m.getNumber() + " " + m.getMemberID());
                m.getBoats();
        }
    }

    public Member changeMember(Member a_member, String a_newName, int a_newPersonalNumber, int a_newMemberID){
        removeMember(a_member);
        return addNewMember(a_newName, a_newPersonalNumber, a_newMemberID);
    }

    public void removeMember(Member a_member) {
        m_members.removeIf(member -> member.getName().equalsIgnoreCase(a_member.getName()));
    }


    public void addNewBoat(String a_nameM, String a_name,String a_type,int a_size){
        for(Member m : m_members){
            if(m.getName().equals(a_nameM))
                m.AddBoat(new Boat (a_name,a_type, a_size));
        }
    }

    public void deleteBoat(int a_ID, String a_name,String a_type,int a_size){
        Integer val2 = a_ID;
        for(Member m : m_members){
            Integer val1 = m.getMemberID();
            if(val1.equals(val2))
                m.DeleteBoat(new Boat(a_name,a_type, a_size));
        }
    }

    public void changeBoat(int a_ID, Boat a_B, String a_nameB, String a_type,int a_size){
        Integer val2 = a_ID;
        for(Member m : m_members){
            Integer val1 = m.getMemberID();
            if(val1.equals(val2))
                m.ChangeBoat(a_B, a_nameB, a_type, a_size);
        }
    }
}
