package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f22271a;

    static {
        Class<i5> cls;
        try {
            cls = i5.class;
            i5 i5Var = i5.f22227i;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f22271a = cls;
    }

    public static m5 create() {
        m5 m5Var = null;
        Class cls = f22271a;
        if (cls != null) {
            try {
                m5Var = (m5) cls.getDeclaredMethod("newInstance", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return m5Var != null ? m5Var : new m5();
    }

    public static m5 createEmpty() {
        m5 m5Var = null;
        Class cls = f22271a;
        if (cls != null) {
            try {
                m5Var = (m5) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return m5Var != null ? m5Var : m5.f22373d;
    }
}
