package bf;

import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 implements l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9434f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final qf.o f9435a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f9436b;

    /* renamed from: c, reason: collision with root package name */
    public de.u f9437c;

    /* renamed from: d, reason: collision with root package name */
    public qf.o0 f9438d;

    /* renamed from: e, reason: collision with root package name */
    public int f9439e;

    public u0(qf.o oVar) {
        this(oVar, new ee.m());
    }

    @Override // bf.l0, bf.c0
    public int[] getSupportedTypes() {
        return new int[]{4};
    }

    @Override // bf.l0, bf.c0
    public /* bridge */ /* synthetic */ c0 setCmcdConfigurationFactory(qf.i iVar) {
        return super.setCmcdConfigurationFactory(iVar);
    }

    public u0 setContinueLoadingCheckIntervalBytes(int i10) {
        this.f9439e = i10;
        return this;
    }

    public u0(qf.o oVar, ee.u uVar) {
        this(oVar, new af.g(uVar, 4));
    }

    @Override // bf.l0, bf.c0
    public v0 createMediaSource(u1 u1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(u1Var.f28113c);
        return new v0(u1Var, this.f9435a, this.f9436b, this.f9437c.get(u1Var), this.f9438d, this.f9439e);
    }

    @Override // bf.l0, bf.c0
    public u0 setDrmSessionManagerProvider(de.u uVar) {
        this.f9437c = (de.u) com.google.android.exoplayer2.util.a.checkNotNull(uVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    @Override // bf.l0, bf.c0
    public u0 setLoadErrorHandlingPolicy(qf.o0 o0Var) {
        this.f9438d = (qf.o0) com.google.android.exoplayer2.util.a.checkNotNull(o0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        return this;
    }

    public u0(qf.o oVar, o0 o0Var) {
        this(oVar, o0Var, new de.k(), new qf.a0(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public u0(qf.o oVar, o0 o0Var, de.u uVar, qf.o0 o0Var2, int i10) {
        this.f9435a = oVar;
        this.f9436b = o0Var;
        this.f9437c = uVar;
        this.f9438d = o0Var2;
        this.f9439e = i10;
    }
}
