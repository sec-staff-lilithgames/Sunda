package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q extends com.google.gson.k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.l0 f30016c = new ObjectTypeAdapter$1(com.google.gson.h0.f29919b);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f30017a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.i0 f30018b;

    public q(Gson gson, com.google.gson.i0 i0Var) {
        this.f30017a = gson;
        this.f30018b = i0Var;
    }

    public static Serializable b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = p.f30015a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new mk.r();
    }

    public static com.google.gson.l0 getFactory(com.google.gson.i0 i0Var) {
        return i0Var == com.google.gson.h0.f29919b ? f30016c : new ObjectTypeAdapter$1(i0Var);
    }

    public final Serializable a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = p.f30015a[jsonToken.ordinal()];
        if (i10 == 3) {
            return jsonReader.nextString();
        }
        if (i10 == 4) {
            return this.f30018b.readNumber(jsonReader);
        }
        if (i10 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objB = b(jsonReader, jsonTokenPeek);
        if (objB == null) {
            return a(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objB instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Serializable serializableB = b(jsonReader, jsonTokenPeek2);
                boolean z10 = serializableB != null;
                if (serializableB == null) {
                    serializableB = a(jsonReader, jsonTokenPeek2);
                }
                if (objB instanceof List) {
                    ((List) objB).add(serializableB);
                } else {
                    ((Map) objB).put(strNextName, serializableB);
                }
                if (z10) {
                    arrayDeque.addLast(objB);
                    objB = serializableB;
                }
            } else {
                if (objB instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objB;
                }
                objB = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.google.gson.k0 adapter = this.f30017a.getAdapter(obj.getClass());
        if (!(adapter instanceof q)) {
            adapter.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }
}
