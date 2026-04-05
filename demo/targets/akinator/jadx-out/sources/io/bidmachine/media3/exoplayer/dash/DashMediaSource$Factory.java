package io.bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import ao.l;
import ao.u0;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.c0;
import gn.p0;
import go.b0;
import go.g;
import go.p;
import go.t;
import hp.q;
import io.bidmachine.media3.exoplayer.dash.a;
import java.util.List;
import ln.h;
import pn.b;
import qn.c;
import qn.d;
import sn.m;
import sn.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DashMediaSource$Factory implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f61154a;

    /* renamed from: b, reason: collision with root package name */
    public final h f61155b;

    /* renamed from: c, reason: collision with root package name */
    public w f61156c;

    /* renamed from: d, reason: collision with root package name */
    public l f61157d;

    /* renamed from: e, reason: collision with root package name */
    public t f61158e;

    /* renamed from: f, reason: collision with root package name */
    public long f61159f;

    /* renamed from: g, reason: collision with root package name */
    public long f61160g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f61161h;

    public DashMediaSource$Factory(h hVar) {
        this(new a.C0584a(hVar), hVar);
    }

    @Override // ao.u0, ao.j0
    public int[] getSupportedTypes() {
        return new int[]{0};
    }

    public DashMediaSource$Factory setCompositeSequenceableLoaderFactory(l lVar) {
        this.f61157d = (l) io.bidmachine.media3.common.util.a.checkNotNull(lVar, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    public DashMediaSource$Factory setFallbackTargetLiveOffsetMs(long j10) {
        this.f61159f = j10;
        return this;
    }

    public DashMediaSource$Factory setManifestParser(b0 b0Var) {
        this.f61161h = b0Var;
        return this;
    }

    public DashMediaSource$Factory setMinLiveStartPositionUs(long j10) {
        this.f61160g = j10;
        return this;
    }

    public DashMediaSource$Factory(b bVar, h hVar) {
        this.f61154a = (b) io.bidmachine.media3.common.util.a.checkNotNull(bVar);
        this.f61155b = hVar;
        this.f61156c = new m();
        this.f61158e = new p();
        this.f61159f = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f61160g = 5000000L;
        this.f61157d = new ao.m();
        experimentalParseSubtitlesDuringExtraction(true);
    }

    public pn.p createMediaSource(c cVar) {
        return createMediaSource(cVar, new c0().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType(MimeTypes.APPLICATION_MPD).build());
    }

    @Override // ao.u0, ao.j0
    @Deprecated
    public DashMediaSource$Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f61154a.experimentalParseSubtitlesDuringExtraction(z10);
        return this;
    }

    @Override // ao.u0, ao.j0
    public DashMediaSource$Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        this.f61154a.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
        return this;
    }

    @Override // ao.u0, ao.j0
    public DashMediaSource$Factory setCmcdConfigurationFactory(g gVar) {
        if (io.bidmachine.media3.common.util.a.checkNotNull(gVar) == null) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // ao.u0, ao.j0
    public DashMediaSource$Factory setDrmSessionManagerProvider(w wVar) {
        this.f61156c = (w) io.bidmachine.media3.common.util.a.checkNotNull(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // ao.u0, ao.j0
    public DashMediaSource$Factory setLoadErrorHandlingPolicy(t tVar) {
        this.f61158e = (t) io.bidmachine.media3.common.util.a.checkNotNull(tVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // ao.u0, ao.j0
    public DashMediaSource$Factory setSubtitleParserFactory(q qVar) {
        this.f61154a.setSubtitleParserFactory((q) io.bidmachine.media3.common.util.a.checkNotNull(qVar));
        return this;
    }

    public pn.p createMediaSource(c cVar, p0 p0Var) {
        io.bidmachine.media3.common.util.a.checkArgument(!cVar.f83308d);
        c0 mimeType = p0Var.buildUpon().setMimeType(MimeTypes.APPLICATION_MPD);
        if (p0Var.f58053b == null) {
            mimeType.setUri(Uri.EMPTY);
        }
        p0 p0VarBuild = mimeType.build();
        return new pn.p(p0VarBuild, cVar, null, null, this.f61154a, this.f61157d, this.f61156c.get(p0VarBuild), this.f61158e, this.f61159f, this.f61160g);
    }

    @Override // ao.u0, ao.j0
    public pn.p createMediaSource(p0 p0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b);
        b0 dVar = this.f61161h;
        if (dVar == null) {
            dVar = new d();
        }
        List list = p0Var.f58053b.f57967e;
        return new pn.p(p0Var, null, this.f61155b, !list.isEmpty() ? new zn.q(dVar, list) : dVar, this.f61154a, this.f61157d, this.f61156c.get(p0Var), this.f61158e, this.f61159f, this.f61160g);
    }
}
