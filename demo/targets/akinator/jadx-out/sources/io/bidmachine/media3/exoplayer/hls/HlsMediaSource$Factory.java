package io.bidmachine.media3.exoplayer.hls;

import ao.u0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.p0;
import go.g;
import go.p;
import go.t;
import hp.q;
import io.bidmachine.media3.common.util.a;
import java.util.List;
import sn.m;
import sn.v;
import sn.w;
import tn.c;
import tn.h;
import tn.i;
import tn.n;
import vn.b;
import vn.d;
import vn.e;
import vn.k;
import vn.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class HlsMediaSource$Factory implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f61221a;

    /* renamed from: b, reason: collision with root package name */
    public i f61222b;

    /* renamed from: c, reason: collision with root package name */
    public q f61223c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f61224d;

    /* renamed from: e, reason: collision with root package name */
    public int f61225e;

    /* renamed from: f, reason: collision with root package name */
    public k f61226f;

    /* renamed from: g, reason: collision with root package name */
    public l f61227g;

    /* renamed from: h, reason: collision with root package name */
    public ao.l f61228h;

    /* renamed from: i, reason: collision with root package name */
    public w f61229i;

    /* renamed from: j, reason: collision with root package name */
    public t f61230j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f61231k;

    /* renamed from: l, reason: collision with root package name */
    public int f61232l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f61233m;

    /* renamed from: n, reason: collision with root package name */
    public final long f61234n;

    /* renamed from: o, reason: collision with root package name */
    public long f61235o;

    public HlsMediaSource$Factory(ln.h hVar) {
        this(new c(hVar));
    }

    @Override // ao.u0, ao.j0
    public int[] getSupportedTypes() {
        return new int[]{2};
    }

    public HlsMediaSource$Factory setAllowChunklessPreparation(boolean z10) {
        this.f61231k = z10;
        return this;
    }

    public HlsMediaSource$Factory setCompositeSequenceableLoaderFactory(ao.l lVar) {
        this.f61228h = (ao.l) a.checkNotNull(lVar, "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    public HlsMediaSource$Factory setExtractorFactory(i iVar) {
        this.f61222b = iVar;
        return this;
    }

    public HlsMediaSource$Factory setMetadataType(int i10) {
        this.f61232l = i10;
        return this;
    }

    public HlsMediaSource$Factory setPlaylistParserFactory(k kVar) {
        this.f61226f = (k) a.checkNotNull(kVar, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    public HlsMediaSource$Factory setPlaylistTrackerFactory(l lVar) {
        this.f61227g = (l) a.checkNotNull(lVar, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
        return this;
    }

    public HlsMediaSource$Factory setTimestampAdjusterInitializationTimeoutMs(long j10) {
        this.f61235o = j10;
        return this;
    }

    public HlsMediaSource$Factory setUseSessionKeys(boolean z10) {
        this.f61233m = z10;
        return this;
    }

    public HlsMediaSource$Factory(h hVar) {
        this.f61221a = (h) a.checkNotNull(hVar);
        this.f61229i = new m();
        this.f61226f = new vn.a();
        this.f61227g = d.f89336s;
        this.f61230j = new p();
        this.f61228h = new ao.m();
        this.f61232l = 1;
        this.f61234n = C.TIME_UNSET;
        this.f61231k = true;
        experimentalParseSubtitlesDuringExtraction(true);
    }

    @Override // ao.u0, ao.j0
    public n createMediaSource(p0 p0Var) {
        a.checkNotNull(p0Var.f58053b);
        if (this.f61222b == null) {
            this.f61222b = new tn.d();
        }
        q qVar = this.f61223c;
        if (qVar != null) {
            this.f61222b.setSubtitleParserFactory(qVar);
        }
        this.f61222b.experimentalParseSubtitlesDuringExtraction(this.f61224d);
        this.f61222b.experimentalSetCodecsToParseWithinGopSampleDependencies(this.f61225e);
        i iVar = this.f61222b;
        k eVar = this.f61226f;
        List list = p0Var.f58053b.f57967e;
        if (!list.isEmpty()) {
            eVar = new e(eVar, list);
        }
        ao.l lVar = this.f61228h;
        v vVar = this.f61229i.get(p0Var);
        t tVar = this.f61230j;
        ((b) this.f61227g).getClass();
        return new n(p0Var, this.f61221a, iVar, lVar, vVar, tVar, new d(this.f61221a, tVar, eVar, null), this.f61234n, this.f61231k, this.f61232l, this.f61233m, this.f61235o);
    }

    @Override // ao.u0, ao.j0
    @Deprecated
    public HlsMediaSource$Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f61224d = z10;
        return this;
    }

    @Override // ao.u0, ao.j0
    public HlsMediaSource$Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        this.f61225e = i10;
        return this;
    }

    @Override // ao.u0, ao.j0
    public HlsMediaSource$Factory setCmcdConfigurationFactory(g gVar) {
        if (a.checkNotNull(gVar) == null) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // ao.u0, ao.j0
    public HlsMediaSource$Factory setDrmSessionManagerProvider(w wVar) {
        this.f61229i = (w) a.checkNotNull(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // ao.u0, ao.j0
    public HlsMediaSource$Factory setLoadErrorHandlingPolicy(t tVar) {
        this.f61230j = (t) a.checkNotNull(tVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // ao.u0, ao.j0
    public HlsMediaSource$Factory setSubtitleParserFactory(q qVar) {
        this.f61223c = qVar;
        return this;
    }
}
