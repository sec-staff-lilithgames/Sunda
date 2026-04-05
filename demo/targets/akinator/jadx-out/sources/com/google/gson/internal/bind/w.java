package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w extends t {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f30036e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f30037b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f30038c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f30039d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f30036e = map;
    }

    public w(Class cls, v vVar, boolean z10) throws SecurityException, com.google.gson.r {
        super(vVar);
        this.f30039d = new HashMap();
        Constructor canonicalRecordConstructor = ok.c.getCanonicalRecordConstructor(cls);
        this.f30037b = canonicalRecordConstructor;
        if (z10) {
            ReflectiveTypeAdapterFactory.a(canonicalRecordConstructor, null);
        } else {
            ok.c.makeAccessible(canonicalRecordConstructor);
        }
        String[] recordComponentNames = ok.c.getRecordComponentNames(cls);
        for (int i10 = 0; i10 < recordComponentNames.length; i10++) {
            this.f30039d.put(recordComponentNames[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f30037b.getParameterTypes();
        this.f30038c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f30038c[i11] = f30036e.get(parameterTypes[i11]);
        }
    }

    @Override // com.google.gson.internal.bind.t
    public final Object a() {
        return (Object[]) this.f30038c.clone();
    }

    @Override // com.google.gson.internal.bind.t
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f30037b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw ok.c.createExceptionForUnexpectedIllegalAccess(e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + ok.c.constructorToString(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + ok.c.constructorToString(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + ok.c.constructorToString(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override // com.google.gson.internal.bind.t
    public final void c(Object obj, JsonReader jsonReader, s sVar) throws IOException {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f30021c;
        Integer num = (Integer) this.f30039d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + ok.c.constructorToString(this.f30037b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object obj2 = sVar.f30025g.read(jsonReader);
        if (obj2 != null || !sVar.f30026h) {
            objArr[iIntValue] = obj2;
        } else {
            StringBuilder sbO = e3.g.o("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbO.append(jsonReader.getPath());
            throw new com.google.gson.u(sbO.toString());
        }
    }
}
