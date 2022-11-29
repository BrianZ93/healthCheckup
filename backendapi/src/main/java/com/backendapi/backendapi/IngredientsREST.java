package com.backendapi.backendapi;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class IngredientsREST {

    // Checks if there is a current ingredients file
    public static void createFile(String[] args) {

        // create a file object fort he current location
        File file = new File("ingredients.json");

        try {

            // try to create a file based on the object
            boolean fileCreated = file.createNewFile();
            if (fileCreated) {
                System.out.println("Ingredients file created");
            } else {
                System.out.println("Ingredients file already exists");
                readFile(args);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    // TODO - iterate through the json object to pull specific information from the
    // JSON file

    // Read the json file
    private static void readFile(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("ingredients.json")) {

            Object obj = jsonParser.parse(reader);

            JSONArray ingredientsList = (JSONArray) obj;
            System.out.println(ingredientsList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
