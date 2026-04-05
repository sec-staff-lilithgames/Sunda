package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ArrayTypeAdapter extends com.google.gson.k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.l0 f29929c = new com.google.gson.l0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.l0
        public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = mk.g.getArrayComponentType(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(pk.a.get(arrayComponentType)), mk.g.getRawType(arrayComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f29930a;

    /* renamed from: b, reason: collision with root package name */
    public final y f29931b;

    public ArrayTypeAdapter(Gson gson, com.google.gson.k0 k0Var, Class<Object> cls) {
        this.f29931b = new y(gson, k0Var, cls);
        this.f29930a = cls;
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f29931b.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Class cls = this.f29930a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f29931b.write(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
