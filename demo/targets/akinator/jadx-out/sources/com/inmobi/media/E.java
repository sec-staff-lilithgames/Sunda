package com.inmobi.media;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        H4 h42 = (H4) obj2;
        H4 h43 = (H4) obj;
        return xu.d.compareValues(Integer.valueOf(h42.f31837c * h42.f31838d), Integer.valueOf(h43.f31837c * h43.f31838d));
    }
}
