package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f60957c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f60958e;

    public /* synthetic */ k(n nVar, Exception exc, int i10) {
        this.f60956b = i10;
        this.f60957c = nVar;
        this.f60958e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60956b) {
            case 0:
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(this.f60957c.f60991b))).onAudioSinkError(this.f60958e);
                break;
            default:
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(this.f60957c.f60991b))).onAudioCodecError(this.f60958e);
                break;
        }
    }
}
