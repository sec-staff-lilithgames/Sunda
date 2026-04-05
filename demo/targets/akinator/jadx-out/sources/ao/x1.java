package ao;

import android.net.Uri;
import ln.m;
import mh.v2;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final ln.m f7894h;

    /* renamed from: i, reason: collision with root package name */
    public final ln.h f7895i;

    /* renamed from: j, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f7896j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7897k;

    /* renamed from: l, reason: collision with root package name */
    public final go.t f7898l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7899m;

    /* renamed from: n, reason: collision with root package name */
    public final t1 f7900n;

    /* renamed from: o, reason: collision with root package name */
    public final gn.p0 f7901o;

    /* renamed from: p, reason: collision with root package name */
    public final v2 f7902p;

    /* renamed from: q, reason: collision with root package name */
    public ln.g0 f7903q;

    public x1(String str, gn.o0 o0Var, ln.h hVar, long j10, go.t tVar, boolean z10, Object obj, f1 f1Var) {
        this.f7895i = hVar;
        this.f7897k = j10;
        this.f7898l = tVar;
        this.f7899m = z10;
        gn.p0 p0VarBuild = new gn.c0().setUri(Uri.EMPTY).setMediaId(o0Var.f58038a.toString()).setSubtitleConfigurations(b5.of(o0Var)).setTag(obj).build();
        this.f7901o = p0VarBuild;
        gn.w label = new gn.w().setSampleMimeType((String) mh.g1.firstNonNull(o0Var.f58039b, "text/x-unknown")).setLanguage(o0Var.f58040c).setSelectionFlags(o0Var.f58041d).setRoleFlags(o0Var.f58042e).setLabel(o0Var.f58043f);
        String str2 = o0Var.f58044g;
        this.f7896j = label.setId(str2 != null ? str2 : str).build();
        this.f7894h = new m.a().setUri(o0Var.f58038a).setFlags(1).build();
        this.f7900n = new t1(j10, true, false, false, (Object) null, p0VarBuild);
        this.f7902p = f1Var;
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(gn.p0 p0Var) {
        return super.canUpdateMediaItem(p0Var);
    }

    @Override // ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        ln.g0 g0Var = this.f7903q;
        r0 r0VarA = a(k0Var);
        v2 v2Var = this.f7902p;
        return new v1(this.f7894h, this.f7895i, g0Var, this.f7896j, this.f7897k, this.f7898l, r0VarA, this.f7899m, v2Var != null ? (ho.b) v2Var.get() : null);
    }

    @Override // ao.a
    public final void e(ln.g0 g0Var) {
        this.f7903q = g0Var;
        f(this.f7900n);
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public gn.p0 getMediaItem() {
        return this.f7901o;
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        ((v1) i0Var).release();
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ void updateMediaItem(gn.p0 p0Var) {
        super.updateMediaItem(p0Var);
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // ao.a
    public final void releaseSourceInternal() {
    }
}
