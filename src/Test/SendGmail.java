package Test;

import Library.Util;

public class SendGmail {
    public static void main(String[] args) {
        //credentials
        String userName = "ayamak1987@gmail.com";
        String password = "kjkljjkjj";


        // email
        String[] receiver = {
                "vrodi18@gmail.com"
        };


        String subject = "My message for you";
        String text = "BACHEMU TY TAKOI UDOD";

        int times = 2;
        int count=1;
        while (times > 0) {// send email multiple times

            for (String each : receiver) { //if you need to send email to multiple ppl

                System.out.println("Sending to: "+each );
                Util.sendEmails(userName, password, each, subject, text);
            }
            System.out.println(count++);
            times--;


        }
        System.out.println("Completed");

    }
}