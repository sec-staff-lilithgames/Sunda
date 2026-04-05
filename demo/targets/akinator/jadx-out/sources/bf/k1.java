package bf;

import android.net.Uri;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.t1;
import com.google.android.exoplayer2.u1;
import nh.b5;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final qf.t f9300h;

    /* renamed from: i, reason: collision with root package name */
    public final qf.o f9301i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.z0 f9302j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9303k;

    /* renamed from: l, reason: collision with root package name */
    public final qf.o0 f9304l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9305m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f9306n;

    /* renamed from: o, reason: collision with root package name */
    public final u1 f9307o;

    /* renamed from: p, reason: collision with root package name */
    public qf.c1 f9308p;

    public k1(String str, t1 t1Var, qf.o oVar, long j10, qf.o0 o0Var, boolean z10, Object obj) {
        this.f9301i = oVar;
        this.f9303k = j10;
        this.f9304l = o0Var;
        this.f9305m = z10;
        u1 u1VarBuild = new com.google.android.exoplayer2.h1().setUri(Uri.EMPTY).setMediaId(t1Var.f28047b.toString()).setSubtitleConfigurations(b5.of(t1Var)).setTag(obj).build();
        this.f9307o = u1VarBuild;
        com.google.android.exoplayer2.y0 label = new com.google.android.exoplayer2.y0().setSampleMimeType((String) mh.g1.firstNonNull(t1Var.f28048c, "text/x-unknown")).setLanguage(t1Var.f28049e).setSelectionFlags(t1Var.f28050f).setRoleFlags(t1Var.f28051g).setLabel(t1Var.f28052h);
        String str2 = t1Var.f28053i;
        this.f9302j = label.setId(str2 != null ? str2 : str).build();
        this.f9300h = new t.a().setUri(t1Var.f28047b).setFlags(1).build();
        this.f9306n = new g1(j10, true, false, false, (Object) null, u1VarBuild);
    }

    @Override // bf.a
    public final void c(qf.c1 c1Var) {
        this.f9308p = c1Var;
        d(this.f9306n);
    }

    @Override // bf.a, bf.f0
    public a0 createPeriod(d0 d0Var, qf.c cVar, long j10) {
        return new i1(this.f9300h, this.f9301i, this.f9308p, this.f9302j, this.f9303k, this.f9304l, this.f9162c.withParameters(0, d0Var), this.f9305m);
    }

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ m3 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // bf.a, bf.f0
    public u1 getMediaItem() {
        return this.f9307o;
    }

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        ((i1) a0Var).release();
    }

    @Override // bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // bf.a
    public final void releaseSourceInternal() {
    }
}
