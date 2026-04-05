package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class t extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f30028a;

    public t(v vVar) {
        this.f30028a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, JsonReader jsonReader, s sVar);

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Object objA = a();
        Map map = this.f30028a.f30034a;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                s sVar = (s) map.get(jsonReader.nextName());
                if (sVar == null) {
                    jsonReader.skipValue();
                } else {
                    c(objA, jsonReader, sVar);
                }
            }
            jsonReader.endObject();
            return b(objA);
        } catch (IllegalAccessException e10) {
            throw ok.c.createExceptionForUnexpectedIllegalAccess(e10);
        } catch (IllegalStateException e11) {
            throw new com.google.gson.w(e11);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        try {
            Iterator it = this.f30028a.f30035b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(jsonWriter, obj);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException e10) {
            throw ok.c.createExceptionForUnexpectedIllegalAccess(e10);
        }
    }
}
