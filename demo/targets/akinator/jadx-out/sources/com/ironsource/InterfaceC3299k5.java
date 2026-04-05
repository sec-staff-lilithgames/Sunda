package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3299k5<T> extends Pc {
    void b(C8 c82);

    String c();

    InterfaceC3139b6 d();

    kv.l i();

    default boolean j() {
        return k().exists();
    }

    C8 k();

    C7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            kv.l lVarI = i();
            int i10 = tu.z.f87419c;
            lVarI.invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(tu.a0.createFailure(e10))));
        }
    }
}
