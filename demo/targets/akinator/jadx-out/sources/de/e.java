package de;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.b f52124a;

    public e(com.google.android.exoplayer2.drm.b bVar) {
        this.f52124a = bVar;
    }

    @Override // de.c0
    public void onEvent(com.google.android.exoplayer2.drm.e eVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
        ((f) com.google.android.exoplayer2.util.a.checkNotNull(this.f52124a.f27432y)).obtainMessage(i10, bArr).sendToTarget();
    }
}
