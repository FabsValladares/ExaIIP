package com.example.ExaIIP;

public class APIConexion {
    private static final String BASE_ENDPOINT = "http://192.168.1.2/contactos/";

    public static String extraerEndpoint() {
        return BASE_ENDPOINT;
    }
}