/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservationsystem;

/**
 *
 * @author RC_Student_lab
 */
public class BookingClass {
    //Declarations
    String code;
    String password;
    
    //method to ensure the code entered contains the correct format
    public boolean checkbookingcode(){
    if(code.contains("_")&&code.length()<=12){
        return true;
    }
    else{
        return false;
    }
    }
}