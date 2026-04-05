package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2269iz implements InterfaceC09454t {
    public InterfaceC1364Ln A02;
    public long A01 = 5242880;
    public int A00 = CacheDataSink.DEFAULT_BUFFER_SIZE;

    public final C2269iz A00(InterfaceC1364Ln interfaceC1364Ln) {
        this.A02 = interfaceC1364Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09454t
    public final C2268iy A59() {
        return new C2268iy((InterfaceC1364Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
