package com.explorestack.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ia {

    /* renamed from: c, reason: collision with root package name */
    public static final ia f22237c = new ia();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22239b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final o8 f22238a = new o8();

    public static ia getInstance() {
        return f22237c;
    }

    public <T> void makeImmutable(T t10) {
        schemaFor((ia) t10).makeImmutable(t10);
    }

    public <T> void mergeFrom(T t10, la laVar) throws IOException {
        mergeFrom(t10, laVar, m5.getEmptyRegistry());
    }

    public ua registerSchema(Class<?> cls, ua uaVar) {
        x7.a(cls, "messageType");
        x7.a(uaVar, "schema");
        return (ua) this.f22239b.putIfAbsent(cls, uaVar);
    }

    public ua registerSchemaOverride(Class<?> cls, ua uaVar) {
        x7.a(cls, "messageType");
        x7.a(uaVar, "schema");
        return (ua) this.f22239b.put(cls, uaVar);
    }

    public <T> ua schemaFor(Class<T> cls) {
        ua uaVarRegisterSchema;
        x7.a(cls, "messageType");
        ua uaVarCreateSchema = (ua) this.f22239b.get(cls);
        return (uaVarCreateSchema != null || (uaVarRegisterSchema = registerSchema(cls, (uaVarCreateSchema = this.f22238a.createSchema(cls)))) == null) ? uaVarCreateSchema : uaVarRegisterSchema;
    }

    public <T> void writeTo(T t10, kd kdVar) throws IOException {
        schemaFor((ia) t10).writeTo(t10, kdVar);
    }

    public <T> void mergeFrom(T t10, la laVar, m5 m5Var) throws IOException {
        schemaFor((ia) t10).mergeFrom(t10, laVar, m5Var);
    }

    public <T> ua schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
