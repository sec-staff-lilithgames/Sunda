package bf;

import bf.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements ee.u, qe.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.z0 f9312b;

    public /* synthetic */ m(com.google.android.exoplayer2.z0 z0Var) {
        this.f9312b = z0Var;
    }

    @Override // ee.u
    public ee.p[] createExtractors() {
        ef.m mVar = ef.n.f54323a;
        com.google.android.exoplayer2.z0 z0Var = this.f9312b;
        return new ee.p[]{mVar.supportsFormat(z0Var) ? new ef.o(mVar.createDecoder(z0Var), z0Var) : new o.b(z0Var)};
    }

    @Override // qe.b0
    public int getScore(Object obj) {
        return ((qe.r) obj).isFormatFunctionallySupported(this.f9312b) ? 1 : 0;
    }
}
