package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1284Il implements InterfaceC1721Zo {
    public final WeakReference<C5Q> A00;

    public C1284Il(C5Q c5q) {
        this.A00 = new WeakReference<>(c5q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1721Zo
    public final void ADT(C1720Zn c1720Zn) {
        C5Q c5q = this.A00.get();
        if (c5q != null) {
            c5q.A06 = c1720Zn.A00() != null;
            c5q.A02();
        }
    }
}
