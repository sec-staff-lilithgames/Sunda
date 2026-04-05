package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.facebook.ads.redexgen.X.jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2310jg extends GQ {
    public C2310jg(C4R c4r, long j10, long j11) {
        super(new C2409lU(), new C2311jh(c4r), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i10) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
