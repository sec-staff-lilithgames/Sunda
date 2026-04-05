package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a1 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public AtomicInteger read(JsonReader jsonReader) throws IOException {
        try {
            return new AtomicInteger(jsonReader.nextInt());
        } catch (NumberFormatException e10) {
            throw new com.google.gson.w(e10);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
        jsonWriter.value(atomicInteger.get());
    }
}
