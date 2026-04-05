package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2647pf {
    public final InterfaceC2652pk A00;
    public final String A01;
    public final Collection<C2661pu> A02;
    public final Collection<C2661pu> A03;
    public final List<Rect> A04;

    public C2647pf(String str, InterfaceC2652pk interfaceC2652pk, List<Rect> rects, Collection<C2661pu> collection, Collection<C2661pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2652pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
