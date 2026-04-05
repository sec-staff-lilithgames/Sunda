package de;

import android.media.MediaDrm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class k0 implements MediaDrm.OnExpirationUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52147b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.f52146a = i10;
        this.f52147b = obj;
    }

    @Override // android.media.MediaDrm.OnExpirationUpdateListener
    public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
        switch (this.f52146a) {
            case 0:
                ((com.google.android.exoplayer2.drm.f) this.f52147b).getClass();
                throw null;
            default:
                ((sn.m0) this.f52147b).getClass();
                throw null;
        }
    }
}
