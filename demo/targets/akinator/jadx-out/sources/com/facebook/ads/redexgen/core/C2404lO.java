package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.lO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2404lO implements H1 {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ int AI5(AnonymousClass20 anonymousClass20, int i10, boolean z10) {
        return AbstractC1246Gy.A00(this, anonymousClass20, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ void AI7(C4J c4j, int i10) {
        AbstractC1246Gy.A01(this, c4j, i10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void A6W(C2614or c2614or) {
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final int AI6(AnonymousClass20 anonymousClass20, int i10, boolean z10, int i11) throws IOException {
        int bytesSkipped = anonymousClass20.read(this.A00, 0, Math.min(this.A00.length, i10));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AI8(C4J c4j, int i10, int i11) {
        c4j.A0g(i10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AIA(long j10, int i10, int i11, int i12, C1247Gz c1247Gz) {
    }

    @Override // com.facebook.ads.redexgen.core.H1
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AJu(Uri uri) {
    }
}
