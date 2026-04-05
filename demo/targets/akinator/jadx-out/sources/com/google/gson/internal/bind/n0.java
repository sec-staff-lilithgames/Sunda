package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.InetAddress;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public InetAddress read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return InetAddress.getByName(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
        jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
