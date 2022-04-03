package com.bridgelabz;

public class UserRegistration {

    UserInformation storePattern =new UserInformation();
    public void validateFirstName(String firstName){
        storePattern.setFirstNamePattern("^[A-Z]{1}[a-z]{3,}$");
        String first= storePattern.getFirstNamePattern();
        storePattern.validatingInput(firstName,first,"FirstName");
    }
    public void validateLastName(String lastName){
        storePattern.setLastNamePattern("^[A-Z]{1}[a-z]{3,}$");
        String last= storePattern.getLastNamePattern();
        storePattern.validatingInput(lastName,last,"LastName");
    }

    public void validateEmail(String email){
        storePattern.setEmailPattern("^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$");
        String mail= storePattern.getEmailPattern();
        storePattern.validatingInput(email,mail,"Email");
    }
    public void validateMobNumber(String number){
        storePattern.setMobNumPattern("^[0-9]{2}\s?[0-9]{10}$");
        String mobPattern= storePattern.getMobNumPattern();
        storePattern.validatingInput(number,mobPattern,"Mobile Number");
    }
    public void validatePassword(String password){
        storePattern.setPasswordPattern("(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*");
        String passPattern= storePattern.getPasswordPattern();
        storePattern.validatingInput(password,passPattern,"Password");
    }
}