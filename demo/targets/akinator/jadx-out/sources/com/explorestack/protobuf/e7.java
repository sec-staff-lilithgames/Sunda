package com.explorestack.protobuf;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e7 implements d7 {

    /* renamed from: a, reason: collision with root package name */
    public final Method f22080a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22081b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22082c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22083d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22084e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f22085f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22086g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22087h;

    public e7(String str, Class cls, Class cls2, String str2, boolean z10, boolean z11) {
        Method methodAccess$1000 = k7.access$1000(cls, a.b.k("get", str), new Class[0]);
        this.f22080a = methodAccess$1000;
        this.f22081b = k7.access$1000(cls2, a.b.k("get", str), new Class[0]);
        this.f22082c = k7.access$1000(cls2, a.b.k("set", str), new Class[]{methodAccess$1000.getReturnType()});
        this.f22083d = z11 ? k7.access$1000(cls, a.b.k("has", str), new Class[0]) : null;
        this.f22084e = z11 ? k7.access$1000(cls2, a.b.k("has", str), new Class[0]) : null;
        this.f22085f = k7.access$1000(cls2, a.b.k("clear", str), new Class[0]);
        this.f22086g = z10 ? k7.access$1000(cls, a.b.l("get", str2, "Case"), new Class[0]) : null;
        this.f22087h = z10 ? k7.access$1000(cls2, a.b.l("get", str2, "Case"), new Class[0]) : null;
    }

    @Override // com.explorestack.protobuf.d7
    public void clear(o6 o6Var) {
        k7.access$1100(this.f22085f, o6Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.d7
    public Object get(k7 k7Var) {
        return k7.access$1100(this.f22080a, k7Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.d7
    public int getOneofFieldNumber(k7 k7Var) {
        return ((o7) k7.access$1100(this.f22086g, k7Var, new Object[0])).getNumber();
    }

    @Override // com.explorestack.protobuf.d7
    public boolean has(k7 k7Var) {
        return ((Boolean) k7.access$1100(this.f22083d, k7Var, new Object[0])).booleanValue();
    }

    @Override // com.explorestack.protobuf.d7
    public void set(o6 o6Var, Object obj) {
        k7.access$1100(this.f22082c, o6Var, new Object[]{obj});
    }

    @Override // com.explorestack.protobuf.d7
    public Object get(o6 o6Var) {
        return k7.access$1100(this.f22081b, o6Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.d7
    public int getOneofFieldNumber(o6 o6Var) {
        return ((o7) k7.access$1100(this.f22087h, o6Var, new Object[0])).getNumber();
    }

    @Override // com.explorestack.protobuf.d7
    public boolean has(o6 o6Var) {
        return ((Boolean) k7.access$1100(this.f22084e, o6Var, new Object[0])).booleanValue();
    }
}
