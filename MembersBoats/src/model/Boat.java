package model;

import java.util.LinkedList;

public class Boat {

    private String m_name;
    private String m_type;
    private int m_size;

    public String getNameB(){ return m_name; }
    public String getType(){ return m_type; }
    public int getSize(){ return m_size; }


    public Boat(String a_name, String a_type, int a_size) {
        m_name = a_name;
        m_type = a_type;
        m_size = a_size;
    }


}
