package com.example.food_delivery.auth.utils;

public class NameUtility {

  public static String[] sanitizeName(String[] names) {

    System.out.println("calling name utility...");
    String[] returnNames = new String[names.length];

    for (int i = 0; i < names.length; i++) {
      String currentName = names[i].trim();
      if (currentName != null && !currentName.isEmpty()) {

        returnNames[i] = Character.toUpperCase(currentName.charAt(0)) + currentName.substring(1);
      }
    }
    return returnNames;

  }

}
