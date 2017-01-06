package com.genetree.engine.parsers;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;

public class JSONParser {

    public static <T> T fromJSON(final TypeReference<T> type, final String json) {
        T data = null;
        try {
            data = new ObjectMapper().readValue(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String toJSON(Object object) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            return ow.writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
