package com.facebook.ads.redexgen.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.eY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2011eY {
    public float A00;
    public LF A01;
    public Map<String, String> A02;

    public C2011eY(LF lf2) {
        this(lf2, 0.0f);
    }

    public C2011eY(LF lf2, float f10) {
        this(lf2, f10, null);
    }

    public C2011eY(@Nullable LF lf2, float f10, Map<String, String> windowParams) {
        this.A01 = lf2;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final LF A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == LF.A0I;
    }
}
