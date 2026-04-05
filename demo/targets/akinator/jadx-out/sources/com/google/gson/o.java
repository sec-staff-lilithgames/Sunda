package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f30065a;

    public o(k0 k0Var) {
        this.f30065a = k0Var;
    }

    @Override // com.google.gson.k0
    public AtomicLongArray read(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.f30065a.read(jsonReader)).longValue()));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        jsonWriter.beginArray();
        int length = atomicLongArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f30065a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
        }
        jsonWriter.endArray();
    }
}
