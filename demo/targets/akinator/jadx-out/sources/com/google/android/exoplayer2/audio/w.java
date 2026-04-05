package com.google.android.exoplayer2.audio;

import io.odeeo.internal.d.g;
import io.odeeo.internal.r0.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27311c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f27313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27314g;

    public /* synthetic */ w(Object obj, String str, long j10, long j11, int i10) {
        this.f27310b = i10;
        this.f27314g = obj;
        this.f27311c = str;
        this.f27312e = j10;
        this.f27313f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27310b) {
            case 0:
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(((a0) this.f27314g).f27047b))).onAudioDecoderInitialized(this.f27311c, this.f27312e, this.f27313f);
                break;
            case 1:
                ((l.a) this.f27314g).a(this.f27311c, this.f27312e, this.f27313f);
                break;
            case 2:
                ((io.bidmachine.media3.exoplayer.j0) ((io.g0) io.bidmachine.media3.common.util.a1.castNonNull(((io.f0) this.f27314g).f62123b))).onVideoDecoderInitialized(this.f27311c, this.f27312e, this.f27313f);
                break;
            case 3:
                ((io.bidmachine.media3.exoplayer.j0) ((io.bidmachine.media3.exoplayer.audio.o) io.bidmachine.media3.common.util.a1.castNonNull(((io.bidmachine.media3.exoplayer.audio.n) this.f27314g).f60991b))).onAudioDecoderInitialized(this.f27311c, this.f27312e, this.f27313f);
                break;
            case 4:
                ((g.a) this.f27314g).a(this.f27311c, this.f27312e, this.f27313f);
                break;
            default:
                ((com.google.android.exoplayer2.p0) ((sf.w) com.google.android.exoplayer2.util.n1.castNonNull(((sf.v) this.f27314g).f85733b))).onVideoDecoderInitialized(this.f27311c, this.f27312e, this.f27313f);
                break;
        }
    }
}
