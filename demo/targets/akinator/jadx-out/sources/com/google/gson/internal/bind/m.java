package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f30008a;

    /* renamed from: b, reason: collision with root package name */
    public final y f30009b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.u f30010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapTypeAdapterFactory f30011d;

    public m(MapTypeAdapterFactory mapTypeAdapterFactory, y yVar, y yVar2, mk.u uVar) {
        this.f30011d = mapTypeAdapterFactory;
        this.f30008a = yVar;
        this.f30009b = yVar2;
        this.f30010c = uVar;
    }

    @Override // com.google.gson.k0
    public Map<Object, Object> read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Map<Object, Object> map = (Map) this.f30010c.construct();
        if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                mk.i.INSTANCE.promoteNameToValue(jsonReader);
                Object obj = this.f30008a.read(jsonReader);
                if (map.put(obj, this.f30009b.read(jsonReader)) != null) {
                    throw new com.google.gson.w(o2.j(obj, "duplicate key: "));
                }
            }
            jsonReader.endObject();
            return map;
        }
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginArray();
            Object obj2 = this.f30008a.read(jsonReader);
            if (map.put(obj2, this.f30009b.read(jsonReader)) != null) {
                throw new com.google.gson.w(o2.j(obj2, "duplicate key: "));
            }
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return map;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Map<Object, Object> map) throws IOException {
        String asString;
        if (map == null) {
            jsonWriter.nullValue();
            return;
        }
        boolean z10 = this.f30011d.f29937c;
        y yVar = this.f30009b;
        if (!z10) {
            jsonWriter.beginObject();
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                yVar.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i10 = 0;
        boolean z11 = false;
        for (Map.Entry<Object, Object> entry2 : map.entrySet()) {
            com.google.gson.q jsonTree = this.f30008a.toJsonTree(entry2.getKey());
            arrayList.add(jsonTree);
            arrayList2.add(entry2.getValue());
            z11 |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
        }
        if (z11) {
            jsonWriter.beginArray();
            int size = arrayList.size();
            while (i10 < size) {
                jsonWriter.beginArray();
                mk.d0.write((com.google.gson.q) arrayList.get(i10), jsonWriter);
                yVar.write(jsonWriter, arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        int size2 = arrayList.size();
        while (i10 < size2) {
            com.google.gson.q qVar = (com.google.gson.q) arrayList.get(i10);
            if (qVar.isJsonPrimitive()) {
                com.google.gson.v asJsonPrimitive = qVar.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    asString = String.valueOf(asJsonPrimitive.getAsNumber());
                } else if (asJsonPrimitive.isBoolean()) {
                    asString = Boolean.toString(asJsonPrimitive.getAsBoolean());
                } else {
                    if (!asJsonPrimitive.isString()) {
                        throw new AssertionError();
                    }
                    asString = asJsonPrimitive.getAsString();
                }
            } else {
                if (!qVar.isJsonNull()) {
                    throw new AssertionError();
                }
                asString = AbstractJsonLexerKt.NULL;
            }
            jsonWriter.name(asString);
            yVar.write(jsonWriter, arrayList2.get(i10));
            i10++;
        }
        jsonWriter.endObject();
    }
}
