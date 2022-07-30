package com.company;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) throws  JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John",21);
        String userJson = objectMapper.writeValueAsString(userObject);

        System.out.println(userJson); // {"name":"John","age":21}
    }
}
