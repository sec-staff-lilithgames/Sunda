package com.google.android.exoplayer2.audio;

import com.inmobi.media.U4;
import com.ironsource.C3162cb;
import io.odeeo.internal.d.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27325c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27326e;

    public /* synthetic */ y(Object obj, long j10, int i10) {
        this.f27324b = i10;
        this.f27326e = obj;
        this.f27325c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27324b) {
            case 0:
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(((a0) this.f27326e).f27047b))).onAudioPositionAdvancing(this.f27325c);
                break;
            case 1:
                C3162cb.a((C3162cb) this.f27326e, this.f27325c);
                break;
            case 2:
                ((io.bidmachine.media3.exoplayer.j0) ((io.bidmachine.media3.exoplayer.audio.o) io.bidmachine.media3.common.util.a1.castNonNull(((io.bidmachine.media3.exoplayer.audio.n) this.f27326e).f60991b))).onAudioPositionAdvancing(this.f27325c);
                break;
            case 3:
                ((g.a) this.f27326e).a(this.f27325c);
                break;
            default:
                U4.a((U4) this.f27326e, this.f27325c);
                break;
        }
    }
}
