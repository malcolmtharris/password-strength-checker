package org.example;

public class PasswordChecker {

    public boolean hasMinLength(String password) {
        return password.length() >= 8;

    }

    public boolean hasUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialChar(String password) {
        String specials = "!@#$%^&*()_-+=";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (specials.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }

    public String rateStrength(String password) {
        int score = 0;

        if (hasMinLength(password)) score++;
        if (hasUppercase(password)) score++;
        if (hasDigit(password)) score++;
        if (hasSpecialChar(password)) score++;

        if (score <= 1){
            return "Weak";
        } else if (score <= 3) {
           return "Medium";
        } else {
            return "Strong";
        }
    }
}
