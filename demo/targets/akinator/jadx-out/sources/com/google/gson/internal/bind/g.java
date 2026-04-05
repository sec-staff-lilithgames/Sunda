package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f29995a = new g();

    private g() {
    }

    public static com.google.gson.q a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = f.f29994a[jsonToken.ordinal()];
        if (i10 == 3) {
            return new com.google.gson.v(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new com.google.gson.v(new mk.j(jsonReader.nextString()));
        }
        if (i10 == 5) {
            return new com.google.gson.v(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return com.google.gson.s.f30067b;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    public static com.google.gson.q b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = f.f29994a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new com.google.gson.p();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new com.google.gson.t();
    }

    @Override // com.google.gson.k0
    public com.google.gson.q read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof j) {
            j jVar = (j) jsonReader;
            JsonToken jsonTokenPeek = jVar.peek();
            if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
                com.google.gson.q qVar = (com.google.gson.q) jVar.h();
                jVar.skipValue();
                return qVar;
            }
            throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
        }
        JsonToken jsonTokenPeek2 = jsonReader.peek();
        com.google.gson.q qVarB = b(jsonReader, jsonTokenPeek2);
        if (qVarB == null) {
            return a(jsonReader, jsonTokenPeek2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = qVarB instanceof com.google.gson.t ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek3 = jsonReader.peek();
                com.google.gson.q qVarB2 = b(jsonReader, jsonTokenPeek3);
                boolean z10 = qVarB2 != null;
                if (qVarB2 == null) {
                    qVarB2 = a(jsonReader, jsonTokenPeek3);
                }
                if (qVarB instanceof com.google.gson.p) {
                    ((com.google.gson.p) qVarB).add(qVarB2);
                } else {
                    ((com.google.gson.t) qVarB).add(strNextName, qVarB2);
                }
                if (z10) {
                    arrayDeque.addLast(qVarB);
                    qVarB = qVarB2;
                }
            } else {
                if (qVarB instanceof com.google.gson.p) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return qVarB;
                }
                qVarB = (com.google.gson.q) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, com.google.gson.q qVar) throws IOException {
        if (qVar == null || qVar.isJsonNull()) {
            jsonWriter.nullValue();
            return;
        }
        if (qVar.isJsonPrimitive()) {
            com.google.gson.v asJsonPrimitive = qVar.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                jsonWriter.value(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                jsonWriter.value(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                jsonWriter.value(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (qVar.isJsonArray()) {
            jsonWriter.beginArray();
            Iterator<com.google.gson.q> it = qVar.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!qVar.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + qVar.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, com.google.gson.q> entry : qVar.getAsJsonObject().entrySet()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
