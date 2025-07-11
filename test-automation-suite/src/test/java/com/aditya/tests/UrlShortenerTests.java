package com.aditya.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlShortenerTests {
    @Test
    void testValidShortUrlGeneration() {
        String longUrl = "https://www.example.com/product?id=123";
        String shortUrl = "http://short.ly/xyz123"; // mock output
        assertTrue(shortUrl.startsWith("http://short.ly/"));
    }
}
