package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p2 {

    /* renamed from: c, reason: collision with root package name */
    public static final p2 f26452c = new p2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26454b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final x1 f26453a = new x1();

    public final t2 a(Class cls) {
        t2 t2VarA;
        Class cls2;
        Charset charset = l1.f26429a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        t2 t2Var = (t2) this.f26454b.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        x1 x1Var = this.f26453a;
        x1Var.getClass();
        Class cls3 = u2.f26498a;
        if (!z0.class.isAssignableFrom(cls) && (cls2 = u2.f26498a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        r2 r2VarB = x1Var.f26533a.b(cls);
        if ((r2VarB.f26469d & 2) == 2) {
            if (z0.class.isAssignableFrom(cls)) {
                t2VarA = new j2(u2.f26501d, k0.f26423a, r2VarB.f26466a);
            } else {
                o3 o3Var = u2.f26499b;
                j0 j0Var = k0.f26424b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = new j2(o3Var, j0Var, r2VarB.f26466a);
            }
        } else if (z0.class.isAssignableFrom(cls)) {
            t2VarA = ((r2VarB.f26469d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2 ? i2.a(r2VarB, l2.f26432b, t1.f26486b, u2.f26501d, k0.f26423a, a2.f26345b) : i2.a(r2VarB, l2.f26432b, t1.f26486b, u2.f26501d, (j0) null, a2.f26345b);
        } else {
            if (((r2VarB.f26469d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2) {
                k2 k2Var = l2.f26431a;
                r1 r1Var = t1.f26485a;
                o3 o3Var2 = u2.f26499b;
                j0 j0Var2 = k0.f26424b;
                if (j0Var2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = i2.a(r2VarB, k2Var, r1Var, o3Var2, j0Var2, a2.f26344a);
            } else {
                t2VarA = i2.a(r2VarB, l2.f26431a, t1.f26485a, u2.f26500c, (j0) null, a2.f26344a);
            }
        }
        t2 t2Var2 = (t2) this.f26454b.putIfAbsent(cls, t2VarA);
        return t2Var2 != null ? t2Var2 : t2VarA;
    }
}
