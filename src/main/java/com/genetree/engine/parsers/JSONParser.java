package com.genetree.engine.parsers;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class JSONParser {

    public static <T> T fromJSON(final String json, final Class<T> clazz) {
        T result = null;
        try {
            result = new ObjectMapper().readValue(json, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String toJSON(Object object) {
        String result = "";
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            result = ow.writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
