package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Class read(JsonReader jsonReader) throws IOException {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + mk.e0.createUrl("java-lang-class-unsupported"));
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Class cls) throws IOException {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + mk.e0.createUrl("java-lang-class-unsupported"));
    }
}
