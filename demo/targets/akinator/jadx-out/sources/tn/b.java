package tn;

import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import ko.a0;
import ko.c0;
import ko.v0;
import ko.z;
import rp.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f87169f = new v0();

    /* renamed from: a, reason: collision with root package name */
    public final z f87170a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f87171b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f87172c;

    /* renamed from: d, reason: collision with root package name */
    public final hp.q f87173d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87174e;

    public b(z zVar, io.bidmachine.media3.common.b bVar, u0 u0Var) {
        this(zVar, bVar, u0Var, hp.q.f59124a, false);
    }

    @Override // tn.k
    public void init(c0 c0Var) {
        this.f87170a.init(c0Var);
    }

    @Override // tn.k
    public boolean isPackedAudioExtractor() {
        z underlyingImplementation = this.f87170a.getUnderlyingImplementation();
        return (underlyingImplementation instanceof rp.e) || (underlyingImplementation instanceof rp.a) || (underlyingImplementation instanceof rp.c) || (underlyingImplementation instanceof dp.d);
    }

    @Override // tn.k
    public boolean isReusable() {
        z underlyingImplementation = this.f87170a.getUnderlyingImplementation();
        return (underlyingImplementation instanceof i0) || (underlyingImplementation instanceof ep.s);
    }

    @Override // tn.k
    public void onTruncatedSegmentParsed() {
        this.f87170a.seek(0L, 0L);
    }

    @Override // tn.k
    public boolean read(a0 a0Var) throws IOException {
        return this.f87170a.read(a0Var, f87169f) == 0;
    }

    @Override // tn.k
    public k recreate() {
        z dVar;
        io.bidmachine.media3.common.util.a.checkState(!isReusable());
        z zVar = this.f87170a;
        io.bidmachine.media3.common.util.a.checkState(zVar.getUnderlyingImplementation() == zVar, "Can't recreate wrapped extractors. Outer type: " + zVar.getClass());
        if (zVar instanceof w) {
            dVar = new w(this.f87171b.f60654d, this.f87172c, this.f87173d, this.f87174e);
        } else if (zVar instanceof rp.e) {
            dVar = new rp.e();
        } else if (zVar instanceof rp.a) {
            dVar = new rp.a();
        } else if (zVar instanceof rp.c) {
            dVar = new rp.c();
        } else {
            if (!(zVar instanceof dp.d)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(zVar.getClass().getSimpleName()));
            }
            dVar = new dp.d();
        }
        return new b(dVar, this.f87171b, this.f87172c, this.f87173d, this.f87174e);
    }

    public b(z zVar, io.bidmachine.media3.common.b bVar, u0 u0Var, hp.q qVar, boolean z10) {
        this.f87170a = zVar;
        this.f87171b = bVar;
        this.f87172c = u0Var;
        this.f87173d = qVar;
        this.f87174e = z10;
    }
}
