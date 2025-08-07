package com.example.builder;

public class Main {

	public static void main(String[] args) {
		
		HTTPRequest request = new HTTPRequest.Builder("https://api.example.com", "POST")
                .body("{\"name\": \"Srishti\"}")
                .contentType("application/json")
                .timeout(5000)
                .build();

        System.out.println(request);

	}

}
