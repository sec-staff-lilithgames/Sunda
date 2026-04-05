package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2M {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C2M(C2L c2l) {
        byte[] bArrCopyOf;
        C3M.A08((c2l.A04 && c2l.A00 == null) ? false : true);
        this.A05 = (UUID) C3M.A01(c2l.A03);
        this.A06 = this.A05;
        this.A00 = c2l.A00;
        this.A04 = c2l.A02;
        this.A03 = c2l.A02;
        this.A08 = c2l.A05;
        this.A07 = c2l.A04;
        this.A09 = c2l.A06;
        this.A02 = c2l.A01;
        this.A01 = c2l.A01;
        if (c2l.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c2l.A07, c2l.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2M)) {
            return false;
        }
        C2M c2m = (C2M) obj;
        if (this.A05.equals(c2m.A05) && AbstractC09264a.A1E(this.A00, c2m.A00) && AbstractC09264a.A1E(this.A03, c2m.A03) && this.A08 == c2m.A08 && this.A07 == c2m.A07 && this.A09 == c2m.A09 && this.A01.equals(c2m.A01) && Arrays.equals(this.A0A, c2m.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
