package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10167m {
    public static final C10167m A03;
    public final String A00;
    public final C10157l A01;
    public final Object A02;

    static {
        C10167m c10167m;
        if (AbstractC09264a.A02 < 31) {
            c10167m = new C10167m("");
        } else {
            c10167m = new C10167m(C10157l.A01, "");
        }
        A03 = c10167m;
    }

    public C10167m(C10157l c10157l, String str) {
        this.A01 = c10157l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C10167m(String str) {
        C3M.A08(AbstractC09264a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C10157l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10167m)) {
            return false;
        }
        C10167m c10167m = (C10167m) obj;
        if (Objects.equals(this.A00, c10167m.A00) && Objects.equals(this.A01, c10167m.A01) && Objects.equals(this.A02, c10167m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
