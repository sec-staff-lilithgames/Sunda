package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: c, reason: collision with root package name */
    public static final d3 f5851c = new d3();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5853b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h2 f5852a = new h2();

    public static d3 getInstance() {
        return f5851c;
    }

    public <T> void makeImmutable(T t10) {
        schemaFor((d3) t10).makeImmutable(t10);
    }

    public <T> void mergeFrom(T t10, g3 g3Var) throws IOException {
        mergeFrom(t10, g3Var, s0.getEmptyRegistry());
    }

    public m3 registerSchema(Class<?> cls, m3 m3Var) {
        t1.a(cls, "messageType");
        t1.a(m3Var, "schema");
        return (m3) this.f5853b.putIfAbsent(cls, m3Var);
    }

    public m3 registerSchemaOverride(Class<?> cls, m3 m3Var) {
        t1.a(cls, "messageType");
        t1.a(m3Var, "schema");
        return (m3) this.f5853b.put(cls, m3Var);
    }

    public <T> m3 schemaFor(Class<T> cls) {
        m3 m3VarRegisterSchema;
        t1.a(cls, "messageType");
        m3 m3VarCreateSchema = (m3) this.f5853b.get(cls);
        return (m3VarCreateSchema != null || (m3VarRegisterSchema = registerSchema(cls, (m3VarCreateSchema = this.f5852a.createSchema(cls)))) == null) ? m3VarCreateSchema : m3VarRegisterSchema;
    }

    public <T> void writeTo(T t10, v4 v4Var) throws IOException {
        schemaFor((d3) t10).writeTo(t10, v4Var);
    }

    public <T> void mergeFrom(T t10, g3 g3Var, s0 s0Var) throws IOException {
        schemaFor((d3) t10).mergeFrom(t10, g3Var, s0Var);
    }

    public <T> m3 schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
