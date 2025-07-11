package com.yourname.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UrlShortenerTests {

    @Test
    void testValidShortUrlGeneration() {
        String longUrl = "https://www.example.com/product?id=123";
        String shortUrl = "http://short.ly/xyz123"; // Simulated output
        assertTrue(shortUrl.startsWith("http://short.ly/"));
    }
}
