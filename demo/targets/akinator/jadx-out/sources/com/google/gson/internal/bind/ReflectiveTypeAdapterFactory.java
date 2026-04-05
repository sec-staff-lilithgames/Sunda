package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import j1.o2;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final mk.b f29940b;

    /* renamed from: c, reason: collision with root package name */
    public final FieldNamingStrategy f29941c;

    /* renamed from: e, reason: collision with root package name */
    public final Excluder f29942e;

    /* renamed from: f, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f29943f;

    /* renamed from: g, reason: collision with root package name */
    public final List f29944g;

    public ReflectiveTypeAdapterFactory(mk.b bVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<com.google.gson.b0> list) {
        this.f29940b = bVar;
        this.f29941c = fieldNamingStrategy;
        this.f29942e = excluder;
        this.f29943f = jsonAdapterAnnotationTypeAdapterFactory;
        this.f29944g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(AccessibleObject accessibleObject, Object obj) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!mk.a0.canAccess(accessibleObject, obj)) {
            throw new com.google.gson.r(o2.l(ok.c.getAccessibleObjectDescription(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ok.c.fieldToString(field) + " and " + ok.c.fieldToString(field2) + "\nSee " + mk.e0.createUrl("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.v c(com.google.gson.Gson r29, pk.a r30, java.lang.Class r31, boolean r32, boolean r33) throws java.lang.SecurityException, com.google.gson.r {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.Gson, pk.a, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.v");
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ok.c.isAnonymousOrNonStaticLocal(rawType)) {
            return new r();
        }
        com.google.gson.a0 filterResult = mk.a0.getFilterResult(this.f29944g, rawType);
        if (filterResult != com.google.gson.a0.f29912e) {
            boolean z10 = filterResult == com.google.gson.a0.f29911c;
            return ok.c.isRecord(rawType) ? new w(rawType, c(gson, aVar, rawType, z10, true), z10) : new u(this.f29940b.get(aVar, true), c(gson, aVar, rawType, z10, false));
        }
        throw new com.google.gson.r("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
