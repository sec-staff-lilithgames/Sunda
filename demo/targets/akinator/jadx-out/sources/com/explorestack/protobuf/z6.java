package com.explorestack.protobuf;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z6 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Method f22952a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22953b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22954c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22955d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22956e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f22957f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22958g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22959h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f22960i;

    public z6(String str, Class cls, Class cls2) {
        this.f22952a = k7.access$1000(cls, a.b.l("get", str, "List"), new Class[0]);
        this.f22953b = k7.access$1000(cls2, a.b.l("get", str, "List"), new Class[0]);
        String strK = a.b.k("get", str);
        Class cls3 = Integer.TYPE;
        Method methodAccess$1000 = k7.access$1000(cls, strK, new Class[]{cls3});
        this.f22954c = methodAccess$1000;
        this.f22955d = k7.access$1000(cls2, a.b.k("get", str), new Class[]{cls3});
        Class<?> returnType = methodAccess$1000.getReturnType();
        this.f22956e = k7.access$1000(cls2, a.b.k("set", str), new Class[]{cls3, returnType});
        this.f22957f = k7.access$1000(cls2, a.b.k(ProductAction.ACTION_ADD, str), new Class[]{returnType});
        this.f22958g = k7.access$1000(cls, a.b.l("get", str, "Count"), new Class[0]);
        this.f22959h = k7.access$1000(cls2, a.b.l("get", str, "Count"), new Class[0]);
        this.f22960i = k7.access$1000(cls2, a.b.k("clear", str), new Class[0]);
    }

    @Override // com.explorestack.protobuf.y6
    public void addRepeated(o6 o6Var, Object obj) {
        k7.access$1100(this.f22957f, o6Var, new Object[]{obj});
    }

    @Override // com.explorestack.protobuf.y6
    public void clear(o6 o6Var) {
        k7.access$1100(this.f22960i, o6Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.y6
    public Object get(k7 k7Var) {
        return k7.access$1100(this.f22952a, k7Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.y6
    public Object getRepeated(k7 k7Var, int i10) {
        return k7.access$1100(this.f22954c, k7Var, new Object[]{Integer.valueOf(i10)});
    }

    @Override // com.explorestack.protobuf.y6
    public int getRepeatedCount(k7 k7Var) {
        return ((Integer) k7.access$1100(this.f22958g, k7Var, new Object[0])).intValue();
    }

    @Override // com.explorestack.protobuf.y6
    public void setRepeated(o6 o6Var, int i10, Object obj) {
        k7.access$1100(this.f22956e, o6Var, new Object[]{Integer.valueOf(i10), obj});
    }

    @Override // com.explorestack.protobuf.y6
    public Object get(o6 o6Var) {
        return k7.access$1100(this.f22953b, o6Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.y6
    public Object getRepeated(o6 o6Var, int i10) {
        return k7.access$1100(this.f22955d, o6Var, new Object[]{Integer.valueOf(i10)});
    }

    @Override // com.explorestack.protobuf.y6
    public int getRepeatedCount(o6 o6Var) {
        return ((Integer) k7.access$1100(this.f22959h, o6Var, new Object[0])).intValue();
    }
}
