package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public mk.j read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return new mk.j(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, mk.j jVar) throws IOException {
        jsonWriter.value(jVar);
    }
}
