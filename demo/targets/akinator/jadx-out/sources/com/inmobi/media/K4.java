package com.inmobi.media;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class K4 {

    /* renamed from: a, reason: collision with root package name */
    public final C2711c2 f31943a;

    public K4(String b64feature) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b64feature, "b64feature");
        C2711c2 c2711c2 = new C2711c2();
        this.f31943a = c2711c2;
        c2711c2.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f31943a.f32700a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
