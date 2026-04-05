package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends com.google.gson.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.l0 f29990d = new com.google.gson.l0() { // from class: com.google.gson.internal.bind.EnumTypeAdapter$1
        @Override // com.google.gson.l0
        public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new e(rawType);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f29991a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f29992b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29993c = new HashMap();

    public e(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                lk.c cVar = (lk.c) field2.getAnnotation(lk.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f29991a.put(str, r42);
                    }
                }
                this.f29991a.put(strName, r42);
                this.f29992b.put(string, r42);
                this.f29993c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.k0
    public Enum<Object> read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        Enum<Object> r02 = (Enum) this.f29991a.get(strNextString);
        return r02 == null ? (Enum) this.f29992b.get(strNextString) : r02;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Enum<Object> r32) throws IOException {
        jsonWriter.value(r32 == null ? null : (String) this.f29993c.get(r32));
    }
}
