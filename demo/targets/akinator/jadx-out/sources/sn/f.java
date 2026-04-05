package sn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f85978a;

    public f(l lVar) {
        this.f85978a = lVar;
    }

    @Override // sn.d0
    public void onEvent(i0 i0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
        ((g) io.bidmachine.media3.common.util.a.checkNotNull(this.f85978a.f86015y)).obtainMessage(i10, bArr).sendToTarget();
    }
}
