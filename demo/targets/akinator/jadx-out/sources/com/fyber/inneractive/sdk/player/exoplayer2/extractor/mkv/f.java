package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f24967a = new n(8);

    /* renamed from: b, reason: collision with root package name */
    public int f24968b;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i10 = 0;
        bVar.a(this.f24967a.f26042a, 0, 1, false);
        int i11 = this.f24967a.f26042a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        bVar.a(this.f24967a.f26042a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f24967a.f26042a[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f24968b = i13 + 1 + this.f24968b;
        return i14;
    }
}
