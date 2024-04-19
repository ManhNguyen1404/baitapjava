/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaptrenlop;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author manhn
 */
public class Baitaptrenlop {
    
    public static void main(String[] args) {
        // Bạn có thể đưa logic của ứng dụng của bạn vào đây
        // Ví dụ: 
        // Baitaptrenlop baitap = new Baitaptrenlop();
        // baitap.sendEmail("recipient@example.com", "Test Subject", "Test Body");
    }

    public boolean sendEmail(String recipient, String subject, String body) {
        if (isValidEmail(recipient)) {
            // Logic to send email
            System.out.println("Email sent to: " + recipient);
            System.out.println("Subject: " + subject);
            System.out.println("Body: " + body);
            return true;
        } else {
            System.out.println("Invalid email address: " + recipient);
            return false;
        }
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
