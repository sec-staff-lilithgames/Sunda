package de;

import android.media.MediaDrm;
import io.odeeo.internal.f.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements MediaDrm.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52150c;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.f52148a = i10;
        this.f52149b = obj;
        this.f52150c = obj2;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        switch (this.f52148a) {
            case 0:
                com.google.android.exoplayer2.drm.f fVar = (com.google.android.exoplayer2.drm.f) this.f52149b;
                c0 c0Var = (c0) this.f52150c;
                fVar.getClass();
                ((e) c0Var).onEvent(fVar, bArr, i10, i11, bArr2);
                break;
            case 1:
                ((io.odeeo.internal.f.o) this.f52149b).a((m.d) this.f52150c, mediaDrm, bArr, i10, i11, bArr2);
                break;
            default:
                sn.m0 m0Var = (sn.m0) this.f52149b;
                sn.d0 d0Var = (sn.d0) this.f52150c;
                m0Var.getClass();
                ((sn.f) d0Var).onEvent(m0Var, bArr, i10, i11, bArr2);
                break;
        }
    }
}
