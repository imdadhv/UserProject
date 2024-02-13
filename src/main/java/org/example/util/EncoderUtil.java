package org.example.util;

import javax.naming.directory.BasicAttribute;
import java.util.Base64;

public class EncoderUtil {
    private static final Base64.Encoder encoder = Base64.getEncoder();
    private static final Base64.Decoder decoder = Base64.getDecoder();

    public static byte[] encode(String password) {
        return encoder.encode(password.getBytes());
    }

    public static byte[] decode(String password) {
        return decoder.decode(password.getBytes());
    }
}
