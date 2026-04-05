package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2459mJ implements InterfaceC1135Cr, InterfaceC1136Cs {
    public final int A00;
    public final /* synthetic */ C9A A01;

    public C2459mJ(C9A c9a, int i10) {
        this.A01 = c9a;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1136Cs
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A81() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final boolean AAV() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final void ABs() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final int AGf(C6N c6n, C2536nY c2536nY, int i10) {
        return this.A01.A0Y(this.A00, c6n, c2536nY, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final int AJI(long j10) {
        return this.A01.A0X(this.A00, j10);
    }
}
