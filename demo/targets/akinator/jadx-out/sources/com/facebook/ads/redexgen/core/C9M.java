package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9M implements AnonymousClass39 {
    public final C9J A00;
    public final C2495mt A01;
    public final AnonymousClass38[] A02;

    public C9M(AnonymousClass38... anonymousClass38Arr) {
        this(anonymousClass38Arr, new C9J(), new C2495mt());
    }

    public C9M(AnonymousClass38[] anonymousClass38Arr, C9J c9j, C2495mt c2495mt) {
        this.A02 = new AnonymousClass38[anonymousClass38Arr.length + 2];
        System.arraycopy(anonymousClass38Arr, 0, this.A02, 0, anonymousClass38Arr.length);
        this.A00 = c9j;
        this.A01 = c2495mt;
        this.A02[anonymousClass38Arr.length] = c9j;
        this.A02[anonymousClass38Arr.length + 1] = c2495mt;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass39
    public final C2598ob A47(C2598ob c2598ob) {
        this.A01.A02(c2598ob.A01);
        this.A01.A01(c2598ob.A00);
        return c2598ob;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass39
    public final boolean A48(boolean z10) {
        this.A00.A0D(z10);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass39
    public final AnonymousClass38[] A6r() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass39
    public final long A8M(long j10) {
        return this.A01.A00(j10);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass39
    public final long A90() {
        return this.A00.A0C();
    }
}
