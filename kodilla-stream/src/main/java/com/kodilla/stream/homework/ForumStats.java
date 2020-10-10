package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averagePostUnderForty = UserRepository.getUsersList()
                .stream()
                .filter(u->u.getAge()< 40)
                .mapToInt(u->u.getNumberOfPosts())
                .average()
                .orElse(0.0);
        System.out.println("Average number of post for user below 40 years old: " + averagePostUnderForty);

        double averagePostAboveForty = UserRepository.getUsersList()
                .stream()
                .filter(u->u.getAge() >= 40)
                .mapToInt(u->u.getNumberOfPosts())
                .average()
                .orElse(0.00);
        System.out.println("Average number of post for user equal and above 40 years old: " + averagePostAboveForty);
    }
}
