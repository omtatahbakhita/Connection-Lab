/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionlab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bakhita
 */
public class CrudOperations {
    private int student_no;
    private String first_name;
    private String last_name;
    private String gender;
    private String programme;
//Getters and setters
    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    //methods
    public int proccessgender (String g){
        if(g.equalsIgnoreCase("male")){
            return 1;
        }
        return 0;
    }
    public boolean save(){
        PreparedStatement pst = null;        
        Connection con = new DBConnector().connector();
        try{
            pst = con.prepareStatement("INSERT INTO student_details(student_id,first_name,last_name,gender,degree_programme) VALUES(?,?,?,?,?)");
            pst.setInt(1,getStudent_no());
            pst.setString(2, getFirst_name());
            pst.setString(3, getLast_name());
            pst.setInt(4, proccessgender(getGender()));
            pst.setString(5, getProgramme());
            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println("Error" + e.getMessage());
            return false;
        }


    }
    public boolean removeRecord(){
        return true;
    }
    public boolean updateRecord(){
        return true;
    }
    
}
