package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public URI read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            String strNextString = jsonReader.nextString();
            if (strNextString.equals(AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return new URI(strNextString);
        } catch (URISyntaxException e10) {
            throw new com.google.gson.r(e10);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, URI uri) throws IOException {
        jsonWriter.value(uri == null ? null : uri.toASCIIString());
    }
}
