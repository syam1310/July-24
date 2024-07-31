package org.july_24.codeforces;

/*
Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.

Input
The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.

        Output
If Vasya managed to say hello, print "YES", otherwise print "NO".

*/


import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String target = "hello";
        int targetIndex = 0;

        for (char c : s.toCharArray()) {
            if (c == target.charAt(targetIndex)) {
                targetIndex++;
            }

            if (targetIndex == target.length()) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println(
                "No"
        );
    }
}
