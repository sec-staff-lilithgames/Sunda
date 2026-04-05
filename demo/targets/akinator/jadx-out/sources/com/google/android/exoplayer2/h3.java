package com.google.android.exoplayer2;

import com.google.android.exoplayer2.StreamVolumeManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class h3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27517b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27518c;

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27517b;
        Object obj = this.f27518c;
        switch (i10) {
            case 0:
                int i11 = StreamVolumeManager.VolumeChangeReceiver.f27024b;
                ((StreamVolumeManager) obj).b();
                return;
            default:
                try {
                    u0.b((u2) obj);
                    return;
                } catch (r e10) {
                    com.google.android.exoplayer2.util.f0.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
        }
    }
}
