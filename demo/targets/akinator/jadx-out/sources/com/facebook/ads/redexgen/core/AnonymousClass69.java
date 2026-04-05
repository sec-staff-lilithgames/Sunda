package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.69, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass69 implements Comparable<AnonymousClass69> {
    public int A00;
    public long A01;
    public Object A02;
    public final AnonymousClass71 A03;

    public AnonymousClass69(AnonymousClass71 anonymousClass71) {
        this.A03 = anonymousClass71;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AnonymousClass69 anonymousClass69) {
        if ((this.A02 == null) != (anonymousClass69.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i10 = this.A00 - anonymousClass69.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = AbstractC09264a.A08(this.A01, anonymousClass69.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
