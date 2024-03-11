package view;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import view.Screen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 *
 * @author AD
 */
public class Handle {


//Driver
    public static boolean handleIdPerson(String id){
        if (!id.matches("[0-9]{12}")) {
        return false;
    } else {
        return true;
    }
    }

    public static boolean handleAccommodation(String accommodation) {
        if(accommodation == null) {
            return false;
        }
        if(Character.isSpaceChar(accommodation.charAt(0)) || Character.isSpaceChar(accommodation.charAt(accommodation.length()-1))){
            return false;
        }
        if (!accommodation.matches("[0-9a-zA-Z-]"))
        return false;

        return true;
    }

    public static boolean handleDrivingLicense(String license){
        boolean flag = false;
        String[] l = license.split(",");
    for (String lValue : l) {
        switch(lValue.trim()) {
            case "A1":
                flag = true;
                break;
            case "A2":
                flag = true;
                break;
            case "A3":
                flag = true;
                break;
            case "A4":
                flag = true;
                break;
            case "B1":
                flag = true;
                break;
            case "B2":
                flag = true;
                break;
            case "C":
                flag = true;
                break;
            case "D":
                flag = true;
                break;
            case "E":
                flag = true;
                break;
            case "F":
                flag = true;
                break;
            default:
                flag = false;
                break;
        }
        if (!flag) {
            break;
        }
        }
        return flag;
    }

    public static boolean handleSalary(double salary) {
        if(salary < 0) {
            return false;
        }
        return true;
    }

    public static boolean handleDate(String date) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime dateL = LocalDateTime.parse(date, formatter);
            return true;
        } catch(DateTimeParseException e) {
            System.out.println("Wrong format Date, please reEnter date: ");
            return false;
        }
    }

    public static boolean handleDriverStatus(String driverStatus){
        switch(driverStatus){
            case "Available":
                return true;
            case "Unavailable":
                return true;
            default:
                return false;
        }
    }

    public static boolean handleDriverName(String driverName) {
        if(driverName == null){
            return false;
        }
        for (int i = 0; i < driverName.length(); i++) {
        char ch = driverName.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
    }
    return true;
    }

    public static boolean handlePhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("0[0-9]{9}")) {
        return false;
    } else {
        return true;
    }
    }

//Person + Customer
    public static boolean handleName(String name) {
        if(name == null){
            return false;
        }
        if(Character.isSpaceChar(name.charAt(0)) || Character.isSpaceChar(name.charAt(name.length()-1))){
            return false;
        }
        return true;
    }

//Car
    public static boolean handleCarStatus(String carStatus) {
        switch(carStatus) {
            case "is maintained":
                return true;
            case "running":
                return true;
            case "was broken":
                return true;
            default:
                return false;
       }
    }

    public static boolean handleNumberPlates(String numberPlates) {
        if (numberPlates == null || numberPlates.length() != 9) {
        return false;
    }
    for (int i = 0; i < numberPlates.length(); i++) {
        char ch = numberPlates.charAt(i);
        if (!Character.isLetterOrDigit(ch) && ch != '-') {
            return false;
        }
    }
    return true;
    }

    public static boolean handleMaintainanceSchedule(String maintainenceSchedule) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime maintainenceSchedule1 = LocalDateTime.parse(maintainenceSchedule, formatter);
            return true;
        } catch(DateTimeParseException e) {
            System.out.println("Wrong format Date, please reEnter date: ");
            return false;
        }
    }

    public static boolean handleType(String type) {
        if(type == null){
            return false;
        }
        for (int i = 0; i < type.length(); i++) {
        char ch = type.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
    }
    return true;
    }

    public static boolean handleCompanyCar(String companyCar) {
        if(companyCar == null){
            return false;
        }
        for (int i = 0; i < companyCar.length(); i++) {
        char ch = companyCar.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
    }
    return true;
    }

    public static boolean handleYearOfManufacture(String yearOfManufacture) {
         try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
            LocalDateTime yearOfManufacture1 = LocalDateTime.parse(yearOfManufacture, formatter);
            return true;
        } catch(DateTimeParseException e) {
            System.out.println("Wrong format Date, please reEnter date: ");
            return false;
        }
    }
//Booking
    public static boolean handleBookingDate(String bookingDate) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime bookingDateL = LocalDateTime.parse(bookingDate, formatter);
            return true;
        } catch(DateTimeParseException e) {
            System.out.println("Wrong format Date, please reEnter date: ");
            return false;
        }
    }
    public static boolean handleIDBooking(String IDbooking) {
        if( !IDbooking.matches("[0-9]")){
            return false;
        }
        else return true;
    }

    public static boolean handleStart(String start) {
        if(start == null){
            return false;
        }
        for (int i = 0; i < start.length(); i++) {
        char ch = start.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
    }
    return true;
    }

    public static boolean handleDestination(String destination) {
        if(destination == null){
            return false;
        }
        for (int i = 0; i < destination.length(); i++) {
        char ch = destination.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
    }
    return true;
    }

    public static boolean handleDistance(int distance) {
        if(distance < 0) {
            return false;
        }
            return true;
        }
}
