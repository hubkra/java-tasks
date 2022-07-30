package com.company;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        public static void main(String[] arg) throws JsonProcessingException, IOException {

            ObjectMapper objectMapper = new ObjectMapper();

            User userObject = new User("John", 21);
            String userJson = objectMapper.writeValueAsString(userObject);

            System.out.println(userJson);
    }
}
