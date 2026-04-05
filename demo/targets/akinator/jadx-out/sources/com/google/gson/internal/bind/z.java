package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            try {
                arrayList.add(Integer.valueOf(jsonReader.nextInt()));
            } catch (NumberFormatException e10) {
                throw new com.google.gson.w(e10);
            }
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
        jsonWriter.beginArray();
        int length = atomicIntegerArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            jsonWriter.value(atomicIntegerArray.get(i10));
        }
        jsonWriter.endArray();
    }
}
