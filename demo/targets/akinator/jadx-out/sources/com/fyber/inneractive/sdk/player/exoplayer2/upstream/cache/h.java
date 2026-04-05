package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f25892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25893b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet f25894c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    public long f25895d;

    public h(int i10, String str, long j10) {
        this.f25892a = i10;
        this.f25893b = str;
        this.f25895d = j10;
    }

    public final m a(long j10) {
        m mVar = new m(this.f25893b, j10, -1L, C.TIME_UNSET, null);
        m mVar2 = (m) this.f25894c.floor(mVar);
        if (mVar2 != null && mVar2.f25887b + mVar2.f25888c > j10) {
            return mVar2;
        }
        m mVar3 = (m) this.f25894c.ceiling(mVar);
        return mVar3 == null ? new m(this.f25893b, j10, -1L, C.TIME_UNSET, null) : new m(this.f25893b, j10, mVar3.f25887b - j10, C.TIME_UNSET, null);
    }
}
