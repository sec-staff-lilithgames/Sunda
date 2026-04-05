package ao;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.concurrent.Executor;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g1 implements u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7672h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ln.h f7673a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f7674b;

    /* renamed from: c, reason: collision with root package name */
    public sn.w f7675c;

    /* renamed from: d, reason: collision with root package name */
    public go.t f7676d;

    /* renamed from: e, reason: collision with root package name */
    public int f7677e;

    /* renamed from: f, reason: collision with root package name */
    public f1 f7678f;

    /* renamed from: g, reason: collision with root package name */
    public io.bidmachine.media3.common.b f7679g;

    public g1(ln.h hVar) {
        this(hVar, new ko.u());
    }

    @Override // ao.u0, ao.j0
    @Deprecated
    public /* bridge */ /* synthetic */ j0 experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return super.experimentalParseSubtitlesDuringExtraction(z10);
    }

    @Override // ao.u0, ao.j0
    public /* bridge */ /* synthetic */ j0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return super.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
    }

    @Override // ao.u0, ao.j0
    public int[] getSupportedTypes() {
        return new int[]{4};
    }

    @Override // ao.u0, ao.j0
    public /* bridge */ /* synthetic */ j0 setCmcdConfigurationFactory(go.g gVar) {
        return super.setCmcdConfigurationFactory(gVar);
    }

    public g1 setContinueLoadingCheckIntervalBytes(int i10) {
        this.f7677e = i10;
        return this;
    }

    public <T extends Executor> g1 setDownloadExecutor(v2 v2Var, io.bidmachine.media3.common.util.k kVar) {
        this.f7678f = new f1(v2Var, kVar, 0);
        return this;
    }

    @Override // ao.u0, ao.j0
    public /* bridge */ /* synthetic */ j0 setSubtitleParserFactory(hp.q qVar) {
        return super.setSubtitleParserFactory(qVar);
    }

    public g1(ln.h hVar, ko.e0 e0Var) {
        this(hVar, new af.g(e0Var, 2));
    }

    @Override // ao.u0, ao.j0
    public i1 createMediaSource(gn.p0 p0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b);
        return new i1(p0Var, this.f7673a, this.f7674b, this.f7675c.get(p0Var), this.f7676d, this.f7677e, this.f7679g, this.f7678f);
    }

    @Override // ao.u0, ao.j0
    public g1 setDrmSessionManagerProvider(sn.w wVar) {
        this.f7675c = (sn.w) io.bidmachine.media3.common.util.a.checkNotNull(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // ao.u0, ao.j0
    public g1 setLoadErrorHandlingPolicy(go.t tVar) {
        this.f7676d = (go.t) io.bidmachine.media3.common.util.a.checkNotNull(tVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    public g1(ln.h hVar, y0 y0Var) {
        this(hVar, y0Var, new sn.m(), new go.p(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public g1(ln.h hVar, y0 y0Var, sn.w wVar, go.t tVar, int i10) {
        this.f7673a = hVar;
        this.f7674b = y0Var;
        this.f7675c = wVar;
        this.f7676d = tVar;
        this.f7677e = i10;
    }
}
