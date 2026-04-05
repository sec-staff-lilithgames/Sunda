package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f29983a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.u f29984b;

    public a(y yVar, mk.u uVar) {
        this.f29983a = yVar;
        this.f29984b = uVar;
    }

    @Override // com.google.gson.k0
    public Collection<Object> read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Collection<Object> collection = (Collection) this.f29984b.construct();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            collection.add(this.f29983a.read(jsonReader));
        }
        jsonReader.endArray();
        return collection;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Collection<Object> collection) throws IOException {
        if (collection == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            this.f29983a.write(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
