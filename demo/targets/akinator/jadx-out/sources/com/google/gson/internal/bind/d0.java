package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Character read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        if (strNextString.length() == 1) {
            return Character.valueOf(strNextString.charAt(0));
        }
        StringBuilder sbO = e3.g.o("Expecting character, got: ", strNextString, "; at ");
        sbO.append(jsonReader.getPreviousPath());
        throw new com.google.gson.w(sbO.toString());
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Character ch2) throws IOException {
        jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
    }
}
