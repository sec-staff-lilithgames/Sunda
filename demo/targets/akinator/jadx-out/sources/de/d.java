package de;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f52119d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52121f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f52116a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public UUID f52117b = com.google.android.exoplayer2.j.f27537d;

    /* renamed from: c, reason: collision with root package name */
    public f0 f52118c = com.google.android.exoplayer2.drm.f.f27433d;

    /* renamed from: g, reason: collision with root package name */
    public qf.o0 f52122g = new qf.a0();

    /* renamed from: e, reason: collision with root package name */
    public int[] f52120e = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public long f52123h = 300000;

    public com.google.android.exoplayer2.drm.b build(p0 p0Var) {
        return new com.google.android.exoplayer2.drm.b(this.f52117b, this.f52118c, p0Var, this.f52116a, this.f52119d, this.f52120e, this.f52121f, this.f52122g, this.f52123h);
    }

    public d setKeyRequestParameters(Map<String, String> map) {
        HashMap map2 = this.f52116a;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
        return this;
    }

    public d setLoadErrorHandlingPolicy(qf.o0 o0Var) {
        this.f52122g = (qf.o0) com.google.android.exoplayer2.util.a.checkNotNull(o0Var);
        return this;
    }

    public d setMultiSession(boolean z10) {
        this.f52119d = z10;
        return this;
    }

    public d setPlayClearSamplesWithoutKeys(boolean z10) {
        this.f52121f = z10;
        return this;
    }

    public d setSessionKeepaliveMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0 || j10 == C.TIME_UNSET);
        this.f52123h = j10;
        return this;
    }

    public d setUseDrmSessionsForClearContent(int... iArr) {
        for (int i10 : iArr) {
            boolean z10 = true;
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            }
            com.google.android.exoplayer2.util.a.checkArgument(z10);
        }
        this.f52120e = (int[]) iArr.clone();
        return this;
    }

    public d setUuidAndExoMediaDrmProvider(UUID uuid, f0 f0Var) {
        this.f52117b = (UUID) com.google.android.exoplayer2.util.a.checkNotNull(uuid);
        this.f52118c = (f0) com.google.android.exoplayer2.util.a.checkNotNull(f0Var);
        return this;
    }
}
