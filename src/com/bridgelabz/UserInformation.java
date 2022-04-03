package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    private String firstNamePattern;
    private String lastNamePattern;
    private String emailPattern;
    private String mobNumPattern;
    private String passwordPattern;

    public void setFirstNamePattern(String firstNamePattern) {
        this.firstNamePattern = firstNamePattern;
    }

    public String getFirstNamePattern() {   return firstNamePattern;    }

    public String getLastNamePattern() {    return lastNamePattern;    }

    public void setLastNamePattern(String lastNamePattern) {
        this.lastNamePattern = lastNamePattern;
    }

    public String getEmailPattern() {
        return emailPattern;
    }

    public void setEmailPattern(String emailPattern) {  this.emailPattern = emailPattern;   }

    public String getMobNumPattern() {
        return mobNumPattern;
    }

    public void setMobNumPattern(String mobNumPattern) {
        this.mobNumPattern = mobNumPattern;
    }

    public String getPasswordPattern() {    return passwordPattern; }

    public void setPasswordPattern(String passwordPattern) {    this.passwordPattern = passwordPattern; }

    public void validatingInput(String input, String checkPattern, String option){
        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Entered "+option+ " : " +input+" is valid");
        else
            System.out.println("Entered "+option+ " : " +input+" is invalid");
    }
    public static void validateEmailsList(String[] emails) {
        for(int i=0; i< emails.length;i++){
            Pattern pattern = Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
            Matcher matcher = pattern.matcher(emails[i]);
            if (matcher.matches())
                System.out.println(emails[i]+ " : This Email id is valid");
            else
                System.out.println(emails[i]+ " : This Email id is Invalid");
        }
    }
}