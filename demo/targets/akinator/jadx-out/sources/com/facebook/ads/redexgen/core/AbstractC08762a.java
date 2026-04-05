package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08762a {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC08762a(AbstractC08762a abstractC08762a) {
        this.A04 = abstractC08762a.A04;
        this.A00 = abstractC08762a.A00;
        this.A01 = abstractC08762a.A01;
        this.A03 = abstractC08762a.A03;
        this.A02 = abstractC08762a.A02;
    }

    public AbstractC08762a(Object obj) {
        this(obj, -1L);
    }

    public AbstractC08762a(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public AbstractC08762a(Object obj, int i10, int i11, long j10, int i12) {
        this.A04 = obj;
        this.A00 = i10;
        this.A01 = i11;
        this.A03 = j10;
        this.A02 = i12;
    }

    public AbstractC08762a(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC08762a)) {
            return false;
        }
        AbstractC08762a abstractC08762a = (AbstractC08762a) obj;
        return this.A04.equals(abstractC08762a.A04) && this.A00 == abstractC08762a.A00 && this.A01 == abstractC08762a.A01 && this.A03 == abstractC08762a.A03 && this.A02 == abstractC08762a.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
