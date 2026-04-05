package sn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f85973d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f85970a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public UUID f85971b = gn.l.f57987d;

    /* renamed from: c, reason: collision with root package name */
    public g0 f85972c = m0.f86022d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f85974e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f85975f = true;

    /* renamed from: g, reason: collision with root package name */
    public go.t f85976g = new go.p();

    /* renamed from: h, reason: collision with root package name */
    public long f85977h = 300000;

    public l build(p0 p0Var) {
        return new l(this.f85971b, this.f85972c, p0Var, this.f85970a, this.f85973d, this.f85974e, this.f85975f, this.f85976g, this.f85977h);
    }

    public e setKeyRequestParameters(Map<String, String> map) {
        HashMap map2 = this.f85970a;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
        return this;
    }

    public e setLoadErrorHandlingPolicy(go.t tVar) {
        this.f85976g = (go.t) io.bidmachine.media3.common.util.a.checkNotNull(tVar);
        return this;
    }

    public e setMultiSession(boolean z10) {
        this.f85973d = z10;
        return this;
    }

    public e setPlayClearSamplesWithoutKeys(boolean z10) {
        this.f85975f = z10;
        return this;
    }

    public e setSessionKeepaliveMs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 > 0 || j10 == C.TIME_UNSET);
        this.f85977h = j10;
        return this;
    }

    public e setUseDrmSessionsForClearContent(int... iArr) {
        for (int i10 : iArr) {
            boolean z10 = true;
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            }
            io.bidmachine.media3.common.util.a.checkArgument(z10);
        }
        this.f85974e = (int[]) iArr.clone();
        return this;
    }

    public e setUuidAndExoMediaDrmProvider(UUID uuid, g0 g0Var) {
        this.f85971b = (UUID) io.bidmachine.media3.common.util.a.checkNotNull(uuid);
        this.f85972c = (g0) io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        return this;
    }
}
