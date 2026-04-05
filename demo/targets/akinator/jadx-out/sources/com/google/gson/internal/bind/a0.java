package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Number read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return Long.valueOf(jsonReader.nextLong());
        } catch (NumberFormatException e10) {
            throw new com.google.gson.w(e10);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(number.longValue());
        }
    }
}
